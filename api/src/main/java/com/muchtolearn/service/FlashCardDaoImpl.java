package com.muchtolearn.service;

import com.muchtolearn.model.FlashCard;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by Michael on 5/21/2016.
 */
@Component
public class FlashCardDaoImpl implements FlashCardDao{

    @Override
    public FlashCard getFlashCard() {
        System.out.println("Added the FlashCard!");
        FlashCard flashCard = new FlashCard();
        flashCard.setDateTimeAdded(LocalDateTime.now());
        flashCard.setTitle("First Card!");
        flashCard.setDescription("This is the description!!");
        return flashCard;

    }
}
