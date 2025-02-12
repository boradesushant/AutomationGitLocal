package Com_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a5 {

	public static void main(String[] args) {


		// open Browser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
  		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
  		
  		WebElement	Desten=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.dragAndDrop(src, Desten).build().perform();
		
		
		WebElement ssd=driver.findElement(By.xpath("(//a[@class='button button-orange'])[3]"));
		
		WebElement tth=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.dragAndDrop(src, tth).build().perform();
		
		
		
	}

}
