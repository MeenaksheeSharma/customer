package com.gl.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Customer {


    @GetMapping
    public String hello()
    {
        return "hello";
    }


}
