package cn.mldn.joy.service.back.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.mldn.joy.dao.IPaymentChannelDAO;
import cn.mldn.joy.service.back.abs.AbstractServiceBack;
import cn.mldn.joy.vo.PaymentChannel;
@Component("paymentChannelServiceBackImpl")
public class PaymentChannelServiceBackImpl extends AbstractServiceBack
		implements cn.mldn.joy.service.back.IPaymentChannelServiceBack {
	@Resource
	private IPaymentChannelDAO paymentChannleDAO;
	@Override
	public Map<String, Object> list(int currentPage, int lineSize, String channelName, String channlCode,
			String paymentMode, String channelState) {
		Map<String,Object> map = super.handleParams(null,null,currentPage, lineSize);
		System.out.println("currentPage:"+currentPage+",lineSize:"+lineSize+",channelName:"+channelName
				+",channlCode"+channlCode+"paymentMode"+paymentMode+",channelState"+channelState);
		if (channelName==null||"".equals(channelName)||"null".equals(channelName)) {
		} else { 
			map.put("channelName", channelName) ;
		}
		if(channlCode==null||"".equals(channlCode)||"null".equals(channlCode)){
		}else{
			map.put("channlCode", channlCode);
		}
		if(paymentMode==null||"".equals(paymentMode)||"null".equals(paymentMode)){
		}else{
			map.put("paymentMode", paymentMode);
		}
		if(channelState==null||"".equals(channelState)||"null".equals(channelState)){
		}else{
			map.put("channelState", channelState);
		}
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("allPaymentChannel",this.paymentChannleDAO.findAllLimit(map));
		result.put("allChannelCode",this.paymentChannleDAO.findAllChannelCode());
		result.put("allChannelState",this.paymentChannleDAO.findAllChannelState());
		result.put("allPaymentMode",this.paymentChannleDAO.findAllPaymentMode());
		result.put("paymentChannelsCount", this.paymentChannleDAO.getAllCount(map));
		return result;
	}
	@Override
	public Map<String, Object> listByFuzzy(int currentPage, int lineSize, String channelName, String channlCode,
			String paymentMode, String channelState) {
		Map<String,Object> map = super.handleParams(null,null,currentPage, lineSize);
		if (channelName==null||"".equals(channelName)||"null".equals(channelName)) {
		} else { 
			map.put("channelName", "%"+channelName+"%") ;
		}
		if(channlCode==null||"".equals(channlCode)||"null".equals(channlCode)){
		}else{
			map.put("channlCode","%"+ channlCode+"%");
		}
		if(paymentMode==null||"".equals(paymentMode)||"null".equals(paymentMode)){
		}else{
			map.put("paymentMode", "%"+paymentMode+"%");
		}
		if(channelState==null||"".equals(channelState)||"null".equals(channelState)){
		}else{
			map.put("channelState", "%"+channelState+"%");
		}
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("allPaymentChannel",this.paymentChannleDAO.findAllLimit(map));
		result.put("allChannelCode",this.paymentChannleDAO.findAllChannelCode());
		result.put("allChannelState",this.paymentChannleDAO.findAllChannelState());
		result.put("allPaymentMode",this.paymentChannleDAO.findAllPaymentMode());
		result.put("paymentChannelsCount", this.paymentChannleDAO.getAllCount(map));
		return result;
	}
	@Override
	public boolean add(PaymentChannel vo) {
		//判断要增加的数据的ChannelName  ChannelCode是否为空，如果为空则直接返回false；
		if(vo!=null&&vo.getChannelName()!=null&&vo.getChannelCode()!=null){
			//如果数据库中有一样的渠道代码、渠道名称时，无法增加数据
			if(this.paymentChannleDAO.findByChannelCode(vo.getChannelCode())!=null||
					this.paymentChannleDAO.findByChannelName(vo.getChannelName())!=null){
				return false;
			}else{
				Date currentDate = new Date();
				//生成ID 格式为  20161117141522xxxx 时间戳+随机数
				vo.setID(new SimpleDateFormat("yyyyMMddHHmmss").format(currentDate)+new Random().nextInt(1000));
				vo.setCreatedatetime(currentDate);
				vo.setUpdatetime(currentDate);
				vo.setChannelState("已启用");
				vo.setChannelIndex("");
				return this.paymentChannleDAO.doCreate(vo);
			}
		}
		return false;
	}
	@Override
	public boolean edit(PaymentChannel vo) {
		System.out.println("传进去的数据是："+vo);
		if(vo!=null&&vo.getChannelName()!=null&&vo.getChannelCode()!=null&&vo.getID()!=null){
			//要更新的数据存在
			PaymentChannel data = this.paymentChannleDAO.findById(vo.getID());
			System.out.println("数据库中的数据是：\n"+data);
			if(data!=null){
				//判断要更新的取得名称是否在数据库中存在
				PaymentChannel result = this.paymentChannleDAO.findByChannelName(vo.getChannelName());
				System.out.println("数据库中的同名数据是：\n"+data);
				if(result!=null){
					System.out.println("数据库中有同名数据");
					if(!(result.getID().equals(vo.getID()))){
						System.out.println("同名数据且ID不一样");
						return false;
					}
				}
				//设置更新时间为当前操作时间
				vo.setUpdatetime(new Date());
				return this.paymentChannleDAO.doUpdate(vo);
			}
		}
		return false;
	}
	@Override
	public boolean remove(Set<String> ids) {
		if(ids!=null&&ids.size()!=0){
			return this.paymentChannleDAO.doRemoveBatch(ids.toArray());
		}
		return false;
	}
	@Override
	public PaymentChannel get(String id) {
		return this.paymentChannleDAO.findById(id);
	}

}
