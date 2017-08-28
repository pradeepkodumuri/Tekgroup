package Javamethods;
class Concepts {
  static void AA(int a,String str) {
		System.out.println("first method");
		System.out.println(a);

		System.out.println(str);
	}
  void BB(double d, char c)
  {
	  System.out.println("second method");

		System.out.println(d);

		System.out.println(c);
  }


public static void main(String[] args)
{

	Concepts a=new Concepts();
	Concepts.AA(10,"Mat");
	a.BB(10.56,'B');
	
	
	
}
}
