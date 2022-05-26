package com.websool.log_request_response.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(){
        return "hellow";
    }

    @PostMapping
    public HashMap product(@RequestBody HashMap request){
        return request;
    }
}
