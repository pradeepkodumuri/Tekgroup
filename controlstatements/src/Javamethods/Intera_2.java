package Javamethods;

interface Store { // by default it is public and abstract
	void list(String Inv); // by default it is public and abstract

	void Price(float f); // by default it is public and abstract

	void Quantity(int i); // by default it is public and abstract

}

abstract class Layerone implements Store {
	public void list(String Inv) {
		System.out.println("List of the grocries");
		System.out.println("List is no:-1" + Inv);
	}
}

abstract class Layertwo extends Layerone {
	public void Price(float f) {
		System.out.println("prices of the item");
		System.out.println("Cost of item no;-1 is" + f);
	}
}

public class Intera_2 extends Layertwo {
	public void Quantity(int i) {
		System.out.println("Quantity of the items");
		System.out.println("Left over quantity is " + i);

	}

	public static void main(String[] args) {
		Intera_2 a = new Intera_2();
		a.list("Paste");
		a.Price(100.50F);
		a.Quantity(13);
		Store s = new Intera_2();
		s.list("aaa");
		s.Price(220.20F);
		s.Quantity(1);

	}



}
