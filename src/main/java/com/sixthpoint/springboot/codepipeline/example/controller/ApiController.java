package com.sixthpoint.springboot.codepipeline.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( value = "/rest" )
public class ApiController {

    @RequestMapping( value = "/", method = RequestMethod.GET )
    public List<String> displayAll() {
        List<String> s = new ArrayList<>();
        s.add("Docker + AWS Codepipline Tutorial");
        return s;
    }

}
