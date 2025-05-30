package org.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringDuplicateRemove {

	public static void main(String[] args) {
		//Remove Duplicates from a string
//		String s = "Malayalam";
//		Set<Character> se = new LinkedHashSet<Character>(); //Returning the character
//		
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			se.add(ch);
//		}
//		System.out.println(se);
		
		//Remove Duplicates from a Setence
		
		String s = "as I am suffering have has have as";
		
		String[] split = s.split(" ");
		Set<String> se = new LinkedHashSet<String>();
		
		for (String word : split) {
			se.add(word);
		}
		System.out.println(se);
	}
}
