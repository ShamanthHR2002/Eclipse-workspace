package com.xworkz.collectionpro;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class HRDTORunner {
	public static void main(String[] args) {
		HRDTO hrDTO1 = new HRDTO("Rajesh", "BSc", 3, "Mysore");
		HRDTO hrDTO2 = new HRDTO("Suresh", "Bcom", 5, "Dharwad");
		HRDTO hrDTO3 = new HRDTO("Anitha", "MSc", 7, "Hubli");
		HRDTO hrDTO4 = new HRDTO("Manoj", "MBA", 6, "Belgaum");
		HRDTO hrDTO5 = new HRDTO("Sangeeta", "BE", 4, "Bangalore");
		HRDTO hrDTO6 = new HRDTO("Prakash", "Mcom", 2, "Mangalore");
		HRDTO hrDTO7 = new HRDTO("Deepa", "MA", 1, "Tumkur");
		HRDTO hrDTO8 = new HRDTO("Vikas", "BSc", 8, "Hassan");
		HRDTO hrDTO9 = new HRDTO("Priya", "MBA", 10, "Shimoga");
		HRDTO hrDTO10 = new HRDTO("Naveen", "BE", 2, "Udupi");

		Collection<HRDTO> collection = new LinkedList<HRDTO>();
		
		collection.add(hrDTO1);
		collection.add(hrDTO2);
		collection.add(hrDTO3);
		collection.add(hrDTO4);
		collection.add(hrDTO5);
		collection.add(hrDTO6);
		collection.add(hrDTO7);
		collection.add(hrDTO8);
		collection.add(hrDTO9);
		collection.add(hrDTO10);

		collection.stream().filter(ref -> ref.getLocation().startsWith("c")).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref.getName()));
		System.out.println();
		collection.stream().filter(ref -> ref.getTotalExp() > 5).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref.getName()));
		System.out.println();

		collection.stream().filter(ref -> ref.getName().endsWith("r")).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref.getName()));
		System.out.println();

		collection.stream().map(ref -> ref.getLocation()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println();

		collection.stream().map(ref -> ref.getName()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println();

		collection.stream().sorted((ref1, ref2) -> ref1.getName().compareTo(ref2.getName()))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		System.out.println();
		collection.stream().sorted((ref1, ref2) -> ref1.getQualification().compareTo(ref2.getQualification()))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		System.out.println();
		collection.stream().sorted((ref1, ref2) -> Integer.compare(ref2.getTotalExp(), ref1.getTotalExp()))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		System.out.println();
		Iterator<HRDTO> iterator = collection.iterator();

		System.out.println("iterator");
		while (iterator.hasNext()) {
			HRDTO ref = iterator.next();
			if (ref.getName().startsWith("a"))
				System.out.println(ref);
		}
		LinkedList<HRDTO> collection1 = (LinkedList<HRDTO>) collection;

		ListIterator<HRDTO> listIterator = collection1.listIterator(10);

		System.out.println("listTterator");

		while (listIterator.hasPrevious()) {
			HRDTO ref = listIterator.previous();
			System.out.println(ref);
		}

	}

}
