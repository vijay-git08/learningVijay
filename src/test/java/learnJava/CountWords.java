package learnJava;

import java.util.Scanner;

public class CountWords {
	
	public static void main(String[] args) {
		
		String s="vijay vijay jay";
        int count=1;
        
        for(int i=0; i<s.length()-1; i++) {
        	
        	if((s.charAt(i)== ' ') && (s.charAt(i+1)!=' ')){
        		count++;
        	}
        			
        }
	System.out.println("counting given words using for loop "+ count);
	}
}
//
//	public static void main(String[] args) {
//		System.out.println("Enter the word");
//		Scanner sc=new Scanner(System.in);
//		
//		String s=sc.nextLine();
//		int count=1;
//		
//		for(int i=0;i<s.length()-1; i++) {
//			if ((s.charAt(i)== ' ') && (s.charAt(i+1)!=' ')) {
//				
//				count++;
//				
//			}
//		}
//		
//		System.out.println("counted word is:"+count);
//		
//		
//
//	}
//
//}
