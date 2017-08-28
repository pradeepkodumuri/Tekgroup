package Javamethods;
class sub{
	sub(int a){
		a=a+10;
		System.out.println("The value of x in sub"+a);
	}
}
public class Passing {

	public static void main(String[] args)
	{
		int a=30;
sub ss=new sub(a);
System.out.println("The value of x in main" + a);


	}

}
