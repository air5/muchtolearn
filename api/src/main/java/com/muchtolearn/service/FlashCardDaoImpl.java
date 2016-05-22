package com.muchtolearn.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by Michael on 5/21/2016.
 */
@Component
public class FlashCardDaoImpl implements FlashCardDao{

    @Override
    public void addFlashCard() {
        System.out.println("Added the FlashCard!");
    }
}
