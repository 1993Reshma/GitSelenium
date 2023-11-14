package junittutorial;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoClassOne {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws InterruptedException {
		driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Test
	void test1() throws InterruptedException {
		driver.get("https://www.apple.com");
		Thread.sleep(2000);
		
		
	}
	
	@Test
	void test2() throws InterruptedException {
		driver.get("https://www.mi.com");
		Thread.sleep(2000);
		
		
	}

	@Test
	void test3() throws InterruptedException {
		driver.get("https://www.vivo.com");
		Thread.sleep(2000);
		
		
	}

	@Test
	void test4() throws InterruptedException {
		driver.get("https://www.samsung.com");
		Thread.sleep(2000);
		
	}


}
