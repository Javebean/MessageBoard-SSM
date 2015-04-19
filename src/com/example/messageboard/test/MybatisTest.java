package com.example.messageboard.test;


import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.messageboard.dao.MessageDao;
import com.example.messageboard.dao.UserDao;
import com.example.messageboard.model.Message;
import com.example.messageboard.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application-bean.xml")
public class MybatisTest {
	
	/*@Test
	public void testjdbc() throws SQLException {
		ApplicationContext ct = new ClassPathXmlApplicationContext(
				"application-bean.xml");
		DataSource ds = (DataSource) ct.getBean("dataSource");
		System.out.println(ds.getConnection());

	}*/
	@Autowired
	private UserDao udao;
	@Autowired
	private MessageDao mdao;
	@Test
	public void testInsertUser(){
		User u = new User(12, "xiaoming", "psdming");
		udao.insertUser(u);
		
	}
	@Test
	public void testInsertUser2(){
		User u = new User(20, "xiao", "psdming");
		int i = udao.insertUser(u);
		System.out.println(i);
	}
	
	@Test
	public void testcheckUser(){
//		User u = new User();
//		u.setUsername("xiaoming");
//		u.setPassword("psdming");
		User user = udao.checkUser("xiaoming", "psdming");
		System.out.println(user);
	}
	@Test
	public void testGEtusername(){
		String name = 	udao.getUserName(12);
		System.out.println(name);
		
	}
	@Test
	public void testaddInfo(){
		Date date = new Date();
		java.sql.Date dt = new java.sql.Date(date.getTime());
		Message m = new Message( 12, dt, "hehe", "hello world", "xiaoming");
		mdao.addInfo(m);
	}
	@Test
	public void testfindallMessage(){
		List<Message> list = mdao.findAllMessage(12);
		System.out.println(list);
	}
}
