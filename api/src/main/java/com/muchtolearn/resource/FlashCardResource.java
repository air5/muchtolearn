package com.muchtolearn.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FlashCardResource {

    @RequestMapping("/")
    public String indexPage(){
        return "hi you";
    }

    @RequestMapping("/time")
    public String time(){
        LocalDateTime dateTime = LocalDateTime.now();
        return dateTime.toString();
    }

}