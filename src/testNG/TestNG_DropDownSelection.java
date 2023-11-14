package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class TestNG_DropDownSelection {
	WebDriver driver;
  @Test
  public void dropdownselection() throws InterruptedException {
	  driver.get("http://redmine.org/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("tirupati");
	  new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByValue("vi");
	//  new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByIndex(2);
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
