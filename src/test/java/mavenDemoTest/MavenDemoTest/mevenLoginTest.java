
package mavenDemoTest.MavenDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mevenLoginTest 
{
	
	WebDriver driver;
	@BeforeMethod
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://mistcloud.efleetsystems.com/login");
		
	}
	
	@Test
	public void BLRLlogin()
	{
	  driver.findElement(By.id("subscriberName")).sendKeys("blrl");
	  driver.findElement(By.id("userName")).sendKeys("blrmumbai");
	  driver.findElement(By.id("password")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  String expected="https://mistcloud.efleetsystems.com/dashboard";
	  String actual= driver.getCurrentUrl();
	  Assert.assertEquals(actual, expected);
	  System.out.println("Logged in");
	  
	    Actions sel= new Actions(driver);
	    WebElement option = driver.findElement(By.xpath("//div[@class='logged-user-i']"));
	   sel.moveToElement(option).perform();
	  // Thread.sleep(1000);
	    driver.findElement(By.xpath("//li/a[@href='/login']")).click();
	    System.out.println("Logged out");
	  
	}
	
	@Test
	public void JMLogin()
	{
		
		 driver.findElement(By.id("subscriberName")).sendKeys("jmipl");
		  driver.findElement(By.id("userName")).sendKeys("avinash");
		  driver.findElement(By.id("password")).sendKeys("9850917845");
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  try {
			Thread.sleep(00);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  String expected="https://mistcloud.efleetsystems.com/dashboard";
		  String actual= driver.getCurrentUrl();
		  Assert.assertEquals(actual, expected);
		  System.out.println("Logged in");
		  
		  Actions sel= new Actions(driver);
	    WebElement option = driver.findElement(By.xpath("//div[@class='logged-user-i']"));
	   sel.moveToElement(option).perform();
	  // Thread.sleep(1000);
	    driver.findElement(By.xpath("//li/a[@href='/login']")).click();
	    System.out.println("Logged out");
	  
	}
	
	@AfterMethod
	
	public void close()
	{
		driver.close();
	}
	
	

}
