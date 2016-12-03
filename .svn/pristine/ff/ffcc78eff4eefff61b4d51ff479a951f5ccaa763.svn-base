package cn.mldn.joy.service.back.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.joy.dao.IReplyLogDAO;
import cn.mldn.joy.service.abs.AbstractService;
import cn.mldn.joy.service.back.ILogServiceBack;
import cn.mldn.joy.vo.ReplyLog;
@Service("logServiceBackImpl")
public class LogServiceBackImpl extends AbstractService implements ILogServiceBack {
	@Resource
	private IReplyLogDAO replyDAO ;
	@Override
	public Map<String, Object> listReplayLog(Map<String, Object> param) {
		System.out.println(" LogServiceImpl  listReplayLog ======>   ");
		
		Map<String,Object> result = new HashMap<String, Object>() ;
		result.put("all",this.replyDAO.findAllSplit(param)) ;
		result.put("allRecorders",this.replyDAO.getAllCount(param)) ;
		System.out.println(" LogServiceBackImpl  listReplayLog =====> all          " + this.replyDAO.findAllSplit(param)) ;
		System.out.println(" LogServiceBackImpl  listReplayLog =====> allRecorders " + this.replyDAO.getAllCount(param)) ;
		return result;
	}

	@Override
	public ReplyLog showReplayLog(String id) {
		System.out.println(" LogServiceImpl  showReplayLog ======>   "+this.replyDAO.findByID(id));
		return this.replyDAO.findByID(id);
	}

}
