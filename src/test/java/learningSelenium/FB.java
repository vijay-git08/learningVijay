package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB {

	public static void main(String[] args) throws InterruptedException {

		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "G:\\Eclispe_New\\Learning\\DriverLatest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
      
//		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
//		
//		Thread.sleep(3000);
//
//
//		driver.findElement(By.xpath("//label[text()='Male']")).click();
//		
//		WebElement Year=  driver.findElement(By.xpath("//select[@id='year']"));
//		
//		Select s=new Select(Year);
//	    s.selectByIndex(4);
//	    
//	    driver.findElement(By.xpath("//label[text()='Female']")).click();
//	    Thread.sleep(5000);
//	    
	}

}
