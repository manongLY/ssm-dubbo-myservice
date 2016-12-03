package cn.mldn.joy.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class TransactionLog implements Serializable {
	private String ID;
	private String transactionSN;
	private String paymentPFOrderNum;
	private String customerOrderNum;
	private String transactionType;
	private String paymentChannel;
	private String paymentMode;
	private String remark;
	private String expandInfo;
	private Date actionTime;
	private String platformCunstomerID;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTransactionSN() {
		return transactionSN;
	}
	public void setTransactionSN(String transactionSN) {
		this.transactionSN = transactionSN;
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
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getExpandInfo() {
		return expandInfo;
	}
	public void setExpandInfo(String expandInfo) {
		this.expandInfo = expandInfo;
	}
	public Date getActionTime() {
		return actionTime;
	}
	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}
	public String getPlatformCunstomerID() {
		return platformCunstomerID;
	}
	public void setPlatformCunstomerID(String platformCunstomerID) {
		this.platformCunstomerID = platformCunstomerID;
	}
	@Override
	public String toString() {
		return "TransactionLog [ID=" + ID + ", transactionSN=" + transactionSN + ", paymentPFOrderNum="
				+ paymentPFOrderNum + ", customerOrderNum=" + customerOrderNum + ", transactionType=" + transactionType
				+ ", paymentChannel=" + paymentChannel + ", paymentMode=" + paymentMode + ", remark=" + remark
				+ ", expandInfo=" + expandInfo + ", actionTime=" + actionTime + ", platformCunstomerID="
				+ platformCunstomerID + ", getID()=" + getID() + ", getTransactionSN()=" + getTransactionSN()
				+ ", getPaymentPFOrderNum()=" + getPaymentPFOrderNum() + ", getCustomerOrderNum()="
				+ getCustomerOrderNum() + ", getTransactionType()=" + getTransactionType() + ", getPaymentChannel()="
				+ getPaymentChannel() + ", getPaymentMode()=" + getPaymentMode() + ", getRemark()=" + getRemark()
				+ ", getExpandInfo()=" + getExpandInfo() + ", getActionTime()=" + getActionTime()
				+ ", getPlatformCunstomerID()=" + getPlatformCunstomerID() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]\n";
	}
	
	
}
