package Javamethods;
class down{
	void Me1(int a){
		System.out.println("First method result is a="+ a);
		
	}
	void Me1(char ch){
		System.out.println("second method result is ch="+ ch);
	}
	void Me1(char ch, int a){
		System.out.println("third method result is ch & a=" +ch +a);
	}
	
}
public class Moverload {

	public static void main(String[] args) {
		new down().Me1(10);
		new down().Me1('g');
		new down().Me1('m', 80000);
			

	}

}

