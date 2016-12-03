package cn.mldn.joy.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.mldn.joy.vo.PaymentChannel;

public interface IPaymentChannelDAO {
	/**
	 * 精确查询全部
	 * @param map
	 * key=currentPage 当前页数
	 * key=lineSize 每页显示数量
	 * key=channelName 渠道名称
	 * key=channlCode 渠道代码
	 * key=paymentMode 支付方式
	 * key=channelState 渠道状态
	 * key=start (currentPage-1)*lineSize 起始行数
	 * key=linSize 每页显示数
	 * @return
	 */
	public List<PaymentChannel> findAllLimit(Map<String,Object> map);
	/**
	 * 精确查询全部
	 * @param map
	 * key=channelName 渠道名称
	 * key=channlCode 渠道代码
	 * key=paymentMode 支付方式
	 * key=channelState 渠道状态
	 * @return
	 */
	public Integer getAllCount(Map<String,Object> map);
	/**
	 * 查询全部的支付渠道信息
	 * @return
	 */
	public List<PaymentChannel> findAll();
	/**
	 * 查询全部的支付渠道代码
	 * @return
	 */
	public Set<String> findAllChannelCode();
	/**
	 * 查询全部的支付方式
	 * @return
	 */
	public Set<String> findAllPaymentMode();
	/**
	 * 查询全部的支付状态
	 * @return
	 */
	public Set<String> findAllChannelState();
	/**
	 * 创建新的支付渠道
	 * @param vo
	 * @return
	 */
	public boolean doCreate(PaymentChannel vo);
	/**
	 * 更新现有的支付渠道
	 * @param vo
	 * @return
	 */
	public boolean doUpdate(PaymentChannel vo);
	/**
	 * 删除支付渠道，将支付渠道的状态改为删除（逻辑删除）
	 * @param ids
	 * @return
	 */
	public boolean doRemoveBatch(Object[] ids);
	
	public PaymentChannel findById(String id);
	public PaymentChannel findByChannelCode(String channelCode);
	public PaymentChannel findByChannelName(String channelName);
} 
