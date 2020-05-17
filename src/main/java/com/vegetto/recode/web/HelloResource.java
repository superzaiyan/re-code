package com.vegetto.recode.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @GetMapping("/hello")
    public String hello(@RequestHeader(name = "User-Agent") String userAgent) {
        return "Hello " + userAgent.split(" ")[0];
    }
}
