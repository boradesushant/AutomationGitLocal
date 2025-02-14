package Com_Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Library;

public class TC_004 extends Base {

	@Test
	public void Excell() {
		
		WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		
		Email.sendKeys("testingGMail.com");
		
		
		
	}

}
