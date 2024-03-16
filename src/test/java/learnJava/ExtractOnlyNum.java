package learnJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExtractOnlyNum {

	public static void main(String[] args) throws IOException {

		
//		
//		String mix="vij789";
//		
//		String value= mix.replaceAll("[^0-9]", "");   //[0-9] then output is only alpha
//		
//		System.out.println(value);
		
		FileInputStream flocation=new  FileInputStream("C:\\Users\\Aswanth\\Desktop\\ExcelDatas.xlsx") ;
	    
	    XSSFWorkbook wbook=new XSSFWorkbook(flocation);
	    XSSFSheet sheet=  wbook.getSheetAt(0);
	     
	     
	     int lastrow= sheet.getLastRowNum();
	     short lastcolumn= sheet.getRow(0).getLastCellNum();
	      
	     for(int i=1;i<lastrow;i++) {
	    	 XSSFRow row= sheet.getRow(i);
	    	 
	    	 for(int j=0;j<lastcolumn;j++) {
	    	XSSFCell column= row.getCell(j);
	    	String value=  column.getStringCellValue();
	    	
	    	System.out.println(value);
	     }
	      
	     }
	}

}
