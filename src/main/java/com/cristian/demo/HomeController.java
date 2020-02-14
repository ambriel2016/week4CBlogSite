package com.cristian.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/javabootcamp")
    public String javabootcamp(){
        return "javabootcamp";
    }
    @RequestMapping("/content")
    public String content(){
        return "content";
    }
    @RequestMapping("/profile")
    public String profile(){
        return "profile";
    }
    @RequestMapping("/photogallery")
    public String photogallery(){
        return "photogallery";
    }
    @RequestMapping("/contactme")
    public String contactme(){
        return "contactme";
    }
}
