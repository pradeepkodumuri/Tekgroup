package Javamethods;


class Parent{
 void Mmm1() {
		System.out.println("this is overriden method");
		
	}
}
public class Oride extends Parent {
	void Mmm1() {
		System.out.println("this is overriding method");
		
	}

	public static void main(String[] args) {
	Oride o =new Oride();
	o.Mmm1();
	
		

	}

}
