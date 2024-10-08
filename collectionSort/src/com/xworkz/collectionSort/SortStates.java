package com.xworkz.collectionSort;

import java.util.*;
import java.util.stream.Collectors;

public class SortStates {
    public static void main(String[] args) {
        List<String> stateNames = new ArrayList<>();
        stateNames.add("Uttar Pradesh");
        stateNames.add("Maharashtra");
        stateNames.add("Bihar");
        stateNames.add("West Bengal");
        stateNames.add("Madhya Pradesh");
        stateNames.add("Tamil Nadu");
        stateNames.add("Rajasthan");
        stateNames.add("Karnataka");
        stateNames.add("Gujarat");
        stateNames.add("Andhra Pradesh");

        List<String> sortedAscStates = stateNames.stream()
                                                 .sorted()
                                                 .collect(Collectors.toList());
        System.out.println("Sorted State names in ascending order:");
        sortedAscStates.forEach(stateName -> System.out.println(stateName));

        List<String> sortedDescStates = stateNames.stream()
                                                  .sorted(Comparator.reverseOrder())
                                                  .collect(Collectors.toList());
        System.out.println("Sorted State names in descending order:");
        sortedDescStates.forEach(stateName -> System.out.println(stateName));
    }
}
