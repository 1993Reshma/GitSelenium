package junittutorial;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Democlass {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		driver.manage().window().minimize();
		driver.close();
	}

	@Test
	void test1() throws InterruptedException {
		
		driver.get("https://www.twitter.com");
		Thread.sleep(2000);
	}
	
	@Test
	void test2() throws InterruptedException {
		
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		
	}
    @Disabled
	@Test
	void test3() throws InterruptedException {
		
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
	}
    @Disabled
   
	@Test
	void test4() throws InterruptedException {
		
		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
		
	}

	@Test
	void test5() throws InterruptedException {
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
		
	}


}
