package org.sample;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EncapsExecute {
	public static void main(String[] args) {
		Encapsulation a = new Encapsulation();
a.setId(10);
a.setName("ABC");
a.setPhno(9876543210l);

Encapsulation b = new Encapsulation();
b.setId(12);
b.setName("BCD");
b.setPhno(91010543210l);

//System.out.println("Id: " +a.getId());
//System.out.println("Name:" +a.getName());
//System.out.println("PhNum: " +a.getPhno());
//
//System.out.println("\nId: " +b.getId());
//System.out.println("Name:" +b.getName());
//System.out.println("PhNum: " +b.getPhno());

//List<Encapsulation> li = new LinkedList<Encapsulation>();  //List
//li.add(a);
//li.add(b);
//
//for (int i = 0; i < li.size(); i++) {
//	 
//	System.out.println("\n    Employee NO: " +(i+1));
//	System.out.println("Employee ID: " +li.get(i).getId());
//	System.out.println("Employee Name: " +li.get(i).getName());
//	System.out.println("Employee PHNO: " +li.get(i).getPhno());

//Set<Encapsulation> as = new LinkedHashSet<Encapsulation>();
//
//as.add(a);
//as.add(b);
//
//for (Encapsulation x : as) {
//	System.out.println(x.getId());
//	System.out.println(x.getName());
//	System.out.println(x.getPhno());

Map<Integer, Encapsulation> mp = new LinkedHashMap<Integer, Encapsulation>();  //Map
mp.put(1, a);
mp.put(2, b);

Set<Entry<Integer, Encapsulation>> gt = mp.entrySet();
for (Entry<Integer, Encapsulation> x1 : gt) {
	System.out.println("\n Employee No:" +x1.getKey());
	System.out.println("Employee ID:" +x1.getValue().getId());
	System.out.println("Employee Name: " +x1.getValue().getName());
	System.out.println("Employee Phno: " +x1.getValue().getPhno());
	
}


}

	}


