package com.collectionss.begin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Combine {
	
	
	public void function() {
	Student s = new Student(1, 12, "fa");
	Student s1 = new Student(111, 152, "fagaa");
	Student s2 = new Student(1222, 162, "aegfa");
	Student s3 = new Student(1222, 162, "aegfa");
	Student s4 = new Student(1222, 162, "aegfa");

	College c = new College("sbce", 11, "101");
	College c1 = new College("ccc", 12, "102");
	College c2 = new College("saad", 13, "103");
	College c3 = new College("sjbhah", 14, "104");
	College c4 = new College("saafa", 15, "105");

    Map<Student,College> mps = new HashMap<Student,College>();
    mps.put(s, c);
    mps.put(s1, c1);
    mps.put(s2, c2);
    mps.put(s3, c3);
    mps.put(s4, c4);
    
    
   
    
    for(Map.Entry<Student,College>  itr : mps.entrySet()) {
    	
    }
    
		List<College> collegelist = new ArrayList<College>();
		
		collegelist.add(c);
		collegelist.add(c1);
		collegelist.add(c2);
		collegelist.add(c3);
		collegelist.add(c4);
		for (College clg : collegelist) {
			System.out.println(clg);
		}

		List<Student> Std = new ArrayList<Student>();
		Std.add(s);
		Std.add(s1);
		Std.add(s2);
		
		for(Student sryyu : Std) {
			System.out.println(sryyu);
		}
			
	}
	
	
}
