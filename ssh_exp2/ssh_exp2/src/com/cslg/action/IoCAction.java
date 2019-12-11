package com.cslg.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class IoCAction extends ActionSupport implements ServletRequestAware{

	private String username;
	private String password;
	private HttpServletRequest request;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	public String execute() throws Exception{
		if(getUsername().equals("qq")&&getPassword().equals("123")){
			HttpSession session=request.getSession();
			session.setAttribute("userName", this.username);
			return "success";
		}else {
			return "error";
		}
		
		
	}
	@Override
	public void setServletRequest(HttpServletRequest hsr) {
		// TODO Auto-generated method stub
		request = hsr;
	}
	
	

}
