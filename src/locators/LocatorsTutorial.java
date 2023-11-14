package locators;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsTutorial {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	
	}
   @Disabled
	@Test
	void test() throws InterruptedException {
		driver.get("https://www.redmine.org/login");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Aahil");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("aadil");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".small")).sendKeys("java");
		Thread.sleep(5000);
		//  driver.findElement(By.id("login-submit")).click();
		
		
	}
    @Test
	void test1() throws InterruptedException {
		/*driver.get("https://www.redmine.org");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("GNU")).click();	
		Thread.sleep(2000);*/
    	driver.get("https://www.google.com");
    	Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("planets");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/button/div/span/svg")).click();
		Thread.sleep(3000);


    }

}