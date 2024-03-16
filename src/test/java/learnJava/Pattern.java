package learnJava;

public class Pattern {

	public static void main(String[] args) {
		
		int row = 5;    //to print L pattern program
	 
		for(int i=0; i<row; i++) {
			
			for(int j=2*(row-i); j>=0;j--) {
			System.out.print(" ");
		}
			
		for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	
}	
		
//		int row=5;          // right " L" pattern program
//	
//		for(int i=0;i<row;i++) {
//			for(int j=2*(row-i);j>=0;j--) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
//		
//		
//}}//