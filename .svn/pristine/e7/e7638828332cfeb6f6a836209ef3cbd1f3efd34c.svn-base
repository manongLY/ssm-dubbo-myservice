package cn.mldn.joy.dao;

import java.util.List;
import java.util.Map;

import cn.mldn.joy.vo.PaymentSN;

public interface IPaymentSNDAO {
	public boolean doCreate(PaymentSN paymentSN) ;
	public List<PaymentSN> findAllSplit(Map<String,Object> param) ;
	public Integer getAllCount(Map<String,Object> param) ;
	public PaymentSN findByTransactionSN(String paymentTransactionNum) ;
	public PaymentSN findByPaymentPFOrderNum(String paymentPFOrderNum) ;
	public boolean doRemove(Object[] ids) ;
}
