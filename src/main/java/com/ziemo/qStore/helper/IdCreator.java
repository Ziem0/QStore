package main.java.com.ziemo.qStore.helper;

import java.util.UUID;

public class IdCreator {

    public static String createId() {
        String id = UUID.randomUUID().toString();
        return id;
    }

    public static String createNameId(String name) {
        String id = UUID.fromString(name).toString();
        return id;
    }
}
