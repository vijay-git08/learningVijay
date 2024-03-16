package learnJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Eclispe_New\\Learning\\DriverLatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple"+Keys.ENTER);
		 
		 driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Blue'])[3]")).click();
		 
		 
		  Set<String> childwindow= driver.getWindowHandles();
		  System.out.println("This is child window url "+childwindow);
		  
		 
		  List<String> currentwindow=new ArrayList<String>(childwindow);
		 
		  driver.switchTo().window(currentwindow.get(1));
		  
		  driver.findElement(By.xpath("(//span[@class='nav-a-content'])[1]")).click();
		  
		  driver.switchTo().window(currentwindow.get(0));
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		  	
		  
		  
		
		

	}

}
