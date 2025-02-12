package Com_Test_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_2 {

	@Test 
	public class Base {

		ChromeDriver driver;
		
		@Test
		
		public void Setup() {
			
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html\r\n");
			driver.manage().window().maximize();
		}
		
		@Test
		
		public void TearDown() {
			
			driver.quit();
			
			
		}
	}
}
		
		
		
		
	
		
	
