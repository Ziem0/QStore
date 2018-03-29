package main.java.com.ziemo.qStore.models;

import main.java.com.ziemo.qStore.helper.IdCreator;

public class QuestCategory {

    private final String id;
    private final String name;

    public QuestCategory(String name) {
        this.id = IdCreator.createId();
        this.name = name;
    }

    public QuestCategory(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("name: %s", this.name);
    }


}
