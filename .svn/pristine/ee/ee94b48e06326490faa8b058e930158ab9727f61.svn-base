package cn.mldn.joy.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.mldn.joy.vo.PaymentChannelDetail;

public interface IPaymentChannelDetailDAO {
	public List<PaymentChannelDetail> findAll() ;
	
	public List<PaymentChannelDetail> findAllByCustomerNum(String customerNum) ;
	
	public List<PaymentChannelDetail> findAllByPaymentChannel(String paymentChannel) ;
	
	public Integer getAllCount(Map<String,Object> params) ;
	public List<PaymentChannelDetail> findAllSplit(Map<String,Object> params) ;
	
	
	
	public Set<String> findAllCustomerNum() ;
	public Set<String> findAllPaymentChannel() ;
}
