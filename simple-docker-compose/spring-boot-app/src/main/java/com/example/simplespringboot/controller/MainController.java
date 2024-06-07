package com.example.simplespringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Please explain the class!!
 *
 * @author : jonghoon
 * @fileName : TestController
 * @since : 2/5/24
 */
@RestController
public class MainController {
    @GetMapping("/")
    public String init() {
        return "spring boot server!!";
    }
}
