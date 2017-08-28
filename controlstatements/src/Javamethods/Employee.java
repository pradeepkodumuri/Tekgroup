package Javamethods;
 
public class Employee {
	int a;
	String str;
	float f;
	double d;
	Employee (int a, String str, float f, double d){
		this.a=a;
		this.str=str;
		this.f=f;
		this.d=d;
		
		
	}
void disp() {
	System.out.println("empid=" +a);
	System.out.println("empname=" +str);
	System.out.println("ratio=" +f);
	System.out.println("factor=" +d);
	
}
	public static void main(String[] args) {
     
		Employee e=new Employee(10, "RAM", 10.50f, 88.50);
		e.disp();
		Employee e1=new Employee(22,"RAJ",10.11f,19.50);
		e1.disp();
		

	}

}
