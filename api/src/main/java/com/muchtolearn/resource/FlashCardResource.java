package com.muchtolearn.resource;

import com.muchtolearn.model.FlashCard;
import com.muchtolearn.service.FlashCardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FlashCardResource {

    @Autowired
    FlashCardDao flashCardDao;

    @RequestMapping("/")
    public String indexPage(){
        return "hi you";
    }

    @RequestMapping("/time")
    public String time(){
        LocalDateTime dateTime = LocalDateTime.now();
        return dateTime.toString();
    }

    @RequestMapping(value = "/flash-card", method = RequestMethod.GET)
    public FlashCard getFlashCardData(){
        return  flashCardDao.getFlashCard() ;
    }

}