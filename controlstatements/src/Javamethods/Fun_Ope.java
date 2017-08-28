package Javamethods;
interface Banking{
	void Account1(String name, String address);
	void Balance1(float present_balance,float final_balance);
	void Check1(String account_info);
	
}

public class Fun_Ope implements Banking{
	public void Account1(String name, String address){
		System.out.println("Details of the account");
		System.out.println("Name of the account" +name);
		System.out.println("Address of the acc holders is " +address);
			}
	public void Balance1(float present_balance,float final_balance) {
		System.out.println("Banlace details of the customer");
		System.out.println("present balance of the customer is "+present_balance);
		System.out.println("Final balance of the customer is "+final_balance);
	}
	public void Check1(String account_info) {
		System.out.println("check the account information");
		System.out.println("the account info of the customer is"+ account_info);
	}


	public static void main(String[] args) {
		Fun_Ope e=new Fun_Ope();
		e.Account1("Dileep", "Miyapur");
		e.Balance1(500.50F, 1000.50F);
		e.Check1("account type is savings");
		
		
		Banking h=new Fun_Ope();
		h.Account1("PRADIP", "Khammam");
		h.Balance1(8000.50F, 100000.520F);
	    h.Check1("Account type is cheking");	
		
		
	}
}
