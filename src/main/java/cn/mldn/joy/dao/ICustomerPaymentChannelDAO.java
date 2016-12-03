package cn.mldn.joy.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.mldn.joy.vo.CustomerPaymentChannel;

public interface ICustomerPaymentChannelDAO {
	public List<CustomerPaymentChannel> findAll() ;
	public boolean doCreate(CustomerPaymentChannel vo) ;
	public boolean doRemoveById(String id) ;
	
	public Set<String> findAllPaymentMode() ;
	public Set<String> findAllPaymentChannelCode() ;
	
	public Integer getAllCount(Map<String,Object> params) ;
	public List<CustomerPaymentChannel> findAllSplit(Map<String,Object> params) ;
	
	public boolean doRemoveBatch(Object[] ids) ;
	
}
