package com.cudzilp.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {


    @GetMapping(value = "/")
    @ResponseBody
    public String hello() {
        return "Simple hello from spring";
    }

}
