package com.lambda.java8;

import java.util.ArrayList;
import java.util.List;

public class PopulatingThisList {
	public boolean addingintoList() {
		List<Person> personlist=new ArrayList<Person>();
		
		Person p =new Person();
		Person p1= new Person();
		Person p2= new Person();
		
		p.setFiname("dd");
		p.setLaname("a");
		p.setAge("44");
		

		p1.setFiname("aaaa");
		p1.setLaname("fa");
		p1.setAge("66");
		

		p2.setFiname("aa");
		p2.setLaname("affarf");
		p2.setAge("55");
		
		personlist.add(p);
		personlist.add(p1);
		personlist.add(p2);
		
		for(Person pt:personlist) {
			System.out.println(pt);
		}
		
		return true;
		
	}

}
