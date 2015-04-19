package com.example.messageboard.action;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.example.messageboard.dao.MessageDao;
import com.example.messageboard.model.Message;
import com.example.messageboard.model.User;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class VMAction {
	@Autowired
	private MessageDao mdao;
	private String title;
	private String content;
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	ActionContext ac = ActionContext.getContext();		
	User u = (User) ac.getSession().get("user");
	int userid = u.getId();
	public String addMessage(){
		Date date = new Date();
		java.sql.Date de = new java.sql.Date(date.getTime());
		Message m = new Message(userid, de, title, content, u.getUsername());
		mdao.addInfo(m);
		return "addMessage";
	}
	
	public String showMessage(){
		List<Message> allMessages = mdao.findAllMessage(userid);
		ActionContext.getContext().put("allMessages", allMessages);
		return "showMessage";
	}
}
