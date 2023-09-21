package com.example.springbootexceptio.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    public String add() {
        int num = 10 / 0;
        return "add";
    }
}
