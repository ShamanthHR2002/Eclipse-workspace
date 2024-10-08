package com.xworkz.collectionSort;

import java.util.*;
import java.util.stream.Collectors;

public class SortLongs {
	public static void main(String[] args) {
		List<Long> longList = new ArrayList<>();
		longList.add(23L);
		longList.add(5L);
		longList.add(78L);
		longList.add(12L);
		longList.add(45L);
		longList.add(67L);
		longList.add(2L);
		longList.add(89L);
		longList.add(33L);
		longList.add(17L);

		List<Long> sortedAsc = longList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Longs in ascending order:");
		sortedAsc.forEach(sortedValue -> System.out.println(sortedValue));

		List<Long> sortedDesc = longList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted Longs in descending order:");
		sortedDesc.forEach(sortedValue -> System.out.println(sortedValue));
	}
}
