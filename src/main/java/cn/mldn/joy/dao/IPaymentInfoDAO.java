package cn.mldn.joy.dao;

import java.util.List;

import cn.mldn.joy.vo.PaymentInfo;

public interface IPaymentInfoDAO {
	public boolean doCreate(PaymentInfo paymentInfo) ;
	public List<PaymentInfo> findAllSplitByPaymentPFOrderNum(String paymentPFOrderNum) ;
}
