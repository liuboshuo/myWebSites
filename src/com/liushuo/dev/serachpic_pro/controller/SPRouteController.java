package com.liushuo.dev.serachpic_pro.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

@RequestMapping("/sp")
public class SPRouteController {

	private static String path = "/Dev/searchpic_pro/";

	@RequestMapping(value = "/index")
	public String index(){

		return path+"index.html";
	}

	@RequestMapping("/register")
	public String register(){

		return path+"register.html";
	}

	@RequestMapping("/login")
	public String login(){

		return path+"login.html";
	}
}
