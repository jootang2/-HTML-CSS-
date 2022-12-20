package com.study.firstBook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/contents")
    public String contents(){
        return "contents";
    }

}