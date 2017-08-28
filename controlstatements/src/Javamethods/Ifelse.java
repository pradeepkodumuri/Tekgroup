package Javamethods;
import java.util.Scanner;


class Ifsub{
	void m1() {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter a String");
		sc.close();
		if(str.equals("hi") ) {
			System.out.println("String is hi");
			if(str.equals("Hello")) {
				System.out.println("String is Hello");
			}
			else 
			{
				System.out.println("Enterred string is out of memory");
			}
			
		}
		
		
	}
public static void main(String[] args) {
	Ifsub bb=new Ifsub();
	bb.m1();
}
	
}
	
