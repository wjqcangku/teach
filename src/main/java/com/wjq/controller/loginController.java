package com.wjq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	@GetMapping("login.do")
	public String dengLu(){

	    return "frame";
	}

    @RequestMapping("zlogin.do")
    public String zhuce(){
        return "zlogin";
    }



}
