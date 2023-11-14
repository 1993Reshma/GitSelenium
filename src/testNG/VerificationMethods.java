package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerificationMethods {
	WebDriver driver;
	  @Test
	  public void verifygoogletabtitle() {
		  driver.get("https://www.google.com");
		  
		  String exptabtitle = "Google";
		//  System.out.println("expected tab title: "+exptabtitle);
		  String acttabtitle = driver.getTitle();
		//  System.out.println("actual tab title: "+acttabtitle);
		  
		 Assert.assertEquals(acttabtitle, exptabtitle);
	  }
	  
	  @Test
	  public void verifygoogleurl() {
		  driver.get("https://www.google.com");
		  
		  String expurl = "https://www.google.com/";
		//  System.out.println("expected tab title: "+exptabtitle);
		  String acturl = driver.getCurrentUrl();
		//  System.out.println("actual tab title: "+acttabtitle);
		  
		 Assert.assertEquals(acturl, expurl);
	  }
	  
	  @Test
	  public void verifygoogletext() {
		  driver.get("https://www.google.com");
		  
		  String expg = "Gmail";
		//  System.out.println("expected tab title: "+exptabtitle);
		  String actg = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).getText();
		//  System.out.println("actual tab title: "+acttabtitle);
		  
		 Assert.assertEquals(actg, expg);
	  }

	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
}
