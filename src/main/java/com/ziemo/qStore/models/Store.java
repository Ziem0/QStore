package main.java.com.ziemo.qStore.models;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Store {

    private List<Artifact> artifactList;
    private List<String> list;

    public Store() {
        this.artifactList = new LinkedList<>();
        this.list = new LinkedList<>();
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

    public Iterator getIterator() {
        return new QuestIterator();
    }

    public void getArtifactById(String id) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String a = iterator.next();
            System.out.println(a);
        }

//        Iterator iterator = this.getIterator();
//        while (iterator.hasNext()) {
//            Artifact artifact = (Artifact) iterator.next();
//            if (artifact.getId().equals(id)) {
//                return artifact;
//            }
//        }
//        return null;
    }

    @Override
    public String toString() {
        String out = null;
        for (Artifact art : this.artifactList) {
            out += art + "\n";
        }
        return out;
    }

    private class QuestIterator implements Iterator<Artifact> {
        Integer idx = 0;

        @Override
        public boolean hasNext() {
            return idx < artifactList.size();
        }

        @Override
        public Artifact next() {
            if (this.hasNext()) {
                return artifactList.get(this.idx++);
            } else {
                return null;
            }
        }
    }


    public static void main(String[] args) {
        Store store = new Store();
        store.list.add("ziemo");
        store.list.add("ana");
        store.list.add("nana");
        store.getArtifactById("ziemo");
    }
}
