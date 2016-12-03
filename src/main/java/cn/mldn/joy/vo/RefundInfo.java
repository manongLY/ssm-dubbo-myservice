package cn.mldn.joy.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
//退款信息表
public class RefundInfo implements Serializable {
	private String refundNum;
	private String paymentPFOrderNum;
	private String customerOrderNum;
	private Integer refundPrice;
	private Integer refundTimes;
	private Integer refundFee;
	private String refundState;
	private Date createdatetime;
	private Date updatetime;
	public String getRefundNum() {
		return refundNum;
	}
	public void setRefundNum(String refundNum) {
		this.refundNum = refundNum;
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
	public Integer getRefundPrice() {
		return refundPrice;
	}
	public void setRefundPrice(Integer refundPrice) {
		this.refundPrice = refundPrice;
	}
	public Integer getRefundTimes() {
		return refundTimes;
	}
	public void setRefundTimes(Integer refundTimes) {
		this.refundTimes = refundTimes;
	}
	public Integer getRefundFee() {
		return refundFee;
	}
	public void setRefundFee(Integer refundFee) {
		this.refundFee = refundFee;
	}
	public String getRefundState() {
		return refundState;
	}
	public void setRefundState(String refundState) {
		this.refundState = refundState;
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
	
}
