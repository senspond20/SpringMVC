package com.senshig.myapp;

import java.beans.Encoder;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		String formattedDate = dateFormat.format(date);
//		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	
	@RequestMapping(value ="count/{num}", method = RequestMethod.GET)
	@ResponseBody
	public  String countNum(@PathVariable String input) {
		int res = 0;
		System.out.println(input);
		try {
			int n = Integer.parseInt(input);
			for(int i = 1; i <= n; i++) {
				res += i;
			}
			return "total : " + res;
		}catch(Exception e){
		//	e.printStackTrace();
			return "Error : " + e.getMessage();
		}		
	}
	
}
