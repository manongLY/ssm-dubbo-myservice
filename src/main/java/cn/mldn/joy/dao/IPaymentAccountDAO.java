package cn.mldn.joy.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.mldn.joy.vo.PaymentAccount;

public interface IPaymentAccountDAO {
	public List<PaymentAccount> findAll() ;
	
	public PaymentAccount findById(String id) ;
	
	public boolean doCreate(PaymentAccount vo) ;
	
	public boolean doUpdate(PaymentAccount vo) ;
	
	public boolean doRemoveBatch(Object[] ids) ;
	
	public boolean doRemoveById(String id) ;
	
	public Set<String> findAllAccountType() ;
	public Set<String> findAllAccountState() ;
	
	public Integer getAllCount(Map<String,Object> params) ;
	public List<PaymentAccount> findAllSPlit(Map<String,Object> params) ;
}
