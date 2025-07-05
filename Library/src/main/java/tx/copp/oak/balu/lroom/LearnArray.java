package tx.copp.oak.balu.lroom;

import java.util.ArrayList;

public class LearnArray {

	public static void main(String[] args) {
		ArrayList<String>	arr = new ArrayList<String>();
		ArrayList<String>	select = new ArrayList<String>();
		arr.add("Idly");
		arr.add("Chips");
		arr.add("Dosa");
		
		arr.add("Potato Chips");
		arr.add("Lemon Chips");
		arr.add("Spicy Chips");
		
		arr.add("Utaap");
		arr.add("Chole thing");
		System.out.println(arr);
		
		arr.remove(0);
		System.out.println("Size" + arr.size());

	
		
		for (int i = 0; i < arr.size(); i++) {
			//System.out.println(arr.get(i));
			
			String test = arr.get(i);
			
			if(test.equalsIgnoreCase("Chips")) {
			System.out.println("Found my Fav " + test.toUpperCase());
			}
			
			if(test.contains("Chips")) {
				System.out.println("Found my Fav " + test.toUpperCase());
				select.add(test);
			}
			
		} 	System.out.println("Final Selection" + select);
		}
	}

