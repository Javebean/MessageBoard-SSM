package com.example.messageboard.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.messageboard.model.User;
public interface UserDao {
	public User checkUser(
			@Param("uuu")String username,
			@Param("ppp")String password);
	
	
	public String getUserName(int id);
	public int insertUser(User u);

}
