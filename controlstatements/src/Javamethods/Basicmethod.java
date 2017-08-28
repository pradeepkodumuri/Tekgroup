package Javamethods;

class Basicmethod {
	void m1() {
		System.out.println("m1 mehtod");
	}

	static void m2() {
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		Basicmethod b = new Basicmethod();
		b.m1();
		Basicmethod.m2();
	}
}
