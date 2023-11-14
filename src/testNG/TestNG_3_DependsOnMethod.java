package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_3_DependsOnMethod {
	WebDriver driver;
	
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test
  public void selenium() {
	  driver.get("https://www.selenium.dev");
	  
  }
  @Test
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
