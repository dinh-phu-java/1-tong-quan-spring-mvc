package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @PostMapping("/calculate")
    public ModelAndView translate(@RequestParam double usd){
        ModelAndView modelAndView= new ModelAndView("result");
        double vnd=usd*24;
        modelAndView.addObject("vnd",vnd);
        return modelAndView;
    }
}
