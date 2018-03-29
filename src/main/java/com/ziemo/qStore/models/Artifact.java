package main.java.com.ziemo.qStore.models;

import main.java.com.ziemo.qStore.helper.IdCreator;

import java.time.LocalDate;

public class Artifact extends AbstractItem {

    private ArtifactCategory artifactCategory;

    public Artifact(Integer value, String name, String description, ArtifactCategory artifactCategory) {
        super(value, name, description);
        this.artifactCategory = artifactCategory;
    }

    public Artifact(String id, Integer value, String name, String description, ArtifactCategory artifactCategory) {
        super(id, value, name, description);
        this.artifactCategory = artifactCategory;
    }


    private class ArtifactCategory {
        private final String id;
        private final String name;

        public ArtifactCategory(String name) {
            this.id = IdCreator.createId();
            this.name = name;
        }

        public ArtifactCategory(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
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

        public ArtifactCategoryFeatured(String id, String name, Student owner, LocalDate date) {
            super(id, name);
            this.owner = owner;
            this.date = date;
        }

        @Override
        public String toString() {
            return String.format("name: %s\ndate of use: %s", this.getName(), this.date.toString());
        }
    }



}

