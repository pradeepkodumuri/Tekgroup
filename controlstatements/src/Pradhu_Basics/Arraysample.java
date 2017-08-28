package Pradhu_Basics;

public class Arraysample {

	public static void main(String[] args) {
		Subclass s = new Subclass();
		s.operations();

	}

}

class Subclass {

	public void operations() {
		int[] a = { 10, 20, 30, 40, 50 };
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
	}
}
