package com.example.springbootaoptutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    public DemoService service;

    @RequestMapping(method = RequestMethod.GET)
    public String demo() {
        service.demo();
        return "demo application!";
    }
}
