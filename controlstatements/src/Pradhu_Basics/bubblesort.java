package Pradhu_Basics;

class values {

	public void sort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int j = 0; j < n; j++) {
			System.out.print(a[j] + " ");
		}
	}

}

public class bubblesort {

	public static void main(String[] args) {
		int[] a = { 15,8,32,7,64,0 };
		values v = new values();
		v.sort(a);

	}

}
