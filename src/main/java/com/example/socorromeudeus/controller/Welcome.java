package com.example.socorromeudeus.controller;

import com.example.socorromeudeus.Service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Welcome {

    @Autowired
    private  WelcomeService welcomeService;

    @GetMapping
    public String welcome(){
        return welcomeService.Welcome("Lui");
    }

    @GetMapping("/quadro")
    public String quadro(){
        return welcomeService.quadro();
    }
}
