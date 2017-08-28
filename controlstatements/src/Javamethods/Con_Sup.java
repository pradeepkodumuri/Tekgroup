package Javamethods;

class Operation11 {

	Operation11(String str) {
		System.out.println("Zero arg costrcutor");
	}
}

public class Con_Sup extends Operation11 {
	Con_Sup() {
		this(20);

		System.out.println("Child no args");

	}

	Con_Sup(int a) {

		super("RAM");

		System.out.println("Child one arg");
	}

	public static void main(String[] args) {

		Con_Sup c = new Con_Sup();

	}

}
