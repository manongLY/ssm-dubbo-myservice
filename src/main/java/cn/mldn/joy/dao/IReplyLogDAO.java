package cn.mldn.joy.dao;

import java.util.List;
import java.util.Map;

import cn.mldn.joy.vo.ReplyLog;

public interface IReplyLogDAO {
	public boolean doCreate(ReplyLog replyLog) ;
	public List<ReplyLog> findAllSplit(Map<String,Object> param)  ;
	public Integer getAllCount(Map<String,Object> param) ;
	public ReplyLog findByID(String id) ;
}
