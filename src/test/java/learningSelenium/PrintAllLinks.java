package learningSelenium;import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\Eclispe_New\\Learning\\DriverLatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("who" + Keys.ENTER);
		
		List<WebElement> alllinks=  driver.findElements(By.xpath("//a"));
		 for( WebElement links: alllinks) {
			 
			 System.out.println ( links.getAttribute("href"));
			 
			// driver.close();		
			 }
		
		
		
		
		//		
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("apple"+Keys.ENTER);
//		Thread.sleep(2000);
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scroll(0,800)", "");
//		Thread.sleep(2000);

//		js.executeScript("window.scroll()", "");

		//     //   driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).sendKeys(Keys.ENTER);	
		//		Thread.sleep(3000);
		//        List<WebElement> allLinks= driver.findElements(By.xpath("//a"));
		//        for(WebElement li: allLinks) {
		//        	System.out.println(li.getAttribute("href"));
		//        }


	}

}
