package Javamethods;

import java.util.Scanner;

public class Keyboard {

	void Add() {
		System.out.println("enter a value");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int f = s.nextInt();
		
		int z= a+f;
		System.out.println("total value"+ z);
		s.close();
	
	}

	public static void main(String[] args) {
		Keyboard a = new Keyboard();
		a.Add();

	}

}
