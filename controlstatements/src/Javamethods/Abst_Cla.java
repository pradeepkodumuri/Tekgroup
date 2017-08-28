package Javamethods;
  abstract class Name{
	void first() {
		System.out.println("noramal first method");
		
	}
	void second() {
		System.out.println("normal second method");
		
	}
	abstract void third(); 
	void fourth() {
		System.out.println("normal fourth method");
	}
	abstract void fifth();
	
}

public class Abst_Cla extends Name {
	void third() {
		System.out.println("Abstract third method");
	}

	void fifth(){
		System.out.println("Abstract fifth method ");
	}
	void first() {
		System.out.println("Method override");
	}
	public static void main(String[] args) {
		//*noraml object creation
		Abst_Cla a=new Abst_Cla();
		a.third();
		a.fifth();
		a.first();
		a.second();
		a.fourth();
		//*parent class to child class object creation
		//*Parent class p=new childclass();
		Name n=new Abst_Cla();
		n.third();
		n.fifth();
		
	
	}
	

}
