package com.mysite.mysite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/sbb")
	@ResponseBody
	public String index() {
		System.out.println("index");
		return "안녕하세요 sbb에 오신것을 환영합니다";
	}
}
