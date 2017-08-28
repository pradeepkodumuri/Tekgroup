package Javamethods;

public class Get_Method {

	public static void main(String[] args) {
		Set_Method sm = new Set_Method();
		sm.Book_ID = 1;
		sm.Book_Name = "JAVA";
		//*sm.Book_Cost = 50.50f;
		sm.setBook_Cost(50.50f);
		sm.Book_Author = "DP";
		
		
		Set_Method sa=new Set_Method();
		sa.Book_ID = 2;
		sa.Book_Name = "JAVA";
		//*sa.Book_Cost = 60.60f;
		sa.setBook_Cost(60.60f);
		sa.Book_Author = "PRADEEP"; 
		
		
		Set_Method GA=new Set_Method();
		GA.Book_ID = 3;
		GA.Book_Name = "JAVA";
		//*GA.Book_Cost = 700.50f;

		GA.setBook_Cost(700.50f);
		GA.Book_Author = "JVM";
	System.out.println(sm.Book_Author);
	}

}
