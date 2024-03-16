package learnJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

import io.cucumber.java.sl.In;
import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		
		
		 
		       //create ArrayList 
		       ArrayList<String> colors = new ArrayList<String>();
		       //add elements to the ArrayList using add method
		       colors.add("Red");
		       colors.add("Green");
		       colors.add("Blue");
		       colors.add("Red");
		       //print the ArrayList
		       System.out.println("Content of ArrayList:  "+colors);
		   
		
		       
		       ArrayList<Integer> start=new ArrayList<Integer>(Arrays.asList(1,1,1,2,2,3,4,4));
		       
		       LinkedHashSet<Integer> content=new LinkedHashSet<Integer>(start);
		       ArrayList<Integer> remove=new ArrayList<Integer>(content);
		       
		       System.out.println(remove);
	}

}
