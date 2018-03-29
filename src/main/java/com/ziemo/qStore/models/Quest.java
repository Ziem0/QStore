package main.java.com.ziemo.qStore.models;

public class Quest extends AbstractItem{

    private QuestCategory category;


    public Quest(Integer value, String name, String description, QuestCategory category) {
        super(value, name, description);
        this.category = category;
    }

    public Quest(String id, Integer value, String name, String description, QuestCategory category) {
        super(id, value, name, description);
        this.category = category;
    }

    public QuestCategory getCategory() {
        return category;
    }

    public void setCategory(QuestCategory category) {
        this.category = category;
    }

}
