package Javamethods;


	public class Sub_Ref {
		public int ID;
		public String Name;
		public Float Salary;
		public Double Annnual_Cost;

	

	public static void main(String[] args) {
		Sub_Ref r = new Sub_Ref();
		r.ID = 77;
		r.Name = "RAJ";
		r.Salary = 1000.00F;
		r.Annnual_Cost = 5000.50;
		Main_Ref fff = new Main_Ref();
		fff.Mee(r);
	}

}

	
	
	class Main_Ref{

		public void Mee(Sub_Ref r) {
		
			
		}
		
  	}