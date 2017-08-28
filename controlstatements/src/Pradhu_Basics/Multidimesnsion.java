package Pradhu_Basics;

class Musltisub{
	public void array(){
		
	
	int[][] aryNumbers = new int[4][3];
	aryNumbers[0][0]=10;   aryNumbers[1][0]=44;
	aryNumbers[0][1]=20;   aryNumbers[1][1]=55;
	aryNumbers[0][2]=30;   aryNumbers[1][2]=65;
    
	aryNumbers[2][0]=50;   aryNumbers[3][0]=90;
	aryNumbers[2][1]=60;   aryNumbers[3][1]=80;
	aryNumbers[2][2]=70;   aryNumbers[3][2]=70;
	
		int rows=4;
		int columns=3;
		int i,j;
		for(i = 0; i < rows; i++) {
			for(j = 0; j < columns; j++) {
				System.out.print(aryNumbers[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	
}
public class Multidimesnsion {
	public static void test() {
		 Musltisub m=new Musltisub();
		    m.array();
		
	}

	public static void main(String[] args) {
		test();
		
	}

}
