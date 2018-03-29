package main.java.com.ziemo.qStore.models;

import java.time.LocalDate;

public class QuestCategoryFeatured extends QuestCategory {

    private final Student owner;
    private final LocalDate date;

    public QuestCategoryFeatured(String name, Student owner) {
        super(name);
        this.owner = owner;
        this.date = LocalDate.now();
    }

    public QuestCategoryFeatured(String id, String name, Student owner, LocalDate date) {
        super(id, name);
        this.owner = owner;
        this.date = date;
    }

    public Student getOwner() {
        return owner;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("name: %s\ndate of completion: %s:", this.getName(), this.date.toString());
    }

}
