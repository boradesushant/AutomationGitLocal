package Com_Test_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	ChromeDriver driver;
	
	@Test
	
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void TearDown() {
		
	//	driver.quit();
		
		
	}
	

}
