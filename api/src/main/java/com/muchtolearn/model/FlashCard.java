package com.muchtolearn.model;

import java.time.LocalDateTime;

/**
 * Created by Michael on 5/23/2016.
 */
public class FlashCard {
    private String title;

    private String description;

    private LocalDateTime dateTimeAdded;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateTimeAdded() {
        return dateTimeAdded;
    }

    public void setDateTimeAdded(LocalDateTime dateTimeAdded) {
        this.dateTimeAdded = dateTimeAdded;
    }
}
