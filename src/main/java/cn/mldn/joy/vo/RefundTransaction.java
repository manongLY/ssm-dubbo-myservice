package cn.mldn.joy.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
//退款交易流水
public class RefundTransaction implements Serializable {
	private String refundtransactionNum;
	private String transactionSource;
	private String paymentPlatFormOrder;
	private String cunstomerOrderNum;
	private String paymentTransactionNum;
	private String refundBatchID;
	private String singnaturetype;
	private String singnatureData;
	private String refundChannel;
	private Integer refundPrice;
	private String refundState;
	private Integer fee;
	private Date onboardTime;
	private Date refundTime;
	private String refundCuz;
	private String remark;
	private String customerAttr;
	private String thirdpartyTransactionSN;
	private String asynchronousURL;
	private String synchronousURL;
	private String platformCustomerID;
	public String getRefundtransactionNum() {
		return refundtransactionNum;
	}
	public void setRefundtransactionNum(String refundtransactionNum) {
		this.refundtransactionNum = refundtransactionNum;
	}
	public String getTransactionSource() {
		return transactionSource;
	}
	public void setTransactionSource(String transactionSource) {
		this.transactionSource = transactionSource;
	}
	public String getPaymentPlatFormOrder() {
		return paymentPlatFormOrder;
	}
	public void setPaymentPlatFormOrder(String paymentPlatFormOrder) {
		this.paymentPlatFormOrder = paymentPlatFormOrder;
	}
	public String getCunstomerOrderNum() {
		return cunstomerOrderNum;
	}
	public void setCunstomerOrderNum(String cunstomerOrderNum) {
		this.cunstomerOrderNum = cunstomerOrderNum;
	}
	public String getPaymentTransactionNum() {
		return paymentTransactionNum;
	}
	public void setPaymentTransactionNum(String paymentTransactionNum) {
		this.paymentTransactionNum = paymentTransactionNum;
	}
	public String getRefundBatchID() {
		return refundBatchID;
	}
	public void setRefundBatchID(String refundBatchID) {
		this.refundBatchID = refundBatchID;
	}
	public String getSingnaturetype() {
		return singnaturetype;
	}
	public void setSingnaturetype(String singnaturetype) {
		this.singnaturetype = singnaturetype;
	}
	public String getSingnatureData() {
		return singnatureData;
	}
	public void setSingnatureData(String singnatureData) {
		this.singnatureData = singnatureData;
	}
	public String getRefundChannel() {
		return refundChannel;
	}
	public void setRefundChannel(String refundChannel) {
		this.refundChannel = refundChannel;
	}
	public Integer getRefundPrice() {
		return refundPrice;
	}
	public void setRefundPrice(Integer refundPrice) {
		this.refundPrice = refundPrice;
	}
	public String getRefundState() {
		return refundState;
	}
	public void setRefundState(String refundState) {
		this.refundState = refundState;
	}
	public Integer getFee() {
		return fee;
	}
	public void setFee(Integer fee) {
		this.fee = fee;
	}
	public Date getOnboardTime() {
		return onboardTime;
	}
	public void setOnboardTime(Date onboardTime) {
		this.onboardTime = onboardTime;
	}
	public Date getRefundTime() {
		return refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}
	public String getRefundCuz() {
		return refundCuz;
	}
	public void setRefundCuz(String refundCuz) {
		this.refundCuz = refundCuz;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCustomerAttr() {
		return customerAttr;
	}
	public void setCustomerAttr(String customerAttr) {
		this.customerAttr = customerAttr;
	}
	public String getThirdpartyTransactionSN() {
		return thirdpartyTransactionSN;
	}
	public void setThirdpartyTransactionSN(String thirdpartyTransactionSN) {
		this.thirdpartyTransactionSN = thirdpartyTransactionSN;
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
	public String getPlatformCustomerID() {
		return platformCustomerID;
	}
	public void setPlatformCustomerID(String platformCustomerID) {
		this.platformCustomerID = platformCustomerID;
	}
	
}
