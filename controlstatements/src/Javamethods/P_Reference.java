package Javamethods;
class Refe{
	void ref1(){
		System.out.println("parent method 1");
		
	}
	void ref2()
	{
		System.out.println("parent method 2");
		
	}
}

public class P_Reference extends Refe {
	void ref1() {
		System.out.println("child method 1");
	}
	void ref3() {
		System.out.println("child method 2");
	
		
	}
	

	public static void main(String[] args) {
	Refe r= new P_Reference();
	r.ref1();
	r.ref2();
	P_Reference s=(P_Reference)r;
	s.ref3();
	
	}

}
