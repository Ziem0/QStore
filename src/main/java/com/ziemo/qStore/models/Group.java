package main.java.com.ziemo.qStore.models;

import main.java.com.ziemo.qStore.helper.IdCreator;

public class Group {

    private final String id;
    private String name;
    //dao z lista studentow



    public Group(String name) {
        this.id = IdCreator.createId();
        this.name = name;
    }

    public Group(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getGroupSaveString() {
        return String.format("%d|%s\n", this.id, this.name);
    }


}
