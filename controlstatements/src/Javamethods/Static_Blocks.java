package Javamethods;

public class Static_Blocks {
	static int a;
	static {
		a=111;
	}
	static void disp() {
		System.out.println(Static_Blocks.a);
	}
	static {
		System.out.println("static block 1");
	
	}
	static {
		System.out.println("static block 2");
	}
	{
		System.out.println("instance block 1");
		
	}

	{
		System.out.println("instance block 2");
	}
	public static void main(String[] args) {
		Static_Blocks s =new Static_Blocks();
		new Static_Blocks();
		s.disp();
		
		
		
		
	}

}
