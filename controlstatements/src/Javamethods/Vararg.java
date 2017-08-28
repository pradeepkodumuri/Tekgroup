package Javamethods;

class Opearation{
	static void m1(int... A){

		System.out.println("the length of the args are" + A.length);
		System.out.println("value is 10");
		System.out.println("value is 10,20");
		System.out.println("No value");
		
		
	}
}

public class Vararg {

	public static void main(String[] args) {
		
		Opearation.m1(10);
		Opearation.m1(10,20);
		Opearation.m1();
		
	}

}
