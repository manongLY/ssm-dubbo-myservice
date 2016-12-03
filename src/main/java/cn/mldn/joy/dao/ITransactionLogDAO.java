package cn.mldn.joy.dao;

import java.util.List;
import java.util.Set;

import cn.mldn.joy.vo.TransactionLog;
import cn.mldn.joy.vo.TransactionLogSearch;

public interface ITransactionLogDAO {
	/**
	 * 查询全部的支付方式
	 * @return
	 */
	public Set<String> findAllPaymentMode();
	/**
	 * 查询全部的交易类型
	 * @return
	 */
	public Set<String> findAllTransactionType();
	/**
	 * 查询全部的支付渠道
	 * @return
	 */
	public Set<String> findAllPaymentChannel();
	/**
	 * 通过关键字查询数据
	 * 可搜索的字段有：
	 * 	transactionSN    交易流水号 <br/>
	 *	paymentPFOrderNum  支付订单号<br/>
	 *	customerOrderNum	商户订单号<br/>
	 *	platformCunstomerID	平台商户号<br/>
	 *	paymentChannel		支付渠道<br/>
	 *	paymentMode			支付方式<br/>
	 *	transactionType		交易类型<br/>
	 *	startTime			要查询的开始时间<br/>
	 *	endTime				要查询的结束时间<br/>
	 *	lineSize			每页显示数量<br/>
	 *	currentPage			当前页数<br/>
	 * @param vo
	 * @return
	 */
	public List<TransactionLog> findAll(TransactionLogSearch vo);
	
	public Integer getAllCount(TransactionLogSearch vo);
	/**
	 * 根据商户订单号查询交易日志信息
	 * @param customerOrderNum
	 * @return
	 */
	public TransactionLog findByCustomerOrderNum(String customerOrderNum);
}
