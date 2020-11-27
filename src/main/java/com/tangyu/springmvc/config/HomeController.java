package com.tangyu.springmvc.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {

    @RequestMapping(value = "/homepage", method = GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/intropage", method = GET)
    public String intro(){
        return "intro";
    }

    @RequestMapping(method = GET)
    public String home2(){
        return "intro";
    }

}
