package Javamethods;
interface Base1{ 				//nested interface
	interface Base2{			//interface inside the base1interface	
		void Intamet(String a); 		//by default abstract method and public access wit no implementation
	}
	
}

public class Nested_Intra implements Base1.Base2{
public void Intamet(String a) {
	System.out.println("this is the first method of nested interface");
	System.out.println("the value of first method is" +   a);
	
}	

	public static void main(String[] args) {
		Nested_Intra i=new Nested_Intra();
		i.Intamet("RAM");					//Named object creation
		
		new Nested_Intra().Intamet("RAJU");		//Nameless object creation
		
		
		
		

	}

}
