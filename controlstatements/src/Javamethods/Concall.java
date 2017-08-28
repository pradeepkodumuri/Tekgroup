package Javamethods;

class Function {
	int a;
	int b;

	Function() {
		new Function(50,60);
		System.out.println("No argument");

	}

	Function(int a, int b) {
		System.out.println(" a value" + a);
		System.out.println("b value" + b);
	}

}

public class Concall {

	public static void main(String[] args) {
		Function f = new Function(10,20);
		new Function();
		
	}

}
