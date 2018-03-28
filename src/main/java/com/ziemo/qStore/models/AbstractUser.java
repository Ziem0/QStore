package main.java.com.ziemo.qStore.models;

import main.java.com.ziemo.qStore.helper.IdCreator;

public abstract class AbstractUser {

    private final String id;
    private String name;
    private String email;
    private String login;
    private String password;

    public AbstractUser(String name, String email, String login, String password) {
        this.name = name;
        this.email = email;
        this.login = login;
        this.password = password;
        this.id = IdCreator.createNameId(this.name);
    }

    public AbstractUser(String id, String name, String email, String login, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return this.login;
    }
}
