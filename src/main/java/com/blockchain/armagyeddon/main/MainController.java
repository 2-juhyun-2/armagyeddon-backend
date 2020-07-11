package com.blockchain.armagyeddon.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
    
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}