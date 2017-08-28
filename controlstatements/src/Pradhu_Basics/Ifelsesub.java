package Pradhu_Basics;

import java.util.Scanner;

public class Ifelsesub {
	public void operation() {

		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int x = sc.nextInt();
		System.out.println("enter x value");
		if (x > 5) {
			System.out.println("x is greater");
		} else {
			System.out.println("x is smaller than initial value");
			sc.close();
		}
	}
}
