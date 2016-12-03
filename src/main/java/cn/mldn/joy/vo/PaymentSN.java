package cn.mldn.joy.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class PaymentSN implements Serializable{
	private String paymentTransactionNum ;
	private String paymentPFOrderNum ;
	private String customerOrderNum ;
	private String signature ;
	private String signatureData ;
	private String paymentChannel ;
	private String paymentMode ;
	private double paymentPrice ;
	private Date submitTime ;
	private double fee ;
	private String paymentServer ;
	private String paymentType ;
	private String buyerAccount ;
	private String thirdpartyTransactionNum ;
	private String transactionState ;
	private Date onboardTime ;
	private Date paymentTime ;
	private Date endTime ;
	private String customerAttr ;
	private String IVRnum ;
	private String remark ;
	private String asynchronousURL ;
	private String synchronousURL ;
	private double paymentMinus ;
	private String platformCustomerID ;
	private String customerPaymentChannelID ;
	private String cellphone ;
	private String username ;
	private Date transactionExpireTime ;
	private String transactionSource ;
	@Override
	public String toString() {
		return "PaymentSN [paymentTransactionNum=" + paymentTransactionNum + ", paymentPFOrderNum=" + paymentPFOrderNum
				+ ", customerOrderNum=" + customerOrderNum + ", signature=" + signature + ", signatureData="
				+ signatureData + ", paymentChannel=" + paymentChannel + ", paymentMode=" + paymentMode
				+ ", paymentPrice=" + paymentPrice + ", submitTime=" + submitTime + ", fee=" + fee + ", paymentServer="
				+ paymentServer + ", paymentType=" + paymentType + ", buyerAccount=" + buyerAccount
				+ ", thirdpartyTransactionNum=" + thirdpartyTransactionNum + ", transactionState=" + transactionState
				+ ", onboardTime=" + onboardTime + ", paymentTime=" + paymentTime + ", endTime=" + endTime
				+ ", customerAttr=" + customerAttr + ", IVRnum=" + IVRnum + ", remark=" + remark + ", asynchronousURL="
				+ asynchronousURL + ", synchronousURL=" + synchronousURL + ", paymentMinus=" + paymentMinus
				+ ", platformCustomerID=" + platformCustomerID + ", customerPaymentChannelID="
				+ customerPaymentChannelID + ", cellphone=" + cellphone + ", username=" + username
				+ ", transactionExpireTime=" + transactionExpireTime + ", transactionSource=" + transactionSource + "]\n";
	}
	public String getPaymentTransactionNum() {
		return paymentTransactionNum;
	}
	public void setPaymentTransactionNum(String paymentTransactionNum) {
		this.paymentTransactionNum = paymentTransactionNum;
	}
	public String getPaymentPFOrderNum() {
		return paymentPFOrderNum;
	}
	public void setPaymentPFOrderNum(String paymentPFOrderNum) {
		this.paymentPFOrderNum = paymentPFOrderNum;
	}
	public String getCustomerOrderNum() {
		return customerOrderNum;
	}
	public void setCustomerOrderNum(String customerOrderNum) {
		this.customerOrderNum = customerOrderNum;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getSignatureData() {
		return signatureData;
	}
	public void setSignatureData(String signatureData) {
		this.signatureData = signatureData;
	}
	public String getPaymentChannel() {
		return paymentChannel;
	}
	public void setPaymentChannel(String paymentChannel) {
		this.paymentChannel = paymentChannel;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public double getPaymentPrice() {
		return paymentPrice;
	}
	public void setPaymentPrice(double paymentPrice) {
		this.paymentPrice = paymentPrice;
	}
	public Date getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getPaymentServer() {
		return paymentServer;
	}
	public void setPaymentServer(String paymentServer) {
		this.paymentServer = paymentServer;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getBuyerAccount() {
		return buyerAccount;
	}
	public void setBuyerAccount(String buyerAccount) {
		this.buyerAccount = buyerAccount;
	}
	public String getThirdpartyTransactionNum() {
		return thirdpartyTransactionNum;
	}
	public void setThirdpartyTransactionNum(String thirdpartyTransactionNum) {
		this.thirdpartyTransactionNum = thirdpartyTransactionNum;
	}
	public String getTransactionState() {
		return transactionState;
	}
	public void setTransactionState(String transactionState) {
		this.transactionState = transactionState;
	}
	public Date getOnboardTime() {
		return onboardTime;
	}
	public void setOnboardTime(Date onboardTime) {
		this.onboardTime = onboardTime;
	}
	public Date getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getCustomerAttr() {
		return customerAttr;
	}
	public void setCustomerAttr(String customerAttr) {
		this.customerAttr = customerAttr;
	}
	public String getIVRnum() {
		return IVRnum;
	}
	public void setIVRnum(String iVRnum) {
		IVRnum = iVRnum;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAsynchronousURL() {
		return asynchronousURL;
	}
	public void setAsynchronousURL(String asynchronousURL) {
		this.asynchronousURL = asynchronousURL;
	}
	public String getSynchronousURL() {
		return synchronousURL;
	}
	public void setSynchronousURL(String synchronousURL) {
		this.synchronousURL = synchronousURL;
	}
	public double getPaymentMinus() {
		return paymentMinus;
	}
	public void setPaymentMinus(double paymentMinus) {
		this.paymentMinus = paymentMinus;
	}
	public String getPlatformCustomerID() {
		return platformCustomerID;
	}
	public void setPlatformCustomerID(String platformCustomerID) {
		this.platformCustomerID = platformCustomerID;
	}
	public String getCustomerPaymentChannelID() {
		return customerPaymentChannelID;
	}
	public void setCustomerPaymentChannelID(String customerPaymentChannelID) {
		this.customerPaymentChannelID = customerPaymentChannelID;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getTransactionExpireTime() {
		return transactionExpireTime;
	}
	public void setTransactionExpireTime(Date transactionExpireTime) {
		this.transactionExpireTime = transactionExpireTime;
	}
	public String getTransactionSource() {
		return transactionSource;
	}
	public void setTransactionSource(String transactionSource) {
		this.transactionSource = transactionSource;
	}
}
