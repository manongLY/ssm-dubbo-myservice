package cn.mldn.joy.service.back.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.mldn.joy.dao.ICustomerPaymentChannelDAO;
import cn.mldn.joy.service.back.ICustomerPaymentChannelServiceBack;
import cn.mldn.joy.service.back.abs.AbstractServiceBack;
import cn.mldn.joy.vo.CustomerPaymentChannel;

@Component("customerPaymentChannelServiceBackImpl")
public class CustomerPaymentChannelServiceBackImpl extends AbstractServiceBack 
			implements ICustomerPaymentChannelServiceBack{

	@Resource
	private ICustomerPaymentChannelDAO customerPaymentChannelDAO ;
	
	@Override
	public Map<String, Object> list() {
		Map<String,Object> map = new HashMap<String,Object>() ;
		map.put("allCustomerPaymentChannels", this.customerPaymentChannelDAO.findAll()) ;
		return map ;
	}

	@Override
	public boolean add(CustomerPaymentChannel vo) {
		return this.customerPaymentChannelDAO.doCreate(vo) ;
	}

	@Override
	public boolean removeById(String id) {
		return this.customerPaymentChannelDAO.doRemoveById(id) ;
	}

	@Override
	public Map<String, Object> listSplit(String paymentMode, String paymentChannelCode, int currentPage, int lineSize) {
		Map<String,Object> map = super.handleParams(null, null, currentPage, lineSize) ;
		if(paymentMode==null ||"".equals(paymentMode) || "null".equalsIgnoreCase(paymentMode)){
			
		}else{
			map.put("paymentMode", paymentMode) ;
		}
		if(paymentChannelCode == null || "".equals(paymentChannelCode) || "null".equalsIgnoreCase(paymentChannelCode)){
			
		}else{
			map.put("paymentChannelCode", paymentChannelCode) ;
		}
		Map<String,Object> result = new HashMap<String,Object>() ;
		result.put("allPaymentMode",this.customerPaymentChannelDAO.findAllPaymentMode()) ;
		result.put("allPaymentChannelCode", this.customerPaymentChannelDAO.findAllPaymentChannelCode()) ;
		result.put("allCustomerPaymentChannels", this.customerPaymentChannelDAO.findAllSplit(map)) ;
		result.put("customerPaymentChannelCount", this.customerPaymentChannelDAO.getAllCount(map)) ;
		return result;
	}

	@Override
	public boolean remove(Set<String> ids) {
		if(ids!=null&&ids.size()!=0){
			return this.customerPaymentChannelDAO.doRemoveBatch(ids.toArray()) ;
		}
		return false ;
	}

}
