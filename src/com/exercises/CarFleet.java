package com.exercises;

import java.util.*;

public class CarFleet {

    class PositionAndSpeed {
        int position;

        int speed;
        public PositionAndSpeed(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }

    }

    public int carFleet(int target, int[] position, int[] speed) {
        double slowestTime = 0;
        List<PositionAndSpeed> sortedPositionsAndSpeed = new ArrayList<>();
        int numOfFleets = 0;
        for(int i = 0;i<position.length;i++) {
            sortedPositionsAndSpeed.add(new PositionAndSpeed(position[i], speed[i]));
        }
        sortedPositionsAndSpeed.sort(Comparator.comparingInt(o -> o.position));

        for (int i = sortedPositionsAndSpeed.size() - 1; i >= 0;i--) {
            float time = (target - sortedPositionsAndSpeed.get(i).position) / (float) sortedPositionsAndSpeed.get(i).speed;
            if (time > slowestTime) {
                numOfFleets++;
                slowestTime = time;
            }
        }
        return numOfFleets;
    }
}
