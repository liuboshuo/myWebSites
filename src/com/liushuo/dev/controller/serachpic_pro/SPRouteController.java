package com.liushuo.dev.controller.serachpic_pro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

@RequestMapping("/sp")
public class SPRouteController {

	private static String path = "/Dev/searchpic_pro/";

	@RequestMapping("/index")
	public String index(){

		return path+"index.html";
	}


}
