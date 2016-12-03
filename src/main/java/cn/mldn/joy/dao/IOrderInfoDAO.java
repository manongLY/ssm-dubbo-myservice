package cn.mldn.joy.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.mldn.joy.vo.OrderInfo;

public interface IOrderInfoDAO {
	public boolean doCreate(OrderInfo orderInfo) ;
	public List<OrderInfo> findAllSplit(Map<String,Object> param) ;
	public Integer getAllCount(Map<String,Object> param) ;
	public OrderInfo findByPaymentPFOrderNum(String paymentPFOrderNum) ;
	public boolean doRemove(Object[] ids) ;
}
