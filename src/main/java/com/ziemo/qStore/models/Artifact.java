package main.java.com.ziemo.qStore.models;

import main.java.com.ziemo.qStore.helper.IdCreator;
import main.java.com.ziemo.qStore.interfaces.ClassCreator;

import java.time.LocalDate;

public class Artifact extends AbstractItem {

    private ArtifactCategory category;



    public Artifact(Integer value, String name, String description, ArtifactCategory artifactCategory) {
        super(value, name, description);
        this.category = artifactCategory;
    }

    public Artifact(String id, Integer value, String name, String description, ArtifactCategory artifactCategory) {
        super(id, value, name, description);
        this.category = artifactCategory;
    }

    public ArtifactCategory getCategory() {
        return category;
    }

    public void setCategory(ArtifactCategory category) {
        this.category = category;
    }


    //zrobic get do create category


    private class ArtifactCategory {
        private final String idCat;
        private final String name;

        public ArtifactCategory(String name) {
            this.idCat = IdCreator.createId();
            this.name = name;
        }

        public ArtifactCategory(String id, String name) {
            this.idCat = id;
            this.name = name;
        }

        public String getIdCat() {
            return idCat;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return String.format("name: %s", this.name);
        }
    }

    private class ArtifactCategoryFeatured extends ArtifactCategory {

        private Student owner;
        private LocalDate date;

        public ArtifactCategoryFeatured(String name, Student owner) {
            super(name);
            this.owner = owner;
            this.date = LocalDate.now();
        }

        public ArtifactCategoryFeatured(String idCat, String name, Student owner, LocalDate date) {
            super(idCat, name);
            this.owner = owner;
            this.date = date;
        }

        @Override
        public String toString() {
            return String.format("name: %s\ndate of use: %s", this.getName(), this.date.toString());
        }
    }

}

