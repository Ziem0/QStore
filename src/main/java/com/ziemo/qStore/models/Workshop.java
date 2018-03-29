package main.java.com.ziemo.qStore.models;

import java.util.LinkedList;
import java.util.List;

public class Workshop {

    private List<Quest> questList;

    public Workshop() {
        this.questList = new LinkedList<>();
    }

    public List<Quest> getQuestList() {
        return questList;
    }

    public void addQuest(Quest quest) {
        this.questList.add(quest);
    }

    public void removeQuest(Quest quest) {
        this.questList.remove(quest);
    }

    @Override
    public String toString() {
        String out = null;
        for (Quest q : this.questList) {
            out += q + "\n";
        }
        return out;
    }
}
