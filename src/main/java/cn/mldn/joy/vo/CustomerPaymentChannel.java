package cn.mldn.joy.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class CustomerPaymentChannel implements Serializable{
	private String ID ; 
	private String platFormCuID ;
	private String cutomeridNum ;
	private String paymentChannelid ;
	private String paymentChannelCode ;
	private String paymentMode ;
	private Integer ratio ;
	private Date createdatetime ;
	private Date updatetime ;
	private int flag ;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPlatFormCuID() {
		return platFormCuID;
	}
	public void setPlatFormCuID(String platFormCuID) {
		this.platFormCuID = platFormCuID;
	}
	public String getCutomeridNum() {
		return cutomeridNum;
	}
	public void setCutomeridNum(String cutomeridNum) {
		this.cutomeridNum = cutomeridNum;
	}
	public String getPaymentChannelid() {
		return paymentChannelid;
	}
	public void setPaymentChannelid(String paymentChannelid) {
		this.paymentChannelid = paymentChannelid;
	}
	public String getPaymentChannelCode() {
		return paymentChannelCode;
	}
	public void setPaymentChannelCode(String paymentChannelCode) {
		this.paymentChannelCode = paymentChannelCode;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Integer getRatio() {
		return ratio;
	}
	public void setRatio(Integer ratio) {
		this.ratio = ratio;
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
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "CustomerPaymentChannel [ID=" + ID + ", platFormCuID=" + platFormCuID + ", cutomeridNum=" + cutomeridNum
				+ ", paymentChannelid=" + paymentChannelid + ", paymentChannelCode=" + paymentChannelCode
				+ ", paymentMode=" + paymentMode + ", ratio=" + ratio + ", createdatetime=" + createdatetime
				+ ", updatetime=" + updatetime + ", flag=" + flag + "]";
	}
	
}
