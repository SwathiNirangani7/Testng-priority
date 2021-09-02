package TestNGpriority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Testng {
	WebDriver driver;
	 @Test (priority=1)
		public void test() throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			 driver = new ChromeDriver();
			System.out.println("Welcome  to Google...");
			
			
		}
	 	
	    @Test (priority=2)		
	    public void launchGoogle() {				
	    	
			driver.get("http://www.google.co.in");
			
	    }		

	 		
	    @Test (priority=3)		
	    public void peformSeachAndClick1stLink() throws InterruptedException {	
	    	
	        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("facebook");
	        Thread.sleep(4000);
	        driver.close();
	    }	   	
	}
