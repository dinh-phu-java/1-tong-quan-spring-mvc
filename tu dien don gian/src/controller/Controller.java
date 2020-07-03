package controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    private HashMap<String,String> myMap=new HashMap<>();
    public Controller(){
        myMap.put("hello","Xin Chào");
        myMap.put("love","Yêu");
        myMap.put("go","Đi");
        myMap.put("life","Cuộc sống");
    }
    @PostMapping("/home")
    public ModelAndView doHome(@RequestParam String english){
        english=english.toLowerCase();
        ModelAndView modelAndView=new ModelAndView("index");
        String tempString="-1";
        boolean find=false;
        for (int i=0;i<myMap.size();i++){
            if (myMap.containsKey(english)){
                tempString=myMap.get(english);
                find=true;
                break;
            }
        }

        if (find==false){
            tempString="Can't find your word!";
        }
        modelAndView.addObject("result",tempString);
        return modelAndView;
    }
}
