package com.sixthpoint.springboot.codepipeline.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( value = "/api" )
public class ApiController {

    @RequestMapping( value = "/", method = RequestMethod.GET )
    public List<String> index() {
        List<String> s = new ArrayList<>();
        s.add("Docker + AWS Codepipline Tutorial");
        s.add("Learn more at: https://github.com/sixthpoint/Docker-AWS-CodePipeline");
        return s;
    }
}
