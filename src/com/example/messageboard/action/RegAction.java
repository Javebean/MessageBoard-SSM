package com.example.messageboard.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.example.messageboard.dao.UserDao;
import com.example.messageboard.model.User;
import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
public class RegAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserDao udao;

	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}



	public String execute() throws Exception {
		
		User u = new User(user.getId(), user.getUsername(), user.getPassword());
		
		int flag = udao.insertUser(u);
		if (flag>=1)
			return "success";
		else
			return "error";
	}
/*
	public void validate() {
		if (getUsername() == null || getUsername().trim().equals("")) {
			addFieldError("username", "用户名是必须的，不能为空！");
		}
		if (!getPassword().equals(getPassword2())) {
			addFieldError("password2", "两次输入的密码必须相同");
		}
	}
*/
}
