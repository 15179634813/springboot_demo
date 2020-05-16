package ange.springboot.demo.springboot_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demoController {


    @RequestMapping("/demo")
    public String demo(){

        return "demo";
    }
}
