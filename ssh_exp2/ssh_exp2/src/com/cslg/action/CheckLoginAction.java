package com.cslg.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CheckLoginAction extends ActionSupport{
	private String username;
	private String password;
	private String tip;
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

	
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public String execute() throws Exception{
		ActionContext ac=ActionContext.getContext();
		if(getUsername().equals("qq")&&getPassword().equals("123")){
			ac.getSession().put("userName", getUsername());
			this.tip=getText("login.success",new String[] {this.username});
			return "success";
		}else {
			return "error";
		}
		
}
}