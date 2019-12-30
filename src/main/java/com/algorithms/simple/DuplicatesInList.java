package com.algorithms.simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInList {
    private static List<String> list = Arrays.asList("A", "C", "D", "A", "B", "C", "E");

    /**
     * Simple algorithm to find duplicates in a list, one loop
     * @param args
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        for(String element : list) {
            if( !set.add(element) ) {
                System.out.println("Duplicate found: " + element);
            }
        }
    }
}
