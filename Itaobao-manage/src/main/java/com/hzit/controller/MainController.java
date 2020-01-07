package com.hzit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    //这是访问后台管理界面的主页面
	@RequestMapping("query")
   public String query() {
	   return "main";
   }
}
