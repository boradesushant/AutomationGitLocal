package Com_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a4 {

	public static void main(String[] args) {

     // open Browser
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
	WebElement	frmae3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frmae3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Test 2");
		
	WebElement	innerfame=driver.findElement(By.xpath("(//iframe )[1]"));
	
	driver.switchTo().frame(innerfame);
	
	driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
	
  driver.switchTo().parentFrame();
  
      driver.switchTo().defaultContent();
      
     WebElement  frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
      
      driver.switchTo().frame(frame4);
      
      driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Test 4");
      
      
      
	
	}

}
