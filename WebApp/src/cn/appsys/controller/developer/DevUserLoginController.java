package cn.appsys.controller.developer;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.appsys.service.developer.DevUserService;


@Controller
public class DevUserLoginController {
	private Logger logger = Logger.getLogger(DevUserLoginController.class);
	@Resource
	private DevUserService devUserService;
	@RequestMapping(value="/login")
	public String login(){
		logger.info("login==>");
		return "devlogin";
	}
}
