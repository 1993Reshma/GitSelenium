package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4j_Tutorial {
	WebDriver driver;
	
  @Test
  public void googlesearch() {
	  Logger log= Logger.getLogger("Search");
	  PropertyConfigurator.configure("Log4j.properties");
	  driver = new ChromeDriver();
	  log.info("ChromeBrowser Launch");
	  driver.manage().window().maximize();
	  log.info("Browser window maximize");
	  driver.get("https://www.google.com");
	  log.info("Navigate to google application");
	  driver.findElement(By.name("q")).sendKeys("Java");
	  log.info("Enter Java text in google search");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  log.info("Click enter button");
	  
	  }
}
