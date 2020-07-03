package com.dinhphu.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Component
public class HomeController {
    @RequestMapping(method= RequestMethod.GET,value="/home")
    public String index1(){
//        model.addAttribute("ten", name);
        return "home";
    }


//    @GetMapping("/home")
//    public ModelAndView homeYoyo(){
//        ModelAndView modelAndView=new ModelAndView("home");
//        String myName="My Name is: phu";
//        modelAndView.addObject("myName",myName);
//        return modelAndView;
//    }
}
