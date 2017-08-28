package Javamethods;

public class Array2 {
	 void Met() {
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.println(i);

		}
		for (int ab : a) {
			System.out.println(ab);

		}
		System.out.println(a[0]);
		System.out.println(a[  1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	}

	public static void main(String[] args) {
		Array2 ah=new Array2();
		ah.Met();

	}

}
