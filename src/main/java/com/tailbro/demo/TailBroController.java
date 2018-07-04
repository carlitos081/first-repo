package com.tailbro.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class TailBroController {

    @Autowired
    private Business1 business1;

    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {

        business1.calculateSomething();
        return "hello";
    }
}
