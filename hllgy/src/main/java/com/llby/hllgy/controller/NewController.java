package com.llby.hllgy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {


    @GetMapping("/xxmm")
    public String xxmm(){


        return "xxmm";
    }

}
