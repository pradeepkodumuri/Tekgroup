package Javamethods;

class Emp {

}

class Student {

}

class Jvm {

}

class Uml {

}

public class Method3 {
	void m1(Emp e, Student s) {
		System.out.println("m1 mehtod");
	}

	static void m2(Jvm j, Uml u) {
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
Method3 m=new Method3();
Student s1=new Student();
Emp e1=new Emp();
m.m1(e1,s1);
Jvm j=new Jvm();
Uml u=new Uml();
Method3.m2(j, u);


	}

}
