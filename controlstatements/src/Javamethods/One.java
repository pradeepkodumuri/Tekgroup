package Javamethods;
/*
1st- java is Object Oriented Programming Language what the heck it meanx?
it means u need classes and object to run a particular thing 


privATE, PUBLIC 



*/



class Super {
	int a = 10;
	int b = 20;

}
public class One extends Super {
	int a=100;
	int b=200;

	void Methodmm(int a, int b) {
		System.out.println("Method mm");
		System.out.println("sum of a and b is" + a+b);
		System.out.println("sum of a and b is "+ this.a+this.b);
		System.out.println("sum of a and b is "+ super.a+super.b);
		
	}
	public static void main(String[] args) {
		One o = new One();
		o.Methodmm(5,5);
	}

	
}
