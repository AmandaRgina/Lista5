package funcaoN;


public class FuncaoN {

	public static  void main(String[] args) {
		
		repeteN2(10);

	}
	
	public static void repeteN(int N) {
		
		for (int x = 1; x<=N; x++) {
			int y = x;
			while(y>0) {
				System.out.print(y+" ");
				y--;
			}
			System.out.println("");
			
		}
		
	}
	
	
	public static void repeteN2(int N) {
		
		for (int x = 1; x<=N; x++) {

			int y = x;
			int j = 1;
			
			while(y>0) {
				
				System.out.print(j +" ");
				
				y--;
				j++;
				
				
			}
			
			System.out.println("");
			
		}
		
	}

}