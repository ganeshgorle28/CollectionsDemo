package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Mumbai");
		list.add("Pune");
		list.add("Banglore");
		list.add("Khamgaon");
		//System.out.println(list);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
