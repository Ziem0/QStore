package main.java.com.ziemo.qStore.matchers;

public class Compare {

    public static Boolean isHigherOrEqual(Integer points, Integer levelValue) {
        return points.compareTo(levelValue) >= 0;
    }

    public static Boolean isLower(Integer previousLevelPoints, Integer userPoints) {
        return previousLevelPoints.compareTo(userPoints) < 0;
    }

    public static Boolean isHigher(Integer nextLevelPoints, Integer userPoints) {
        return nextLevelPoints.compareTo(userPoints) > 0;
    }

    public static Boolean isLowerOrEqual(Integer nextLevelPoints, Integer userPoints) {
        return nextLevelPoints.compareTo(userPoints) <= 0;
    }


}
