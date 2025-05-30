package org.programs;

public class CountOfNums {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 50; i++) {
//			if (i%2 == 0) {
//				count++;
//				
//			}
//			
//		}
			if (i%2 !=0) {
				count++;
			}
		}
		System.out.println(count);
	}
	
}
