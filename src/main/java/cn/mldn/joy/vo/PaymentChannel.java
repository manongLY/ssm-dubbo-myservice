package cn.mldn.joy.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class PaymentChannel implements Serializable{
	private String ID ;
	private String channelName ;
	private String channelCode ;
	private String channelDescription ;
	private Date createdatetime ;
	private Date updatetime ;
	private String channelState;
	private String paymentMode ;
	private String channelIndex;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getChannelDescription() {
		return channelDescription;
	}
	public void setChannelDescription(String channelDescription) {
		this.channelDescription = channelDescription;
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
	public String getChannelState() {
		return channelState;
	}
	public void setChannelState(String channelState) {
		this.channelState = channelState;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getChannelIndex() {
		return channelIndex;
	}
	public void setChannelIndex(String channelIndex) {
		this.channelIndex = channelIndex;
	}
	@Override
	public String toString() {
		return "PaymentChannel [ID=" + ID + ", channelName=" + channelName + ", channelCode=" + channelCode
				+ ", channelDescription=" + channelDescription + ", createdatetime=" + createdatetime + ", updatetime="
				+ updatetime + ", channelState=" + channelState + ", paymentMode=" + paymentMode + ", channelIndex="
				+ channelIndex + "]";
	}
}
