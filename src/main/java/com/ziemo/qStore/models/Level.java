package main.java.com.ziemo.qStore.models;


import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static main.java.com.ziemo.qStore.matchers.Compare.*;

/**
 * key - level
 * value - points
 */
public class Level {

    private TreeMap<Integer, Integer> levels;

    public Level() {
        this.levels = new TreeMap<>();
    }

    public Level(TreeMap<Integer, Integer> levels) {
        this.levels = levels;
    }

    public Integer computeStudentLevel(Integer points) {
        Integer level = null;

        if (this.levels.isEmpty()) {
            level = 0;
        } else {
            try {
                this.levels.entrySet().stream()
                        .filter(entry -> isHigherOrEqual(points, entry.getValue()))
                        .map(Map.Entry::getKey)
                        .max(Integer::compareTo)
                        .get();
            } catch (NoSuchElementException e) {
                level = 0;
            }
        }
        return level;
    }

    /**
     * @param level
     * @param points
     */
    public boolean addLevel(Integer level, Integer pointsNeeded) {
        Integer previousLevelPoints = this.levels.get(level - 1);
        previousLevelPoints = (previousLevelPoints == null) ? pointsNeeded - 1 : previousLevelPoints;

        if (!this.levels.containsKey(level)
                && isLower(previousLevelPoints, pointsNeeded)) {

            levels.put(level, pointsNeeded);
            return true;
        }
        return false;
    }

    /**
     *
     * @param level
     * @param points
     */
    public UpdateLevel updateLevel(Integer deliveredPoints, Integer chosenLevelToUpdate) {
        Integer previousLevelPoints = this.levels.get(chosenLevelToUpdate - 1);
        previousLevelPoints = (previousLevelPoints == null) ? deliveredPoints - 1 : previousLevelPoints;

        Integer nextLevelPoints = this.levels.get(chosenLevelToUpdate + 1);
        nextLevelPoints = (nextLevelPoints == null) ? deliveredPoints + 1 : nextLevelPoints;

        if(this.levels.containsKey(chosenLevelToUpdate) &&
                isLower(previousLevelPoints, deliveredPoints) &&
                isHigher(nextLevelPoints, deliveredPoints)) {

            this.levels.put(chosenLevelToUpdate, deliveredPoints);
            return UpdateLevel.SUCCESSFULLY;

        } else if (this.levels.containsKey(chosenLevelToUpdate)) {
            if (isHigherOrEqual(previousLevelPoints, deliveredPoints)) {
                return UpdateLevel.TOO_LOW;
            } else if (isLowerOrEqual(nextLevelPoints, deliveredPoints)) {
                return UpdateLevel.TOO_HIGH;
            }
        }
        return UpdateLevel.ERROR;
    }

    public enum UpdateLevel {
        SUCCESSFULLY,
        TOO_LOW,
        TOO_HIGH,
        ERROR;
    }

    public TreeMap<Integer, Integer> getLevels() {
        return levels;
    }

    @Override
    public String toString() {
        return this.levels.entrySet().stream()
                .map(entry -> String.format("level: %d --> points: %d", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining("\n"));
    }


}
