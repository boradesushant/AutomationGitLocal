package Com_Test_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageFactory.PomClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_ACCESS {

	
	@Test 
	
	public void Test() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		
		PomClass   Pom=PageFactory.initElements(driver,PomClass.class );
       
       Pom.getText_Email().sendKeys("TestingGmail.com");
       
       Pom.getText_Pass().sendKeys("Pass@123");
       
       Pom.getText_Login().click();
       
       
		
		

		
		
	}
	
			
	
}
