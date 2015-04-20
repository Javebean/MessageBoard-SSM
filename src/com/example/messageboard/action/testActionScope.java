package com.example.messageboard.action;

import org.springframework.stereotype.Controller;

@Controller
public class testActionScope {
	private static Integer num_s = 0;
	private Integer num_n = 0;

	public String execute() {
		System.out.println("num_s:" + (num_s++) + "   num_n:" + (num_n++));
		return null;
	}
}
