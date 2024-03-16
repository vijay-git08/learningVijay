package learningSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "G:\\Eclispe_New\\Learning\\DriverLatest\\chromedriver.exe");
		
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("vijay");
		String vj=driver.findElement(By.name("q")).getAttribute("value");
		System.out.println("Input Value:"+vj);
		
		
		String vj2=driver.findElement(By.name("q")).getAttribute("placeholder");
		System.out.println("Inner Boc Value" +  vj2);
		
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);		Thread.sleep(3000);
         
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("apple");
//		Thread.sleep(3000);
//		List<WebElement> vj=driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//following::li"));
//		
//		
//		for(WebElement webElement : vj) {
//			System.out.println(webElement.getText());
//		}
////		driver.quit();

       
		// 1 --------take screen shot
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File screen=ts.getScreenshotAs(OutputType.FILE);
//		File f=new File("G:\\Eclispe_New\\Learning\\screenshot\\0.png") ;
//		FileUtils.copyFile(screen, f);
//		driver.quit();
		/*
		 * File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(f, new File
		 * ("G:\\Eclispe_New\\Learning\\screenshot\\Vijay.png"));
		 */
		driver.close();

		
		
		
           
	}

}
