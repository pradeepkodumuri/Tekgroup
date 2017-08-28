package Javamethods;

interface Low { // by default interface is abstract so no obj creation
	void Mea(); // by default method is public abstract

	int a = 10; // by default variables are public static final
}

interface High { // interface extends other interface
	void Mea();

	int a = 100; // same varible name but different value with public static final default

}   //Same varible ambigius problem so static variable are clled by using the class or interface name

public class Intra_3 implements Low, High {
	public void Mea() {
		System.out.println("The value of a in low is" +Low.a);
		System.out.println("the value of a in high is" +High.a);

	}

	public static void main(String[] args) {
		new Intra_3().Mea();

	}

}
