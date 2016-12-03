package cn.mldn.joy.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ReplyException implements Serializable {
	private String ID ;
	private String paymentPFOrderNum ;
	private String platFormCuNum ;
	private String customerOrderNum ;
	private String transactionSN ;
	private String paymentChannel ;
	private String replytype ;
	private String replyURL ;
	private String replyIndex ;
	private String replyResult ;
	private Integer replytimes ;
	private String remark ;
	private Date nextReplyTime ;
	private Date createdatetime ;
	private String verifyID ;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPaymentPFOrderNum() {
		return paymentPFOrderNum;
	}
	public void setPaymentPFOrderNum(String paymentPFOrderNum) {
		this.paymentPFOrderNum = paymentPFOrderNum;
	}
	public String getPlatFormCuNum() {
		return platFormCuNum;
	}
	public void setPlatFormCuNum(String platFormCuNum) {
		this.platFormCuNum = platFormCuNum;
	}
	public String getCustomerOrderNum() {
		return customerOrderNum;
	}
	public void setCustomerOrderNum(String customerOrderNum) {
		this.customerOrderNum = customerOrderNum;
	}
	public String getTransactionSN() {
		return transactionSN;
	}
	public void setTransactionSN(String transactionSN) {
		this.transactionSN = transactionSN;
	}
	public String getPaymentChannel() {
		return paymentChannel;
	}
	public void setPaymentChannel(String paymentChannel) {
		this.paymentChannel = paymentChannel;
	}
	public String getReplytype() {
		return replytype;
	}
	public void setReplytype(String replytype) {
		this.replytype = replytype;
	}
	public String getReplyURL() {
		return replyURL;
	}
	public void setReplyURL(String replyURL) {
		this.replyURL = replyURL;
	}
	public String getReplyIndex() {
		return replyIndex;
	}
	public void setReplyIndex(String replyIndex) {
		this.replyIndex = replyIndex;
	}
	public String getReplyResult() {
		return replyResult;
	}
	public void setReplyResult(String replyResult) {
		this.replyResult = replyResult;
	}
	public Integer getReplytimes() {
		return replytimes;
	}
	public void setReplytimes(Integer replytimes) {
		this.replytimes = replytimes;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getNextReplyTime() {
		return nextReplyTime;
	}
	public void setNextReplyTime(Date nextReplyTime) {
		this.nextReplyTime = nextReplyTime;
	}
	public Date getCreatedatetime() {
		return createdatetime;
	}
	public void setCreatedatetime(Date createdatetime) {
		this.createdatetime = createdatetime;
	}
	public String getVerifyID() {
		return verifyID;
	}
	public void setVerifyID(String verifyID) {
		this.verifyID = verifyID;
	}
	@Override
	public String toString() {
		return "ReplyException [ID=" + ID + ", paymentPFOrderNum=" + paymentPFOrderNum + ", platFormCuNum="
				+ platFormCuNum + ", customerOrderNum=" + customerOrderNum + ", transactionSN=" + transactionSN
				+ ", paymentChannel=" + paymentChannel + ", replytype=" + replytype + ", replyURL=" + replyURL
				+ ", replyIndex=" + replyIndex + ", replyResult=" + replyResult + ", replytimes=" + replytimes
				+ ", remark=" + remark + ", nextReplyTime=" + nextReplyTime + ", createdatetime=" + createdatetime
				+ ", verifyID=" + verifyID + "]";
	}
}
