package com.lambda.java8;

public class Person {

	private String finame;
	private String laname;
	private String age;
	public String getFiname() {
		return finame;
	}
public void setFiname(String finame) {
		this.finame = finame;
	}
	public String getLaname() {
		return laname;
	}
	public void setLaname(String laname) {
		this.laname = laname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age; 
	}
	@Override
	public String toString() {
		return "Person [finame=" + finame + ", laname=" + laname + ", age=" + age + "]";
	}

	
	
}
