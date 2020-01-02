package kr.gudi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test/{no}")
	public String test1(@PathVariable("no") String no) {
		System.out.println(no);
		return no;
	}
	
}
