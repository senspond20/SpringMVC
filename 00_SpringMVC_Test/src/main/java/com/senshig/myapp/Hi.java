package com.senshig.myapp;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

@RestController
public class Hi {

	@GetMapping("/kk")
	public String kk() {
		
	
		HashMap<String,String> h = new HashMap<String,String>();
		h.put("1", "아잉");
		h.put("2d", "dfd3");
	
		return h.toString();
	}
	
	
	@GetMapping("/gg")
	public void gg(HttpServletResponse response) {	
//		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		HashMap<String,String> h = new HashMap<String,String>();
		h.put("1", "아잉");
		h.put("2d", "dfd3");
		
		try {
			gson.toJson(h, response.getWriter());
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
