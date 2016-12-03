package cn.mldn.joy.service.back.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.joy.dao.IOrderInfoDAO;
import cn.mldn.joy.dao.IPaymentInfoDAO;
import cn.mldn.joy.dao.IPaymentSNDAO;
import cn.mldn.joy.dao.IReplyLogDAO;
import cn.mldn.joy.service.abs.AbstractService;
import cn.mldn.joy.service.back.IOrderServiceBack;
import cn.mldn.joy.vo.OrderInfo;
import cn.mldn.joy.vo.PaymentInfo;
import cn.mldn.joy.vo.PaymentSN;
import cn.mldn.joy.vo.ReplyLog;
@Service
public class OrderServiceBackImpl extends AbstractService implements IOrderServiceBack {
	@Resource
	private IOrderInfoDAO orderInfoDAO ; 
	@Resource
	private IPaymentInfoDAO paymentInfoDAO ; 
	@Resource
	private IPaymentSNDAO paymentSNDAO ; 
	@Resource
	private IReplyLogDAO replyLogDAO ; 
	@Override
	public boolean addOrder(OrderInfo orderInfo, PaymentInfo paymentInfo, PaymentSN paymentSN, ReplyLog reaplyLog) {
		boolean flag = false ;
		if(this.orderInfoDAO.doCreate(orderInfo)){
			if(this.paymentInfoDAO.doCreate(paymentInfo)){
				if(this.paymentSNDAO.doCreate(paymentSN)){
					flag = true ;
				}
			}
		}
		
		return flag;
	}

	@Override
	public Map<String, Object> listOrderInfo(Map<String, Object> param) {
		System.out.println(" OrderServiceBackImpl  listOrder  =====>  ");
		Map<String,Object> result = new HashMap<String, Object>() ;
		result.put("allRecorders",this.orderInfoDAO.getAllCount(param)) ;
		result.put("all",this.orderInfoDAO.findAllSplit(param)) ;
		return result;
	}

	@Override
	public Map<String, Object> showOrderInfo(String paymentPFOrderNum) {
		System.out.println(" OrderServiceBackImpl  showOrder  =====>  "+paymentPFOrderNum);
		
		Map<String,Object> result = new HashMap<String, Object>() ;
		result.put("vo",this.orderInfoDAO.findByPaymentPFOrderNum(paymentPFOrderNum));
		result.put("all", this.paymentSNDAO.findByPaymentPFOrderNum(paymentPFOrderNum)) ;
		System.out.println(" showOrderInfo vo "+this.orderInfoDAO.findByPaymentPFOrderNum(paymentPFOrderNum));
		System.out.println(" showOrderInfo all "+this.paymentSNDAO.findByPaymentPFOrderNum(paymentPFOrderNum));
		return result;
	}

	@Override
	public Map<String, Object> listOrderPay(Map<String, Object> param) {
		System.out.println(" OrderServiceBackImpl  listOrderPay  =====>  ");
		
		Map<String,Object> result = new HashMap<String, Object>() ;
		result.put("allRecorders",this.paymentSNDAO.getAllCount(param)) ;
		result.put("all",this.paymentSNDAO.findAllSplit(param)) ;
		
		return result;
	}

	@Override
	public Map<String, Object> showOrderPay(String transactionSN) {
		System.out.println(" OrderServiceBackImpl  showOrderPay  =====>  "+transactionSN);
		
		Map<String,Object> result = new HashMap<String, Object>() ;
		result.put("vo",this.paymentSNDAO.findByTransactionSN(transactionSN)) ;
		
		return result;
	}

	@Override
	public boolean remove(Set<String> ids) {
		boolean flag =false ;
		if (ids == null || ids.size() == 0) {
			return flag ;
		}
		if(this.orderInfoDAO.doRemove(ids.toArray())){
			if(this.paymentSNDAO.doRemove(ids.toArray())){
				flag = true ; 
			}
		}
		return flag ;
	}
	
}
