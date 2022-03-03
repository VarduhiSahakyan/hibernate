package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("greeting")
    public String getMethod(Map<String,Object> model) {
        model.put("message", "Hello ! How are you today?");
        return "greeting";
    }
    //thymeleaf example
   /* @GetMapping("thyme")
    public String thyme (Map<String,Object> model) {
        model.put("message", "Hello Thymeleaf! ");
        return "thyme";
    }
*/
}
