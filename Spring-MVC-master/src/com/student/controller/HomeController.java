package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String index1(@RequestParam String name, Model model){
        model.addAttribute("ten", name);
        return "index";
    }

    @GetMapping("/index")
    public ModelAndView home(@RequestParam String name){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("ten", name);
        return modelAndView;
    }
}
