package cn.mldn.joy.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class PaymentInfo implements Serializable{
	private String ID ;
	private String paymentPFOrderNum ;
	private String customerOrderNum ;
	private String paymentState ;
	private double paymentPrice ;
	private int paymentTimes ;
	private double paymentScore ;
	private Date onboardTime ;
	private Date updatetime ;
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
	public String getCustomerOrderNum() {
		return customerOrderNum;
	}
	public void setCustomerOrderNum(String customerOrderNum) {
		this.customerOrderNum = customerOrderNum;
	}
	public String getPaymentState() {
		return paymentState;
	}
	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}
	public double getPaymentPrice() {
		return paymentPrice;
	}
	public void setPaymentPrice(double paymentPrice) {
		this.paymentPrice = paymentPrice;
	}
	public int getPsymentTimes() {
		return paymentTimes;
	}
	public void setPsymentTimes(int psymentTimes) {
		this.paymentTimes = psymentTimes;
	}
	public double getPaymentScore() {
		return paymentScore;
	}
	public void setPaymentScore(double paymentScore) {
		this.paymentScore = paymentScore;
	}
	public Date getOnboardTime() {
		return onboardTime;
	}
	public void setOnboardTime(Date onboardTime) {
		this.onboardTime = onboardTime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	@Override
	public String toString() {
		return "PaymentInfo [ID=" + ID + ", paymentPFOrderNum=" + paymentPFOrderNum + ", customerOrderNum="
				+ customerOrderNum + ", paymentState=" + paymentState + ", paymentPrice=" + paymentPrice
				+ ", psymentTimes=" + paymentTimes + ", paymentScore=" + paymentScore + ", onboardTime=" + onboardTime
				+ ", updatetime=" + updatetime + "]\n";
	}
	
}
