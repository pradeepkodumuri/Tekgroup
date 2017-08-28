package Javamethods;

abstract class O {
	abstract void KK();

	abstract void JJ();

	abstract void LL();

	abstract void TT();

}

abstract class Taa extends O {
	void KK() {
		System.out.println("This is KK method");
	}
}

abstract class Th extends Taa {
	void JJ() {
		System.out.println("this is JJ method");
	}
}

abstract class Ma extends Th {

	void LL() {
		System.out.println("this is LL method");
	}

}

public class Ab extends Ma {
	void TT() {
		System.out.println("this is TT method");
	}

	public static void main(String[] args) {
		// *parentclass p= new childclass();
		Ab a=new Ab();
		a.TT();
		a.LL();
		a.JJ();
		a.KK();
		

	}
}
