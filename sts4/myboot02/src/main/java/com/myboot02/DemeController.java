package com.myboot02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemeController {
	@ResponseBody
	@RequestMapping("/")
	public String home() {
		System.out.println("Hello Boot!!");
		return "Hello Boot!!";
	}
	
	@RequestMapping("/hello.do")
	public String hello(Model model) {
		System.out.println("�ȳ��ϼ���");
		model.addAttribute("message", "hello.jsp�Դϴ�.!");
		return "hello";
	}
}