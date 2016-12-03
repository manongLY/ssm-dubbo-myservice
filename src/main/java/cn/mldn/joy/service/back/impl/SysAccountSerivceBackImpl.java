package cn.mldn.joy.service.back.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.mldn.joy.dao.IAcitonDAO;
import cn.mldn.joy.dao.IRoleDAO;
import cn.mldn.joy.dao.ISysAccountDAO;
import cn.mldn.joy.service.back.ISysAccountServiceBack;
import cn.mldn.joy.service.back.abs.AbstractServiceBack;
import cn.mldn.joy.vo.SysAccount;
import cn.mldn.util.encrypt.MyPasswordEncrypt;
@Component("accountSerivceBackImpl")	// 与provider.xml文件中定义的名称一致
public class SysAccountSerivceBackImpl extends AbstractServiceBack implements ISysAccountServiceBack{
	@Resource
	private ISysAccountDAO sysAccountDAO;
	@Resource
	private IAcitonDAO actionDAO;
	@Resource
	private IRoleDAO roleDAO;
	@Override
	public Map<String, Object> listByStatus(String column, String keyWord, int currentPage, int lineSize,
			Integer status){
		Map<String, Object> map= super.handleParams(column, keyWord, currentPage, lineSize);
		System.out.println("state="+status);
		map.put("state", status);
		Map<String,Object> result = new HashMap<String,Object>() ;
		result.put("allSysAccount", this.sysAccountDAO.findAllByStatus(map)) ;
		result.put("sysAccountsCount", this.sysAccountDAO.getAllCountByStatus(map)) ;
		return result;
	}
	@Override
	public boolean editState(String phone,Integer oldState,Integer newState) {
		if(phone!=null&&oldState!=null&&newState!=null){	
			if(oldState!=newState){	
				SysAccount saVo = this.sysAccountDAO.findByPhone(phone);
				if(saVo!=null&&saVo.getState()==oldState){
					Map<String,Object> map = new HashMap<String,Object>();
					map.put("state", newState);
					map.put("phone", phone);
					System.out.println("更新数据库数据中。。。。。");
					return this.sysAccountDAO.doUpdateState(map);
				}
			}else{
				return true;
			}
		}
		return false;
	}
	
	@Override
	public SysAccount get(String phone) {
		return this.sysAccountDAO.findByPhone(phone);
	}


	@Override
	public boolean editPasswordByAdmin(String phone, String password) {
		SysAccount vo = this.sysAccountDAO.findByPhone(phone);
		if(vo!=null){
			password = MyPasswordEncrypt.encryptPassword(password);
			if(vo.getPassword()==password){
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("phone", phone);
				map.put("password", password);
				return this.sysAccountDAO.doUpdatePasswordByAdmin(map);
			}else{
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean editPassword(String phone, String oldPassword, String newPassword) {
		SysAccount vo = this.sysAccountDAO.findByPhone(phone);
		if(vo!=null){
			newPassword = MyPasswordEncrypt.encryptPassword(newPassword);
			if(oldPassword.equals(vo.getPassword())){
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("phone", phone);
				map.put("password", newPassword);
				return this.sysAccountDAO.doUpdatePassword(map);
			}else{
				return true;
			}
		}
		return false;
	}
	@Override
	public Map<String, Object> editPre(String phone) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("sysAccount", this.sysAccountDAO.findByPhone(phone));
		return map;
	}

	@Override
	public boolean edit(SysAccount vo) {
		if(vo!=null&&vo.getPhone()!=null){
			if(this.sysAccountDAO.findByPhone(vo.getPhone())!=null){
				vo.setUpdateTime(new Date());
				return this.sysAccountDAO.doUpdate(vo);
			}
		}
		return false;
	}

	@Override
	public Map<String, Object> addPre() {
		return null;
	}

	@Override
	public boolean add(SysAccount vo) {
		if(vo!=null&&vo.getPhone()!=null){
			if(vo.getPhone().matches("\\d+")){
				if(this.sysAccountDAO.findByPhone(vo.getPhone())==null){
					vo.setPassword(MyPasswordEncrypt.encryptPassword(vo.getPassword()));
					vo.setCreateTime(new Date());
					vo.setUpdateTime(vo.getCreateTime());
					vo.setState(3);
					vo.setType(2);
					if(this.sysAccountDAO.doCreate(vo)){
						int rids[] = new int[]{2,3};
						System.out.println("数据增加成功：  增加后自增长的said是"+vo.getSaid());
						for (int i = 0; i < rids.length; i++) {
							Map<String,Integer> accountRole=new HashMap<String,Integer>();
							accountRole.put("said", vo.getSaid());
							accountRole.put("rid", rids[i]);
							this.roleDAO.doCreateByAccount(accountRole);
						}
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean editLocked(String mid, int locked) {
		return false;
	}
    
	@Override
	public Map<String, Object> listAuthByAccount(String phone) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("allRoles", this.roleDAO.findAllRoleFlag(phone)) ;
		map.put("allActions", this.actionDAO.findAllActionFlag(phone)) ;
		return map;
	}



}
