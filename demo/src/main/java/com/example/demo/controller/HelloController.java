package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-11-14 14:32
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello docker";
    }
}
