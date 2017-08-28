package Javamethods;
class Bottom{					//Base class
	interface one{				//BAse class having the interface inside
		void Fmet(int t);		//interface having default abstract method with one arg
	}
}

public class Nested_Intra2 implements Bottom.one{  //normal class implements Bottom class and interace
	public void Fmet(int t) {				//this is called "MAP.ENTRY" implemtation 
		System.out.println("Class can have interface");  //Method implementaion
		System.out.println("the value is" +  t);
		
	}
	

	public static void main(String[] args) {
		Nested_Intra2 e=new Nested_Intra2();
		e.Fmet(20);
		new Nested_Intra2().Fmet(50);

	}

}
