package cn.appsys.service.developer;

import cn.appsys.pojo.DevUser;

/**
 * 开发者用户业务接口
 * */
public interface DevUserService {
	/**
	 * 验证用户登录
	 * */
	DevUser login(String devCode,String devPassword) throws Exception;
}
