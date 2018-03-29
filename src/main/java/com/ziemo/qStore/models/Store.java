package main.java.com.ziemo.qStore.models;

import java.util.LinkedList;
import java.util.List;

public class Store {

    private List<Artifact> artifactList;

    public Store() {
        this.artifactList = new LinkedList<>();
    }

    public List<Artifact> getArtifactList() {
        return artifactList;
    }

    public void addArtifact(Artifact artifact) {
        this.artifactList.add(artifact);
    }

    public void removeArtifact(Artifact artifact) {
        this.artifactList.remove(artifact);
    }

    @Override
    public String toString() {
        String out = null;
        for (Artifact art : this.artifactList) {
            out += art + "\n";
        }
        return out;
    }


}
