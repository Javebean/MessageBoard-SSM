package com.example.messageboard.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.example.messageboard.dao.UserDao;
import com.example.messageboard.model.User;
import com.opensymphony.xwork2.ActionContext;
@Controller
@Scope("prototype")
public class LoginAction  {
	
	private User user ;
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	@Autowired
	private UserDao udao;
	
	public String execute() {
		System.out.println(user.getUsername()+user.getPassword());
		User u = udao.checkUser(user.getUsername(),user.getPassword());
		if(u!=null){
			ActionContext.getContext().getSession().put("user", user);
			return "success";
		}
		else{
			System.out.println("user is null!");
			return "error";
		}
	}

}
