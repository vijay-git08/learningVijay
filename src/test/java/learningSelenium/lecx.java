package learningSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jxl.Sheet;

public class lecx {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		//Launching Browser
		System.setProperty("webdriver.chrome.driver","G:\\Eclispe_New\\Learning\\DriverLatest\\chromedriver.exe" );
		        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		

	    // Reading Datas From Excel
		FileInputStream Flocation=new FileInputStream("C:\\Users\\Aswanth\\Desktop\\ExcelDatas.xlsx");	
	    XSSFWorkbook wbook=new XSSFWorkbook(Flocation);
	    XSSFSheet sheet=  wbook.getSheetAt(0);
	    
	    int lastRow=sheet.getLastRowNum();
	    short lastColumn=sheet.getRow(0).getLastCellNum();
	    
	    for(int i=1;i<=lastRow;i++) {
	    XSSFRow row=sheet.getRow(i);
	    
	    String username= row.getCell(0).getStringCellValue();
	    String password= row.getCell(1).getStringCellValue();
	   
	   
	    
	    // Passing values to from Excel to Webapp
	    driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(3000);
						
	   
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Blue'])[1]"))).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/div[1]/img[1]")).click();
		Thread.sleep(3000);
		
		//Moving to next page 
		 Set<String> windowhandles=driver.getWindowHandles();
		 System.out.println("window one "+ windowhandles);
		 List<String> child=new ArrayList<String>(windowhandles);
		 driver.switchTo().window(child.get(1));
		 System.out.println(driver.getCurrentUrl());
		
		 driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();  // Add to cart in second page
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[10]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/form[1]/span[1]/span[1]/input[1]")).click();
		
		
		//Signout
		WebElement mouse= driver.findElement(By.xpath("//span[text()='Hello, vijay']"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
		String currentUrl= driver.getCurrentUrl();
		System.out.println("url at last is "+ currentUrl);
		
		driver.quit();
		
	    	
	    	
	    	
	    	
	    }}}