package cn.mldn.joy.service.back.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.mldn.joy.dao.IPaymentAccountDAO;
import cn.mldn.joy.service.back.IPaymentAccountServiceBack;
import cn.mldn.joy.service.back.abs.AbstractServiceBack;
import cn.mldn.joy.vo.PaymentAccount;

@Component("paymentAccountSerivceBackImpl")				// 与provider.xml文件中定义的名称一致
public class PaymentAccountServiceBackImpl extends AbstractServiceBack implements IPaymentAccountServiceBack{

	@Resource
	private IPaymentAccountDAO paymentAccountDAO ;
	
	@Override
	public Map<String, Object> list() {
		Map<String,Object> map = new HashMap<String,Object>() ;
		map.put("allPaymentAccounts", paymentAccountDAO.findAll()) ;
		return map ;
	}

	@Override
	public PaymentAccount get(String id) {
		System.out.println(this.paymentAccountDAO.findById(id));
		return this.paymentAccountDAO.findById(id) ;
	}

	@Override
	public boolean add(PaymentAccount vo) {
		return this.paymentAccountDAO.doCreate(vo) ;
	}

	@Override
	public boolean edit(PaymentAccount vo) {
		return this.paymentAccountDAO.doUpdate(vo) ;
	}

	@Override
	public boolean remove(Set<String> ids) {
		if(ids==null||ids.size()==0){
			return false;
		}
		return this.paymentAccountDAO.doRemoveBatch(ids.toArray()) ;
//		if(ids!=null && ids.size()!=0){
//			System.out.println("service进来了");
//			return this.paymentAccountDAO.doRemoveBatch(ids.toArray()) ;
//		}
//		System.out.println("service没进来");
//		return false ;
	}
	
	public boolean removeById(String id){
		System.out.println("service-------"+id);
		return this.paymentAccountDAO.doRemoveById(id) ;
	}

	@Override
	public Map<String, Object> listSplit(String name, String cellphone, String mail, String accountType,
			String accountState, int currentPage, int lineSize) {
		Map<String,Object> map = super.handleParams(null, null, currentPage, lineSize) ;
		if(name==null ||"".equals(name) || "null".equalsIgnoreCase(name)){
			
		}else{
			map.put("name", name) ;
		}
		if(cellphone == null || "".equals(cellphone) || "null".equalsIgnoreCase(cellphone)){
			
		}else{
			map.put("cellphone", cellphone) ;
		}
		if(accountState == null || "".equals(accountState) || "null".equalsIgnoreCase(accountState)){
			
		}else{
			map.put("accountState", accountState) ;
		}
		if(mail == null || "".equals(mail) || "null".equalsIgnoreCase(mail)){
			
		}else{
			map.put("mail", mail) ;
		}
		if(accountType == null || "".equals(accountType) || "null".equalsIgnoreCase(accountType)){
			
		}else{
			map.put("accountType", accountType) ;
		}
		Map<String,Object> result = new HashMap<String,Object>() ;
		result.put("allAccountType",this.paymentAccountDAO.findAllAccountType()) ;
		result.put("allAccountState", this.paymentAccountDAO.findAllAccountState()) ;
		result.put("allPaymentAccounts", this.paymentAccountDAO.findAllSPlit(map)) ;
		result.put("paymentAccountCount", this.paymentAccountDAO.getAllCount(map)) ;
		return result ;
	}

	@Override
	public Map<String, Object> listByFuzzy(String name, String cellphone, String mail, String accountType,
			String accountState, int currentPage, int lineSize) {
		Map<String,Object> map = super.handleParams(null, null, currentPage, lineSize) ;
		if(name==null ||"".equals(name) || "null".equalsIgnoreCase(name)){
			
		}else{
			map.put("name","%"+name+"%") ;
		}
		if(cellphone == null || "".equals(cellphone) || "null".equalsIgnoreCase(cellphone)){
			
		}else{
			map.put("cellphone", "%"+cellphone+"%") ;
		}
		if(accountState == null || "".equals(accountState) || "null".equalsIgnoreCase(accountState)){
			
		}else{
			map.put("accountState", "%"+accountState+"%") ;
		}
		if(mail == null || "".equals(mail) || "null".equalsIgnoreCase(mail)){
			
		}else{
			map.put("mail", "%"+mail+"%") ;
		}
		if(accountType == null || "".equals(accountType) || "null".equalsIgnoreCase(accountType)){
			
		}else{
			map.put("accountType", "%"+accountType+"%") ;
		}
		Map<String,Object> result = new HashMap<String,Object>() ;
		result.put("allAccountType",this.paymentAccountDAO.findAllAccountType()) ;
		result.put("allAccountState", this.paymentAccountDAO.findAllAccountState()) ;
		result.put("allPaymentAccounts", this.paymentAccountDAO.findAllSPlit(map)) ;
		result.put("paymentAccountCount", this.paymentAccountDAO.getAllCount(map)) ;
		return result ;
	}

}
