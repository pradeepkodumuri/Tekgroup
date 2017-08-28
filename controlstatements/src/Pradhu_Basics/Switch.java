package Pradhu_Basics;

import java.util.Scanner;

class Switchsub {
	public void check() {
		System.out.println("enter i value");

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		switch (i) {
		case 0:
			System.out.println("i is zero");
			break;
		case 1:
			System.out.println("i is one");
			break;
		case 2:
			System.out.println("i is two");
			break;
		case 3:
			System.out.println("i is three");
			break;
		default:
			System.out.println("i is grater than three");

			sc.close();

		}

	}
}

public class Switch {

	public static void main(String[] args) {

		Switchsub s = new Switchsub();
		s.check();

	}

}
