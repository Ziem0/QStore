package main.java.com.ziemo.qStore.models;

import main.java.com.ziemo.qStore.helper.IdCreator;

public class AbstractItem {

    private final String id;
    private Integer value;
    private String name;
    private String description;

    public AbstractItem(Integer value, String name, String description) {
        this.id = IdCreator.createId();
        this.value = value;
        this.name = name;
        this.description = description;
    }

    public AbstractItem(String id, Integer value, String name, String description) {
        this.id = id;
        this.value = value;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("name: %s\ndescription: %s\nvalue: %d", this.name, this.description, this.value);
    }

}
