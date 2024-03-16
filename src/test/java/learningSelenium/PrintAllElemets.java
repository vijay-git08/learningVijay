package learningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import lip.Baseclass;



public class PrintAllElemets extends Baseclass {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


		  System.setProperty("webdriver.chrome.driver", "G:\\Eclispe_New\\Learning\\DriverLatest\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("vijay");
			Thread.sleep(4000);

			List<WebElement>  vj= driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//following::li"));
			
			System.out.println(vj.size());
	
			
			
			for(WebElement allvalues: vj) {
			//	System.out.println("print " +webElement.getText());
				String text=allvalues.getText();	
				System.out.println(text);
				if (text.contains("vijay makkal iyakkam")) {
					allvalues.click();
					break;	
				}
				else {
					System.out.println("Nothing Present");
				}
			}
			
		//driver.quit();
	}

}
