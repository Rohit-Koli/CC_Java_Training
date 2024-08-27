package com.day01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Prog {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(2);
		li.add(89);
		li.add(5);
		Collections.sort(li);
		
		Collection<String> col = new ArrayList<String>();
		col.add("St");
		System.out.println(li);
	}
}
