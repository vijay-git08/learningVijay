package learningSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class nozamA {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","G:\\Eclispe_New\\Learning\\DriverLatest\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//driver.close();
		
		//Login
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vijaym.0082@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vijay@8858");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(3000);
						
		//Search Product
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
		 
		 driver.switchTo().window(child.get(0));
		
//		 driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();  // Add to cart in second page
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/div[10]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/form[1]/span[1]/span[1]/input[1]")).click();
//		
//		
//		//Signout
//		WebElement mouse= driver.findElement(By.xpath("//span[text()='Hello, vijay']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(mouse).perform();
//		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
//		String currentUrl= driver.getCurrentUrl();
//		System.out.println("url at last is "+ currentUrl);
//		
//		driver.quit();
//		
		
		
		
	}

}
