package main.java.com.ziemo.qStore.models;

import main.java.com.ziemo.qStore.interfaces.AgeCalculator;

import java.time.LocalDate;
import java.time.Period;

public class Student extends AbstractUser{

    private final Wallet wallet;
    private final Group group;
    private LocalDate dateOfBirth;
    private Integer age;

    /**
     * przerzucic pozniej na ogolniejsza klase
     */
    private final AgeCalculator ageCalculator = dateOfBirth -> {
        return Period.between(LocalDate.now(), dateOfBirth).getYears();
    };

    public Student(String name, String email, String login, String password, LocalDate dateOfBirth, Wallet wallet, Group group) {
        super(name, email, login, password);
        this.dateOfBirth = dateOfBirth;
        this.age = ageCalculator.calculateAge(dateOfBirth);
        this.wallet = wallet;
        this.group = group;
    }

    public Student(String id, String name, String email, String login, String password, LocalDate dateOfBirth, Wallet wallet, Group group) {
        super(id, name, email, login, password);
        this.dateOfBirth = dateOfBirth;
        this.age = ageCalculator.calculateAge(dateOfBirth);
        this.wallet = wallet;
        this.group = group;
    }

    public Integer getAge() {
        return age;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public Group getGroup() {
        return group;
    }

    public Integer calculateLevel(Level level) {
        return level.computeStudentLevel(this.wallet.getTotalPoints());
    }

    @Override
    public String toString() {
        return String.format("name: %s\nemail: %s\nage: %d\npoints: %s"
                , this.getName(), this.getEmail(), this.getAge(), this.getId());
    }

    public String StudentSaveString() {
        return String.format("%s|%s|%s|%s|%s|%s|%s|%s\n"
                , this.getId(), this.getName(), this.getEmail(), this.getLogin(), this.getPassword()
                , this.dateOfBirth.toString()  , this.getWallet().getId(), this.getGroup().getId());
    }


}
