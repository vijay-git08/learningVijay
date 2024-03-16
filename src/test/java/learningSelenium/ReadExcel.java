package learningSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
	
		FileInputStream Flocation=new FileInputStream("G:\\ExcelLearning.xlsx");
		
	    XSSFWorkbook wbook=new XSSFWorkbook(Flocation);
	    XSSFSheet sheet=  wbook.getSheetAt(0);
	    
	    int lastRow=sheet.getLastRowNum();
	    short lastColumn=sheet.getRow(0).getLastCellNum();
	    
	    for(int i=1;i<=lastRow;i++) {
	    XSSFRow row=sheet.getRow(i);
	    
	    for(int j=0;j<lastColumn;j++) {
	    	XSSFCell cell= row.getCell(j);
	    	
//	    	DataFormatter df=new DataFormatter();
//	    	String value=df.formatCellValue(cell);
//	    	
	    	
	    	String value= cell.getStringCellValue();
	    	System.out.println(value);
	    	
	    }
	    	
	    	
	    }
	
	}
	}
