package com.sbs.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {
		@RequestMapping("/usr/home/main")//ex) 받은 편지   //ResquestMapping이 붙어있으면 밑에 함수가 시작됨 ex)showMain 가 return 값을 실행
		@ResponseBody  //ex) 보낼편지 
		public  String showMain() {
			return "안녕하세요.";
		}
}
