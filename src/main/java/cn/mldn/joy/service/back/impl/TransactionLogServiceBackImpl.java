package cn.mldn.joy.service.back.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.mldn.joy.dao.ITransactionLogDAO;
import cn.mldn.joy.service.back.ITransactionLogServiceBack;
import cn.mldn.joy.service.back.abs.AbstractServiceBack;
import cn.mldn.joy.vo.TransactionLogSearch;
@Component("transactionLogServiceBackImpl")
public class TransactionLogServiceBackImpl extends AbstractServiceBack implements ITransactionLogServiceBack {
	@Resource
	private ITransactionLogDAO transactionLogDAO;
	@Override
	public Map<String, Object> list(TransactionLogSearch vo) {
		Map<String, Object> map = new HashMap<String,Object>();
		if(vo!=null){
			vo = super.transform(vo);
			System.out.println("CurrentPage:"+vo.getCurrentPage());
			if(vo.getCurrentPage()==null||vo.getCurrentPage()<0){
				vo.setCurrentPage(1);
			}
			if(vo.getLineSize()==null||vo.getCurrentPage()<0){
				vo.setLineSize(5);
			}
			vo.setStart((vo.getCurrentPage()-1)*vo.getLineSize());
			System.out.println("要查询的数据是："+vo);
			map.put("allTransactionLogs", this.transactionLogDAO.findAll(vo));
			System.out.println("列表显示数据是："+this.transactionLogDAO.findAll(vo));
			map.put("transactionLogCount", this.transactionLogDAO.getAllCount(vo));
			map.put("allPaymentModes", this.transactionLogDAO.findAllPaymentMode());
			map.put("allPaymentChannels", this.transactionLogDAO.findAllPaymentChannel());
			map.put("allTransactionTypes", this.transactionLogDAO.findAllTransactionType());
		}
		return map;
	}

	@Override
	public Map<String, Object> listByFuzzy(TransactionLogSearch vo) {
		vo = super.transformFuzzy(vo);
		if(vo.getCurrentPage()==null||vo.getCurrentPage()<0){
			vo.setStart(0);
		}
		if(vo.getLineSize()==null||vo.getCurrentPage()<0){
			vo.setLineSize(5);
		}
		vo.setStart((vo.getCurrentPage()-1)*vo.getLineSize());
		System.out.println("要查询的数据是："+vo);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("allTransactionLogs", this.transactionLogDAO.findAll(vo));
		map.put("transactionLogCount", this.transactionLogDAO.getAllCount(vo));
		map.put("allPaymentModes", this.transactionLogDAO.findAllPaymentMode());
		map.put("allPaymentChannels", this.transactionLogDAO.findAllPaymentChannel());
		map.put("allTransactionTypes", this.transactionLogDAO.findAllTransactionType());
		return map;
	}

	@Override
	public Map<String, Object> getByCustomerOrderNum(String customerOrderNum) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("transactionLog", this.transactionLogDAO.findByCustomerOrderNum(customerOrderNum));
		return map;
	}

}
