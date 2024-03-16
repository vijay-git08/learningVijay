import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.client.model.geojson.Position;

import tech.grasshopper.pdf.structure.Display;

public class learningList {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\Eclispe_New\\Learning\\DriverLatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Maths");
		
		Thread.sleep(3000) ;
	    List<WebElement> list=	driver.findElements(By.xpath("//*[@role='listbox']//following::li"));
	    
//	    for(WebElement allValues:list) {
//	      	//System.out.println(allValues.getText());  / to print all values
//	    }
	 
	    int position=0;             // to printed selected text
	    for(WebElement allVlues: list) {
	    	position++;
	    	
	    	if (position==3) {
	    		System.out.println(allVlues.getText());
	    			allVlues.click();	    		
	    		}
	    	}
			
	    
	    List<WebElement> allLinks= driver.findElements(By.xpath("//a"));
		       for(WebElement li: allLinks) {
		       	System.out.println(li.getAttribute("href"));
		        }
			
		
		
	   //driver.close();
		 
	 }
		   
	  
  
   
	


	     
	   

	

}
