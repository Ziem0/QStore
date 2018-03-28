package main.java.com.ziemo.qStore.models;

import main.java.com.ziemo.qStore.helper.IdCreator;

import java.util.LinkedList;
import java.util.List;

public class Wallet {

    private final String id;
    private Integer currentBalance;
    private Integer totalPoints;
    private List<Quest> achievements;
    private List<Artifact> boughtItems;

    public Wallet() {
        this.id = IdCreator.createId();
        this.currentBalance = 0;
        this.totalPoints = 0;
        this.achievements = new LinkedList<>();
        this.boughtItems = new LinkedList<>();
    }

    public Wallet(String id, Integer currentBalance, Integer totalPoints, List<Quest> achievements, List<Artifact> boughtItems) {
        this.id = id;
        this.currentBalance = currentBalance;
        this.totalPoints = totalPoints;
        this.achievements = achievements;
        this.boughtItems = boughtItems;
    }

    public String getId() {
        return id;
    }

    public Integer getCurrentBalance() {
        return currentBalance;
    }

    public Integer getTotalPoints() {
        return totalPoints;
    }

    public List<Quest> getAchievements() {
        return achievements;
    }

    public List<Artifact> getBoughtItems() {
        return boughtItems;
    }

    public void addPoints(Integer pointsToAdd) {
        this.totalPoints += pointsToAdd;
        this.currentBalance += pointsToAdd;
    }


}
