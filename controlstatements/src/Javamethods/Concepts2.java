package Javamethods;

class c1 {
}

class c2 {
}

class c3 {
}

class c4 {
}

class X {
	void K(c1 a, c2 b) {
		System.out.println("method one");

	}


public static void T(c3 u, c4 w) {
		System.out.println("method two");
	}

}

public class Concepts2 {

	public static void main(String[] args) {
		X QQ=new X();
		c1 CC=new c1();
		c2 RR=new c2();
		QQ.K(CC,RR);
		c3 NN=new c3();
		c4 SS=new c4();
		X.T(NN,SS);
	}


}

