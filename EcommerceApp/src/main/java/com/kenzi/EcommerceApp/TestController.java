package com.kenzi.EcommerceApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    String SayHello(){

         return "hello world";
    }
}
