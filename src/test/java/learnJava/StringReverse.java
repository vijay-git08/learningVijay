package learnJava;

public class StringReverse {

	public static void main(String[] args) {

		
		String str="vijay";
		String rev= " ";
		
		
		int len=str.length();
		for(int i=len-1; i>=0; i--)
		
		{
            rev=rev+str.charAt(i);
          // System.out.print(rev);
		}
		
		System.out.println(rev);
	}

}
