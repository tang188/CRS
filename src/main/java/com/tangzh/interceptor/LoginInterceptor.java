package com.tangzh.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tangzh.domain.Student;
/**
 * login intercepter
 * @author tangzh
 *
 */
public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handle, Exception e)
			throws Exception {

		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handle, ModelAndView areg3)
			throws Exception {

		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handle) throws Exception {
		
		Configuration config = new PropertiesConfiguration("system.properties");
		String[] urls = config.getString("system.intercept.urls").split("\\|");
		
		//获取请求的url.
		String url = request.getRequestURI();
		//判断url是否是公开地址.
		for(String u : urls){
			if(url.indexOf(u)>=0){
				return true;
			}
		}
		Student currentStudent=(Student) request.getSession().getAttribute("current_student");
		if(currentStudent!=null){
			return true;
		}
		//重新跳转回登录界面。
		response.sendRedirect(request.getContextPath()+"pages/login.do");
		return false;
	}
	
}
