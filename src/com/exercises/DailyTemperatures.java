package com.exercises;

import java.util.Stack;

public class DailyTemperatures {

    class TemperatureAndIndex {
        int index;
        int temperature;

        public TemperatureAndIndex(int index, int temperature) {
            this.index = index;
            this.temperature = temperature;
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<TemperatureAndIndex> temperaturesStack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            if (temperaturesStack.isEmpty()) {
                temperaturesStack.push(new TemperatureAndIndex(i, temperatures[i]));
            } else if (temperaturesStack.peek().temperature >= temperatures[i]) {
                temperaturesStack.push(new TemperatureAndIndex(i, temperatures[i]));
            } else if (temperaturesStack.peek().temperature < temperatures[i]) {
                while (!temperaturesStack.isEmpty() && temperaturesStack.peek().temperature < temperatures[i]) {
                    res[temperaturesStack.peek().index] = i - temperaturesStack.pop().index;
                }
                temperaturesStack.push(new TemperatureAndIndex(i, temperatures[i]));
            }

        }

        while(!temperaturesStack.isEmpty()) {
            res[temperaturesStack.pop().index] = 0;
        }
        return res;
    }
}
