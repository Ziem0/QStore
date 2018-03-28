package main.java.com.ziemo.qStore.models;

public class Boss extends AbstractUser {

    public Boss(String name, String email, String login, String password) {
        super(name, email, login, password);
    }

    public Boss(String id, String name, String email, String login, String password) {
        super(id, name, email, login, password);
    }

    public String BossStringSave() {
        return String.format("%s|%s|%s|%s|%s|%s"
                , this.getId()
                , this.getName()
                , this.getEmail()
                , this.getLogin()
                , this.getPassword());
    }
}
