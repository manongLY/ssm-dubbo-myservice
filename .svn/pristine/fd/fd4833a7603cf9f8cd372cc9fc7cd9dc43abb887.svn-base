package cn.mldn.joy.service.back.abs;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import cn.mldn.joy.service.abs.AbstractService;
import cn.mldn.util.StringUtils;

public abstract class AbstractServiceBack extends AbstractService{
	protected <T>T transform(T t){
		Field field[] = t.getClass().getDeclaredFields();
		try {
			for (int i = 0; i < field.length; i++) {
				String name= field[i].getName();
				String type = field[i].getType().getSimpleName();
				if("String".equalsIgnoreCase(type)){
					System.out.println("数据类型是："+type);
					Method getMethod = t.getClass().getDeclaredMethod("get"+StringUtils.fistUpper(name));
					String result = (String)getMethod.invoke(t);
					System.out.println("取得的结果是是："+result);
					if(result==null){
					}else if("".equals((String) result)||"null".equalsIgnoreCase(result)){{
							System.out.println("错误的数据，将其替换为null");
							Method setMethod = t.getClass().getDeclaredMethod("set"+StringUtils.fistUpper(name),field[i].getType());
							String strs = null;
							setMethod.invoke(t,strs);
							System.out.println("错误的数据替换成功");
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}
	protected <T>T transformFuzzy(T t){
		Field field[] = t.getClass().getDeclaredFields();
		try {
			for (int i = 0; i < field.length; i++) {
				String name= field[i].getName();
				String type = field[i].getType().getSimpleName();
				if("String".equalsIgnoreCase(type)){
					Method getMethod = t.getClass().getDeclaredMethod("get"+StringUtils.fistUpper(name));
					String reuslt = (String)getMethod.invoke(t);
					if(reuslt==null){
					}else if("".equals((String) reuslt)||"null".equalsIgnoreCase(reuslt)){{
							Method setMethod = t.getClass().getDeclaredMethod("set"+StringUtils.fistUpper(name),field[i].getType());
							String strs = null;
							setMethod.invoke(t,strs);
						}
					}else{
						Method setMethod = t.getClass().getDeclaredMethod("set"+StringUtils.fistUpper(name),field[i].getType());
						setMethod.invoke(t,"%"+reuslt+"%");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}
}
