package com.xworkz.CollectionmethodsandStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class MallRunner {
	public static void main(String[] args) {

		List<MallDTO> malls = new ArrayList<>();
		malls.add(new MallDTO(1, "One Mall", Location.PUNE, "Aditya Birla", 150000));
		malls.add(new MallDTO(2, "Mall of Bangalore", Location.BANGALORE, "Ravi Mehta", 125000));
		malls.add(new MallDTO(3, "City Centre", Location.KOLKATA, "Rahul Bajaj", 130000));
		malls.add(new MallDTO(4, "Viviana Mall", Location.MUMBAI, "Harsh Goenka", 90000));
		malls.add(new MallDTO(5, "South City Mall", Location.KOLKATA, "Sanjiv Goenka", 180000));
		malls.add(new MallDTO(6, "The Forum", Location.HYDERABAD, "Kiran Reddy", 85000));
		malls.add(new MallDTO(7, "Forum Shantiniketan", Location.BANGALORE, "Ashwin Naik", 110000));
		malls.add(new MallDTO(8, "Phoenix Palladium", Location.MUMBAI, "Anil Ambani", 120000));
		malls.add(new MallDTO(9, "Elante Mall", Location.PUNE, "Ajay Singh", 100000));
		malls.add(new MallDTO(10, "Pacific Mall", Location.DELHI, "Vijay Shekhar", 95000));

		malls.sort((m1, m2) -> Integer.compare(m2.getId(), m1.getId()));
		System.out.println("Malls sorted by ID in descending order:");
		malls.forEach(mall -> System.out.println(mall));

		malls.sort((m1, m2) -> m2.getName().compareTo(m1.getName()));
		System.out.println("\nMalls sorted by name in descending order:");
		malls.forEach(mall -> System.out.println(mall));

		System.out.println("\nIterator Example:");
		Iterator<MallDTO> iterator = malls.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nListIterator Example:");
		ListIterator<MallDTO> listIterator = malls.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("ListIterator backwards:");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

		System.out.println("\nMalls with land dimension less than 100,000:");
		malls.stream().filter(mall -> mall.getLandDimension() < 100000).forEach(mall -> System.out.println(mall));

		List<String> mallNames = malls.stream().map(mall -> mall.getName()).collect(Collectors.toList());
		System.out.println("\nNames of malls:");
		mallNames.forEach(name -> System.out.println(name));

		List<Double> sortedLandDimensions = malls.stream().map(mall -> mall.getLandDimension()).sorted()
				.collect(Collectors.toList());
		System.out.println("\nLand dimensions sorted in ascending order:");
		sortedLandDimensions.forEach(dimension -> System.out.println(dimension));
	}
}
