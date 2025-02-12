package Com_Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_002 extends Base {

	@Test
	public void TC_002() {
		
	WebElement	Email=driver.findElement(By.xpath("//input[@name='email']"));
     
	Actions act=new Actions(driver);
	
	act.keyDown(Email, Keys.SHIFT).sendKeys("TestingGmail.com").keyUp(Keys.SHIFT).build().perform();
	
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	
	WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
	
		pass.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		
		
	}
	
}
