package cn.mldn.joy.dao;

import java.util.Map;
import java.util.Set;

import cn.mldn.joy.vo.Role;

public interface IRoleDAO {
	public Set<Role> findAllRoleFlag(String phone);
	public Set<Role> findAll();
	/**
	 * 创建管理员账号的同时，绑定相应角色关系
	 * @param map
	 * key=said  ,value=管理员ID
	 * key=rid  ,value=对应角色 ID
	 * @return
	 */
	public boolean doCreateByAccount(Map<String,Integer> map);
}
