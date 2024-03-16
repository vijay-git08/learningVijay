package learnJava;

public class PrimeOrNot {

//	public static void main(String[] args) {
//		
//		 
//		int num=53;   // if the given number divisible by " 1 " or " byitself"  then it is prime number
//		int tem=0;
//		
//		for(int i=2;i<=num/2;i++) {
//			
//			if(num%i==0) {
//				tem=tem+1;
//				break;
//			}
//			
//		}
//		
//		if(tem==0) {
//			System.out.println("Prime");
//		}
//		else {
//			System.out.println("Not Prime");
//		}
//		
//}
//
//}

public static void main(String[] args) {
	
	int num=11;
	int temp=0;
	
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			temp=temp+1;
			break;
		}
	}
	if(temp==0) {
		System.out.println("Prime");
		
	}
	
	}
	
}
