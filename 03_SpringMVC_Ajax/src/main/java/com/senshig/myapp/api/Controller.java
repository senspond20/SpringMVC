package com.senshig.myapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hi")
	public String test() {
		return "안녕";
	}
	
	@RequestMapping(value ="/count/{num}", method = RequestMethod.GET)
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
