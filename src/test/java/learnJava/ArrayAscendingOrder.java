package learnJava;

import java.util.Arrays;
import java.util.Collections;

public class ArrayAscendingOrder {

	public static void main(String[] args) {
		
		int a[]= {9,2,4,1,6,3};
		
		Arrays.sort(a);
		
		System.out.println("min is" +a[0]  + " max is" +a[a.length-1]);// to know maxmium and minimu use this

	//	System.out.println(Arrays.toString(a));   //use to print in ascending order
	
	}
//
}

//	
//	public static void main(String[] args) {
//	  Integer a[]= {5,7,9,8};
//	  
//	  System.out.println("Before reverse:"+Arrays.toString(a));
//	  Arrays.sort(a,Collections.reverseOrder());
//	  
//	  System.out.println("After reverse:"+Arrays.toString(a));
//	
//	}
//	}