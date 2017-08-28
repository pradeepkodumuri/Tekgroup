package Javamethods;

public class Pass2 {
	Pass2(float a) {
		a=a*10;
		System.out.println("print a value" +   a);
	}
	

	Pass2(int b) {
		b=b++;
		System.out.println("print b value" + b);
	}

	public static void Met(int value) {
		value=--value;
		System.out.println("print int value" + value);
	
	}
	public void Met2(double dd) {
		System.out.println("print double value"+ dd);
	}

	public static void main(String[] args) {
		float a = 10.5F;
		Pass2 op = new Pass2(a);
		op.Met2(10.5);
		int b=10;
		Pass2 poo=new Pass2(b);
		Met(100);
		

	}

}
