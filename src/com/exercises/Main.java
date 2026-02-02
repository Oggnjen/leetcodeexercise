package com.exercises;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("overlap", "first", 100);
        timeMap.set("overlap", "second", 101);
        timeMap.set("overlap", "third", 102);
        System.out.println(timeMap.get("overlap", 100)); // should print "first"
        System.out.println(timeMap.get("overlap", 101)); // should print "second"
        System.out.println(timeMap.get("overlap", 102)); // should print "third"
        System.out.println(timeMap.get("overlap", 99));
    }


}
