package by.study.springboot.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayController {

    @RequestMapping("/")
    public String get()
    {
        return "get mapping";
    }
}
