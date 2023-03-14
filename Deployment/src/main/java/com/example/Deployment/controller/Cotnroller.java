package com.example.Deployment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Cotnroller{

    @GetMapping(name = "/getcall")
    public String ha()
    {
        return "hi mahadev";
    }
}
