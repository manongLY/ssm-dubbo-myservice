package cn.mldn.joy.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class BankChannelMapping implements Serializable {
	private String ID ;
	private String bankCodeID ;
	private String paymentChannel ;
	private String ChannelBankCode ;
	private String remark ;
	private Date createdatetime ;
	private Date updatetime ;
	private String bankMapping ;
	public String getID() {
		return ID;
	}
	@Override
	public String toString() {
		return "BankChannelMapping [ID=" + ID + ", bankCodeID=" + bankCodeID + ", paymentChannel=" + paymentChannel
				+ ", ChannelBankCode=" + ChannelBankCode + ", remark=" + remark + ", createdatetime=" + createdatetime
				+ ", updatetime=" + updatetime + ", bankMapping=" + bankMapping + "]";
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getBankCodeID() {
		return bankCodeID;
	}
	public void setBankCodeID(String bankCodeID) {
		this.bankCodeID = bankCodeID;
	}
	public String getPaymentChannel() {
		return paymentChannel;
	}
	public void setPaymentChannel(String paymentChannel) {
		this.paymentChannel = paymentChannel;
	}
	public String getChannelBankCode() {
		return ChannelBankCode;
	}
	public void setChannelBankCode(String channelBankCode) {
		ChannelBankCode = channelBankCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	public String getBankMapping() {
		return bankMapping;
	}
	public void setBankMapping(String bankMapping) {
		this.bankMapping = bankMapping;
	}
}
