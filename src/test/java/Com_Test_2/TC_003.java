package Com_Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_003 extends Base_2 {

	@Test 
	
	public void TC_003() {
		
		Actions act=new Actions(driver);
		
// WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
 
 //WebElement   click=driver.findElement(By.xpath("//span[text()='Edit']"));
  
	//	act.contextClick(rightClick).click(click).build().perform();
		
	WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
	act.doubleClick(doubleclick).click().build().perform();
	
	
		
	}
		
}
