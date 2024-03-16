package learnJava;

public class OddandEven {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		for(int value:a) {
			if(value %2==0)
				System.out.println("Even number is" + value);
		}
		
		
		for(int value:a) {
		if(value %2!=0) {
			System.out.println("Odd number is"+ value);
			
		}
		}
	}

}
	
	
//	public static void main(String[] args) {
//		
//	
//		int num=1;
//		if(num%2==0) {
//			System.out.println("Its Even "+num);
//		}
//		
//		else {
//			System.out.println("Its odd is " + num);
//		}
//	
////		
////		if(num%2!=0) {
////			System.out.println("Its Odd ");
////		}
//	}
//	}
