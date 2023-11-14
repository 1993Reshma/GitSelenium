package navigate1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateProgram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.youtube.com");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		driver.close();
		
		
		
		

	}

}
