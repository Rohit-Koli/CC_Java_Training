package com.collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
//		Write a Number of Occurencenses in a String
		String str="Hello This is a String";
		str=str.toLowerCase();
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			mp.put(ch,mp.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> ent :mp.entrySet()) {
			System.out.print(ent.getKey()+""+ent.getValue()+" ");
		}
		Set<Character> hs = new HashSet<Character>();
		for(int i=0;i<str.length();i++) {			;
			hs.add(str.charAt(i));
		}
		System.out.println();
		Iterator<Character> i =hs.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
	}
}
