package learnJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void main(String[] args)  {
		
		int row = 5;    //to print L pattern program
	
	    for( int i=0;i<=row;i++) {
	    	
	    	for(int j=2*(row-i);j>0;j--) {
	    		System.out.print(" ");
	    	}
	    	for(int j=0;j<i;j++) {
	    		System.out.print("* ");
	    	}
	    	System.out.println(" ");
	    }
	}
}
		