package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import com.xworkz.collection.MatchBox;

public class BoxRunner {

	public static void main(String[] args) {

		MatchBox matchbox1 = new MatchBox(1, "aaaa");
		MatchBox matchbox2 = new MatchBox(10, "bbb");
		MatchBox matchbox3 = new MatchBox(1, "ccc");
		Collection<MatchBox> collection = new LinkedList<MatchBox>();
		collection.add(matchbox1);
		collection.add(matchbox2);
		collection.add(matchbox3);

		System.out.println("Total Elements: " + collection.size());

		collection.clear();

		System.out.println("Total elements after clear: " + collection.size());
		System.out.println("Is collection empty: " + collection.isEmpty());

		Iterator<MatchBox> iterator = collection.iterator();

		while (iterator.hasNext()) {
			System.out.println("elements exist");
			MatchBox ref = iterator.next();
			System.out.println(ref);
		}
	}
}
