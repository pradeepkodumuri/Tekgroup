package Javamethods;

public class method2 {

		void m1(int a, char ch) {
			System.out.println("m1 mehtod");
			System.out.println(a);
			System.out.println(ch);
		}

		static void m2(float f,String s) {
			System.out.println("m2 method");
			System.out.println(f);
			System.out.println(s);
		}

		public static void main(String[] args) {
			method2 b = new method2();
			b.m1(10,'G');
			
			method2.m2(10.5f,"Pradip");
		}
	}


