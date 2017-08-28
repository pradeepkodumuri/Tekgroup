package com.collectionss.begin;

public class College {
	private String collegename;
	private int collegeid;
	private String collegeaddress;
	College(String collegename,int collegeid,String collegeaddress){
		this.collegename=collegename;
		this.collegeid=collegeid;
		this.collegeaddress=collegeaddress;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public int getCollegeid() {
		return collegeid;
	}
	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}
	public String getCollegeaddress() {
		return collegeaddress;
	}
	public void setCollegeaddress(String collegeaddress) {
		this.collegeaddress = collegeaddress;
	}
	@Override
	public String toString() {
		return "College [collegename=" + collegename + ", collegeid=" + collegeid + ", collegeaddress=" + collegeaddress
				+ "]";
	}


}
