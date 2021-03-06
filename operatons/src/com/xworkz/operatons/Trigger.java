package com.xworkz.operatons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;

public class Trigger {
	public static void main(String[] args) {
		Collection<Integer> collection=new ArrayList<Integer>();
		collection.add(9);
		collection.add(5);
		collection.add(3);
		collection.add(2);
		
		Integer max= collection.stream().max(Integer::compare).get();
		Integer min= collection.stream().min(Integer::compare).get();
		Optional<Integer> secondMax= collection.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
		Optional<Integer> secondMin= collection.stream().sorted().limit(2).skip(1).findFirst();
		System.out.println(max+"  "+min+"  "+secondMax+"  "+secondMin);
	}
}
