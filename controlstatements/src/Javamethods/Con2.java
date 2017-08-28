package Javamethods;
public class Con2 {

	Con2()
	{
		System.out.println("nope");
		
	}
	Con2(float f){
		System.out.println("argument");
	}


	public static void main(String[] args) {
		Con2 p=new Con2();
		Con2 e=new Con2(10);

	}

}	
