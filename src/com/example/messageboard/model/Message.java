package com.example.messageboard.model;

import java.sql.Date;
/*

 create table message
 (
 	id int primary key,
 	user_id int,
 	date date,
 	m_title varchar(100),
 	m_content varchar(500),
 	user_name varchar(100),
 	foreign key (user_id) references User(id)
 	
 );
 
 */
public class Message {
	private int id;
	private int userid;
	private Date date;
	private String title;
	private String content;
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Message( int userid, Date date, String title, String content,
			String username) {
		super();
		this.userid = userid;
		this.date = date;
		this.title = title;
		this.content = content;
		this.username = username;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
