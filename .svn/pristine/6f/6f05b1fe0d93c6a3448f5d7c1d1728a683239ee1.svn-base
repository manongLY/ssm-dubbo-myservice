package cn.mldn.joy.dao;

import java.util.List;
import java.util.Map;

import cn.mldn.joy.vo.SysAccount;

public interface ISysAccountDAO {
	/**
	 * 根据指定的状态查询出具体的数据并进行分页显示
	 * @param params 包含有如下的几个参数：<br>
	 * 1、key = column、value = 模糊查询的数据列；<br>
	 * 2、key = keyWord、value = 模糊查询关键字；<br>
	 * 3、key = start、value = (currentPage - 1) * lineSize，开始记录数；<br>
	 * 4、key = lineSize、value = 每页显示的数据行数。 <br>
	 * 5、key = status、value = 处理状态,如果为空表示查询全部状态。<br>
	 * @return
	 * 
	 */
	public List<SysAccount> findAllByStatus(Map<String,Object> map);
	
	/**
	 * 进行数据的模糊查询统计操作，处理采用了的动态SQL，没有column与keyWord统计全表数据量
	 * @param params  包含有如下的几个参数：<br>
	 * 1、key = column、value = 模糊查询的数据列；<br>
	 * 2、key = keyWord、value = 模糊查询关键字；<br>
	 * 5、key = flag、value = 发布状态。<br>
	 * @return 
	 */
	public Integer getAllCountByStatus(Map<String,Object> params) ;
	/**
	 * 根据电话号码查询管理员信息
	 * @param phone
	 * @return
	 */
	public SysAccount findByPhone(String phone);
	/**
	 * 更新指定的用户状态
	 * @param map
	 * @return
	 */
	public boolean doUpdateState(Map<String,Object> map);
	/**
	 * 更新用户的全部信息
	 * @param vo
	 * @return
	 */
	public boolean doUpdate(SysAccount vo);
	public boolean doUpdatePasswordByAdmin(Map<String,Object> params);
	public boolean doUpdatePassword(Map<String,Object> params);
	public boolean doCreate(SysAccount vo);
}
