package learnJava;

public class numberdivby10 {

	public static void main(String[] args) {

		
		for(int i=1;i<1000;i++) {    // modulus gives reminder and division gives quotient
			if(i%10==0) {
				
				System.out.println("Number divisible by 10 is " +i);
			}
			
		}
	}

}
