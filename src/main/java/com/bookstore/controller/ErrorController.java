package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {
    @GetMapping("/403")
    public String accessDenied(){
        return "error/403";
    }

    @GetMapping("/500")
    public String systemError(){
        return "error/500";
    }

    @GetMapping("/400")
    public String requestError(){
        return "error/400";
    }
}
