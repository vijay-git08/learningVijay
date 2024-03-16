package learnJava;

public class PalindromeString {
//
//	public static void main(String[] args) {
//		
//		
//		String vj="Tat ene";
//		
//		String rev="";
//		
//		int length= vj.length();
//		
//		for(int i=length-1;i>=0;i--){
//			rev=rev+vj.charAt(i);
//		}
//	
//	if (vj.equals(rev)) {
//		
//		System.out.println("Its palindrome "+ vj);
//	}
//	
//	else {
//		System.out.println("Its not Palindrome "+ vj);
//	}
//}
//}


//class HelloWorld {
    public static void main(String[] args) {
      
      String s= "Prabhakaran ";
      String rev=" ";
      
      int len =s.length();
      
      for (int i=len-1;i>=0;i--){
          rev=rev+s.charAt(i);
      }
      
    {
    if( s.equals(rev)){
        System.out.println("Its Palindrome" +s);
    }
    else{
    	System.out.println("Its not Palindrome");
       }
    }
    }
}