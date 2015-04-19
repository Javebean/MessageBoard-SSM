package com.example.messageboard.dao;

import java.util.List;

import com.example.messageboard.model.Message;

public interface MessageDao {
	public List<Message> findAllMessage(int userid);
	public void addInfo(Message m);
}
