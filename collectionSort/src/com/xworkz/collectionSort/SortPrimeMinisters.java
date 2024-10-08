package com.xworkz.collectionSort;

import java.util.*;
import java.util.stream.Collectors;

public class SortPrimeMinisters {
	public static void main(String[] args) {
		List<String> pmNames = new ArrayList<>();
		pmNames.add("Jawaharlal Nehru");
		pmNames.add("Narendra Modi");
		pmNames.add("Indira Gandhi");
		pmNames.add("Manmohan Singh");
		pmNames.add("Atal Bihari Vajpayee");
		pmNames.add("Rajiv Gandhi");
		pmNames.add("Vishwanath Pratap Singh");
		pmNames.add("H. D. Deve Gowda");
		pmNames.add("I. K. Gujral");
		pmNames.add("Chandra Shekhar");

		List<String> sortedAscPM = pmNames.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Prime Minister names in ascending order:");
		sortedAscPM.forEach(pmName -> System.out.println(pmName));

		List<String> sortedDescPM = pmNames.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted Prime Minister names in descending order:");
		sortedDescPM.forEach(pmName -> System.out.println(pmName));
	}
}
