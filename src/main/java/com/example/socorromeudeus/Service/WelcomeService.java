package com.example.socorromeudeus.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class WelcomeService {

    @GetMapping("/")
    public String Welcome(String name){
        return "Bem vindo, " + name + "!";
    }
}
