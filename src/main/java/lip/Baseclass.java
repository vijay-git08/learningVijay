package lip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	//public static void main(String[] args) {

	//public static WebDriver driver;

		
		public static WebDriver browserLaunch () {

		
		    System.setProperty("webdriver.chrome.driver", "G:\\Eclispe_New\\Learning\\Driver\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		
		}
	
}

