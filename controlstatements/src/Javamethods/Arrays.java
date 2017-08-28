package Javamethods;

public class Arrays {
	static void operation() {
		int[] a = { 5, 4, 3, 2, 1, 0 };
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int aa : a) {
			System.out.println(aa);
		}
	}

	public static void main(String[] args) {
		Arrays.operation();

	}

}
