package Javamethods;

public class Set_Method {
	int Book_ID;
	String Book_Name;
	private Float Book_Cost;
	String Book_Author;
	public Float getBook_Cost() {
		return Book_Cost;
		
	}
	public void setBook_Cost(Float book_Cost) {

		if(Book_Cost>70.00f) {
			System.out.println("Cost is more");
			return;
		}
		this.Book_Cost = book_Cost;
	}
	
	
}
  