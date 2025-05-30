package org.programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListClass {
public static void main(String[] args) {
	
//	List<Integer> li = new LinkedList<Integer>();
//	li.add(10);
//	li.add(20);
//	li.add(30);
//	li.add(40);
//	li.add(50);
//	li.add(10);
//	li.add(60);
//	System.out.println(li);
//	
//	Set<Integer> s = new LinkedHashSet<Integer>();
//	// s.addAll(li);
//	System.out.println(s);
	
//	Integer a[] = {10, 20, 30, 40, 10, 50, 60};
//	List<Integer> li = new LinkedList<Integer>(Arrays.asList(a));
//	System.out.println(li);
//	Set<Integer> s = new LinkedHashSet<Integer>(li);
//	System.out.println(s);
	
	//Without List to remove the duplicates
	
	Integer a[] = {10, 20, 30, 40, 10, 50, 60};
	Set<Integer> s = new LinkedHashSet<Integer>();
for (Integer refname : a) {
	s.add(refname);
}
System.out.println(s);
}
}
