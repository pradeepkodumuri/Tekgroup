package Javamethods;

public class Combine {
	int a=50;                     //instance  variable
	static float g=100.50F;            //static variable
	void  m1(String str) {    //instance method
		System.out.println("instance method");
	 {
		System.out.println("String is "+ str);
		}
	}
	static void m2(double d) {   //static method
		System.out.println("static method");
	 
		System.out.println("Double value is "+ d);
		
	}
	
	Combine(int b){                   //constructor with one arg
		System.out.println("constructor with one arg");
		System.out.println("Constructor passed value is "+ b);
		
	}
	Combine(int f, int j){                //constructor with 2 args
		System.out.println("constructor with two argus");
		System.out.println("value of f" +f);
		System.out.println("value of j" +j);
	}

	public static void main(String[] args) {     //main method
		Combine c =new Combine(10);
		c.m1("RAM");
		Combine.m2(10.50);
		Combine c2= new Combine(20,30);
		
		
		

	}

}
