package com.senshig.myapp.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@RequestMapping(value="login.me", method = RequestMethod.POST)
	public void memberLogin() {
		System.out.println("로그인 처리 메소드");
	}
}
