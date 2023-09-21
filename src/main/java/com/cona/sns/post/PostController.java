package com.cona.sns.post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post")
public class PostController {
	
	
	@GetMapping("main-view")
	public String main() {
		return "post/main";
	}

}
