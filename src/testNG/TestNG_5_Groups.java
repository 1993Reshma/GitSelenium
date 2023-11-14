package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_5_Groups {
	
	WebDriver driver;
  @Test(groups = "food")
  public void zomato() {
	  driver.get("https://www.zomato.com");
  }
  
  @Test(groups = "social")
  public void twitter() {
	  driver.get("https://www.twitter.com");
  }
  
  @Test(groups = "software")
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  
  @Test(groups = "software")
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  
  @Test(groups = "food")
  public void swiggy() {
	  driver.get("https://www.swiggy.com");
  }
  
  @Test(groups = "social")
  public void whatsapp() {
	  driver.get("https://www.whatsapp.com");
  }
  @BeforeTest(groups = "software")
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
