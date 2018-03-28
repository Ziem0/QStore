package main.java.com.ziemo.qStore.models;

public class Manager extends AbstractUser {

    private Group group;

    public Manager(String name, String email, String login, String password, Group group) {
        super(name, email, login, password);
        this.group = group;
    }

    public Manager(String id, String name, String email, String login, String password, Group group) {
        super(id, name, email, login, password);
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return String.format("id: %s\nname: %s", this.getId(), this.getName());
    }

    public String getManagerData() {
        return String.format("id: %s\nname: %s\nemail: %s\ngroup: %s"
                , this.getId()
                , this.getName()
                , this.getEmail()
                , this.getGroup().getName());
    }

    public String ManagerStringSave() {
        return String.format("%s|%s|%s|%s|%s|%s"
                , this.getId()
                , this.getName()
                , this.getEmail()
                , this.getLogin()
                , this.getPassword()
                , this.getGroup().getName());
    }
}
