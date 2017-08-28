package Javamethods;

abstract class Ab_2 {
	Ab_2(int a) {
		System.out.println("Constructor for abstract class");
	}

	abstract void Pop();
}

public class Ab_1 extends Ab_2 {
	void Pop() {
		System.out.println("Parent class abstrct method implementaion");
	}
	Ab_1(){
		super(100);
		System.out.println("Constructor for child class");
	}

	public static void main(String[] args) {
		new Ab_1().Pop(); 
		

	}

}
