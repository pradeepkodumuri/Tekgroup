package com.collectionss.begin;

public class Student {
	private int student;
	private int sid;
	private String name;
	Student(int student,int sid,String name){
	this.student=student;
	this.sid=sid;
	this.name=name;
	}
	public int getStudent() {
		return student;
	}
	public void setStudent(int student) {
		this.student = student;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [student=" + student + ", sid=" + sid + ", name=" + name + "]";
	}
	

}
