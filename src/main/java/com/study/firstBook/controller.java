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

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/list-a")
    public String list_A() {
        return "list-a";
    }

    @GetMapping("/list-b")
    public String list_B() {
        return "list-b";
    }
}
