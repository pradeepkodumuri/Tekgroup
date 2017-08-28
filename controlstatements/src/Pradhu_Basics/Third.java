package Pradhu_Basics;

public class Third extends Second {
	public void result(int x,int y)
	{
	  if(x<y)
	 
    {
	  System.out.println("x = "+x+" y= "+y);
	System.out.println("X is lesser than Y");
	x=x*2;
	}
  
  if(x==y)
	  
  {
			System.out.println("x = "+x+" y= "+y);
		
	  System.out.println("X is equal to Y");
	
	  x=x*2;
  }
  
 
  if(x>y)
	  
  {
	  System.out.println("x = "+x+" y= "+y);
		
	  System.out.println("X is greater than Y");
  }
}
}
