package com.cona.sns;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestsnsController {
	
    @ResponseBody
    @RequestMapping("/test")
    public String helloWorld() {
        return "sns test!!";
    }


}
