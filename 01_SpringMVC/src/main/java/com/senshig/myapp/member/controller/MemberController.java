package com.senshig.myapp.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.senshig.myapp.member.model.service.MemberService;
import com.senshig.myapp.member.model.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService mService;
	
	/********** 파라미터 전송 받는 방법 **********/
//	1. HttpServletRequest를 통해 전송받기(JSP/Servelt방식)
//	@RequestMapping(value="login.me", method = RequestMethod.POST)
//	public void memberLogin(HttpServletRequest request) {
//		String id = request.getParameter("id");
//		String pwd = request.getParameter("pwd");
//		
//		System.out.println("id :" + id);
//		System.out.println("pwd :" + pwd);
//		System.out.println("로그인 처리 메소드");
//	}
	

	/********** 요청 후 전달하고자하는 데이터가 있을 경우 *************/

	// 2. @RequestParam 어노테이션 방식
//	 @RequestMapping(value ="login.me", method =RequestMethod.GET) //  
	// value 하나만 들어갈때는 생략 가능 public void
//	 public void memberLogin(@RequestParam("id") String userId, @RequestParam("pwd") String	 userPwd) { 
//		 System.out.println("id : " + userId); 
//		 System.out.println("pwd : " + userPwd); 
//	 }
	 

	// 3. @RequestParam 생략
	// 넘기는 파라미터 값과 받는 매개변수 이름을 일치시키면 된다.
	
//	 @RequestMapping(value ="login.me", method=RequestMethod.POST) 
//	 public void memberLogin(String id, String pwd){ 
//		 System.out.println("id : " + id);
//		 System.out.println("pwd : " + pwd); 
//	  }
//	  
	 

	// 4. @ModelAttribute 어노테이션 방식
	// 회원가입할때 혹은 게시글 작성 등 받을것이 많을게 굉장히 유용하게 쓸수 있다.
	// ModelAttribute 쓰고 ,(쉼표)로 RequestParam 둘다 받아서 쓸 수도 있다.
	// 5. @ModelAttribute 생략
//	  @RequestMapping(value ="login.me", method=RequestMethod.POST) 
//	  public void memberLogin(/*@ModelAttribute Member m*/ Member m) 
//	  { 
//		  System.out.println(m); 
//		  
//		// 실행될때마다 주소값이 계속 바낀다. 의존도가 높다.
//		  MemberService mService = new MemberServiceImpl();
//		  System.out.println(mService.hashCode());   
//		//
//			 
//	  }
//	  @RequestMapping(value ="login.me", method=RequestMethod.POST) 
//	  public String memberLogin( Member m, HttpSession session) 
//	  { 
//		  System.out.println(m);
//		  
//		  System.out.println(mService.hashCode());
//		  Member loginUser = mService.memberLogin(m);
//		  
//		  if(loginUser !=null) {
//			  session.setAttribute("loginUser", loginUser);
//		  }
//		  // redirect 가 있기떄문에  다른 ````스트링 무시하고 home.do 로 return "redirect:home.do";
//		  return "redirect:home.do";			 
//	  }
	
	/********** 요청 후 전달하고자하는 데이터가 있을 경우 *************/
	// 1. Model 객체를 사용하는 방법
//	  @RequestMapping(value ="login.me", method=RequestMethod.POST) 
//	  public String memberLogin(Member m, HttpSession session, Model model) {
//		  System.out.println(m);
//		  
//		  // MemberService mService = new MemberServiceImpl();
//		  System.out.println(mService.hashCode());
//		  
//		  Member loginUser = mService.memberLogin(m);
//		  
//			  if(loginUser != null) { 
//				  session.setAttribute("loginUser", loginUser); 
//				  return "redirect:home.do";	
//			  }else { 
//				  model.addAttribute("message","로그인에 실패하였습니다."); 
//			  	  return "../common/errorPage"; 
//			  }
//	  }
	 

	// 2. ModelAndView 객체를 사용하는 방법 : Model + View
/*	@RequestMapping(value = "login.me", method = RequestMethod.POST)
	public ModelAndView memberLogin(Member m, HttpSession session, ModelAndView mv) {
		System.out.println(m);

//		MemberService mService = new MemberServiceImpl();
		System.out.println(mService.hashCode());

		Member loginUser = mService.memberLogin(m);

		if (loginUser != null) {
			session.setAttribute("loginUser", loginUser);
			mv.setViewName("redirect:home.do");

		} else {
//			mv.addObject("message","로그인에 실패하였습니다.");
//			mv.setViewName("../common/errorPage");
			throw new MemberException("로그인에 실패하였습니다.");
		}

		return mv;

	}*/

	// 3. session에 저장 할 때 @SessionAttiributes 사용하기 : Model
	// Model에 attibute가 추가될 때 자동으로 키 값을 찾아 세션에 등록하는 어노테이션
	  @RequestMapping(value ="login.me", method=RequestMethod.POST) 
	  public String memberLogin(Member m, Model model) { 
		  System.out.println(m);
	  
		  // MemberService mService = new MemberServiceImpl();
		  System.out.println(mService.hashCode());
		  
		  Member loginUser = mService.memberLogin(m);
		  
		  if(loginUser != null) { 
			  model.addAttribute("loginUser", loginUser); 
			  return "redirect:home.do";
		  
		  }else { 
			  model.addAttribute("message","로그인에 실패하였습니다."); 
			  return "../common/errorPage"; 
		  }
	  
	  }
	 
}
