
package learnJava;

public class CountCharacter {

	public static void main(String[] args) {
		
		
		String s= "vijay vijay jay";
		
		
		int total=s.length();
		int selected=s.replace("y", "").length();
		int FinalCount=total-selected;
		
		System.out.println("Counted word value using methods: " +FinalCount);
		
		
	}

}
