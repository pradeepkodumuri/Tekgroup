package Javamethods;

class root {
	void Mehtod1() {
		System.out.println("first method");

	}

	void Method2() {
		System.out.println("Second Method");
	}

	class base extends root {

	}

	void Method3() {
		System.out.println("third method");
	}
}

public class Inheritance extends root {
	void Method4() {
		System.out.println("Fourth ");

	}

	public static void main(String[] args) {
		Inheritance i =new Inheritance();
		i.Method4();
	i.Method3();
		i.Method2();
		i.Mehtod1();
	}

}
