package Pradhu_Basics;

public class Selection {
	void opt() {
		int[] arr = { 3, 88, 66, 75, 22,40};
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < (n - 1); j++) {
				int k = j + 1;
				int a = arr[j];
				int b = arr[k];
				if (b < a) {
					int temp1 = a;
					int temp2 = b;
					arr[j] = b;
					arr[k] = a;
				}
				
				
			}
			
		}

		for(int d=1;d<n;d++) {
			System.out.println(arr[d]+"");
			}		
	}
	

	public static void main(String[] args) {
		Selection Sc = new Selection();
		Sc.opt();

	}

}
