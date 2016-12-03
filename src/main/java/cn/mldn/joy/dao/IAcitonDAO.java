package cn.mldn.joy.dao;

import java.util.Set;

import cn.mldn.joy.vo.Action;

public interface IAcitonDAO {
	public Set<Action> findAllActionFlag(String phone);
}
