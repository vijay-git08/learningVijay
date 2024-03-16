package learnJava;

import java.lang.reflect.Array;
import java.util.Arrays;


//public class xam {
//
//	public static void main(String[] args) {
//		
//		
//		
//	int a=10,b=20,c=30;
//	
//	if(a>b && a>c) {
//		System.out.println("max of " +b);
//	}
//		
//		
//		
//	}
//
//}

public class xam {

	public static void main(String[] args) {
		
		int a = 50, b = 20, c = 30;
		
		if (a > b && a > c) {
			System.out.println("Max of a: " + a);
		} else if (b > a && b > c) {
			System.out.println("Max of b: " + b);
		} else {
			System.out.println("Max of c: " + c);
		}
	}
}