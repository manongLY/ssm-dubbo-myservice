package cn.mldn.joy.vo;

import java.util.Date;

public class CooperatingCustomer {
	private String  ID ;
	private String  companyName ;
	private String  customerType ;
	private String  customerNum ;
	private String  customerKey ;
	private String  customerAccount ;
	private String  customerAccountID ;
	private String  paymentSynchronousURl ;
	private String  paymentAsynchronousURL ;
	private String  refundSynchronousURL ;
	private String  refundAsynchronousURL ;
	private Date    createdatetime ;
	private Date    updatetime ;
	private String  notifyMail ;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(String customerNum) {
		this.customerNum = customerNum;
	}
	public String getCustomerKey() {
		return customerKey;
	}
	public void setCustomerKey(String customerKey) {
		this.customerKey = customerKey;
	}
	public String getCustomerAccount() {
		return customerAccount;
	}
	public void setCustomerAccount(String customerAccount) {
		this.customerAccount = customerAccount;
	}
	public String getCustomerAccountID() {
		return customerAccountID;
	}
	public void setCustomerAccountID(String customerAccountID) {
		this.customerAccountID = customerAccountID;
	}
	public String getPaymentSynchronousURl() {
		return paymentSynchronousURl;
	}
	public void setPaymentSynchronousURl(String paymentSynchronousURl) {
		this.paymentSynchronousURl = paymentSynchronousURl;
	}
	public String getPaymentAsynchronousURL() {
		return paymentAsynchronousURL;
	}
	public void setPaymentAsynchronousURL(String paymentAsynchronousURL) {
		this.paymentAsynchronousURL = paymentAsynchronousURL;
	}
	public String getRefundSynchronousURL() {
		return refundSynchronousURL;
	}
	public void setRefundSynchronousURL(String refundSynchronousURL) {
		this.refundSynchronousURL = refundSynchronousURL;
	}
	public String getRefundAsynchronousURL() {
		return refundAsynchronousURL;
	}
	public void setRefundAsynchronousURL(String refundAsynchronousURL) {
		this.refundAsynchronousURL = refundAsynchronousURL;
	}
	public Date getCreatedatetime() {
		return createdatetime;
	}
	public void setCreatedatetime(Date createdatetime) {
		this.createdatetime = createdatetime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public String getNotifyMail() {
		return notifyMail;
	}
	public void setNotifyMail(String notifyMail) {
		this.notifyMail = notifyMail;
	}
	@Override
	public String toString() {
		return "CooperatingCustomer [ID=" + ID + ", companyName=" + companyName + ", customerType=" + customerType
				+ ", customerNum=" + customerNum + ", customerKey=" + customerKey + ", customerAccount="
				+ customerAccount + ", customerAccountID=" + customerAccountID + ", paymentSynchronousURl="
				+ paymentSynchronousURl + ", paymentAsynchronousURL=" + paymentAsynchronousURL
				+ ", refundSynchronousURL=" + refundSynchronousURL + ", refundAsynchronousURL=" + refundAsynchronousURL
				+ ", createdatetime=" + createdatetime + ", updatetime=" + updatetime + ", notifyMail=" + notifyMail
				+ "]\n";
	}
	
}
