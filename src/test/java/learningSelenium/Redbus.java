package learningSelenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\Eclispe_New\\Learning\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		System.out.println("redbus launched");
		
		Thread.sleep(5000);
		
		 driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Porur");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//h1")).click();
		 
			Thread.sleep(5000);
			
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//div[@class='sc-htpNat kWSbju'])[2]"))));
			driver.findElement(By.xpath("(//div[@class='sc-htpNat kWSbju'])[2]")).sendKeys("Bangalore");

//		    WebElement dstElement = driver.findElement(By.xpath("(//div[@class='sc-htpNat kWSbju'])[2]"));
//			dstElement.clear();
//			dstElement.sendKeys("Bangalore");
//			 Thread.sleep(2000);
//
//			 driver.findElement(By.xpath("//h1")).click();
		
		 
	
//		
//		driver.findElement(By.xpath("(//div[@class='sc-ifAKCX gLwVlD'])[2]")).sendKeys("Kerala"+Keys.ENTER);
//		
//		List<WebElement> list=  driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//following::li"));
//		System.out.println(list.size());
//		int position=0;
//		for( WebElement webElement:list) {
//			System.out.println(webElement.getText());
//			position++;
//			
//			if (position==3) {
//				webElement.click();
//				break;
//				
//			}
		
			
		
			

	}

}
