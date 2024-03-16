package learnJava;

import java.util.Arrays;

public class margana {

	public static void main(String[] args) {
          
		 String a="vija";
		 String b="jvia";
		 
//		 if(a.length()!=b.length()) {
//			 System.out.println("its not anagram");
//		 }
		 
		
			 char[] array1= a.toCharArray();
			 char[] array2= b.toCharArray();
			 
			 Arrays.sort(array1);
			 Arrays.sort(array2);
			 
			 
			 if(Arrays.equals(array1, array2)== true){
				 System.out.println("Anagram");
			 }
			 else {
				 System.out.println("Not anagram");
			 }
			 
		 }
		
	}


