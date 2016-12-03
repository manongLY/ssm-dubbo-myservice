package cn.mldn.joy.service.back.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.mldn.joy.dao.IPaymentChannelDetailDAO;
import cn.mldn.joy.service.back.IPaymentChannelDetailServiceBack;
import cn.mldn.joy.service.back.abs.AbstractServiceBack;

@Component("paymentChannelDetailServiceBackImpl")
public class PaymentChannelDetailServiceBackImpl extends AbstractServiceBack
							implements IPaymentChannelDetailServiceBack{

	@Resource
	private IPaymentChannelDetailDAO paymentChannelDetailDAO ;
	
	@Override
	public Map<String, Object> list() {
		Map<String,Object> map = new HashMap<String,Object>() ;
		System.out.println("--------------------");
		map.put("allPaymentChannelDetails", this.paymentChannelDetailDAO.findAll()) ;
		return map ;
	}

	@Override
	public Map<String, Object> listSplit(String customerNum, String paymentChannel, int currentPage, int lineSize) {
		Map<String,Object> map = super.handleParams(null, null, currentPage, lineSize) ;
		if(customerNum==null ||"".equals(customerNum) || "null".equalsIgnoreCase(customerNum)){
			
		}else{
			map.put("customerNum", customerNum) ;
		}
		if(paymentChannel == null || "".equals(paymentChannel) || "null".equalsIgnoreCase(paymentChannel)){
			
		}else{
			map.put("paymentChannel", paymentChannel) ;
		}
		
		Map<String,Object> result = new HashMap<String,Object>() ;
		result.put("allCustomerNum", this.paymentChannelDetailDAO.findAllCustomerNum()) ;
		result.put("allPaymentChannel",this.paymentChannelDetailDAO.findAllPaymentChannel()) ;
		result.put("allPaymentChannelDetails", this.paymentChannelDetailDAO.findAllSplit(map)) ;
		result.put("paymentChannelDetailCount",this.paymentChannelDetailDAO.getAllCount(map)) ;
		return result;
	}

}
