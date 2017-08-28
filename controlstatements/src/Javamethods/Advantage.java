package Javamethods;

public class Advantage {
int a;
float b;
String str;
Advantage(){
	a=10;
	b=10.50f;
	str="RAMANA";
}

void disp() {
	System.out.println("enter integer"+a);
	System.out.println("enter float"+b);
	System.out.println("enter string"+str);
	
}
	public static void main(String[] args) {
		Advantage a=new Advantage();
		a.disp();
		

	}

}
