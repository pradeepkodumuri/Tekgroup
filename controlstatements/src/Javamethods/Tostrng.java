package Javamethods;

public class Tostrng {		//if obj tostng() exectuded then it prints hash code
	int a;					//To print the used defined code by using the reference varible
	String st;				//then declare the tostring()

	Tostrng(int a,String st) {
		this.a=a;
		this.st=st;

	}
	public String toString() {								//override the tostring method
		return "id of emp"  +a+     "name of emp" +st;
		
	}

	public static void main(String[] args) {
		Tostrng s=new Tostrng(10,"ga");
		System.out.println(s);			//if we print by using the reference 
										//variable then the default tostring() is executed 
										//if there is no tostring() then override of tostring()

	}

}
