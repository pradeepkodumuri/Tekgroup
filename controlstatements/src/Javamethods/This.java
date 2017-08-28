package Javamethods;
class Operations{
	int a;
	String str;
	Operations(int a,String str){
		this.a=a;
		this.str=str;
		
	}
	void display() {
		System.out.println("value of a" +a);
		System.out.println("value of string" +str);
	}
}
public class This {

	public static void main(String[] args) {
		Operations o1=new Operations(10,"DP");
		o1.display();
		Operations o2=new Operations(20,"Pradip");
		o2.display();

	}

}
