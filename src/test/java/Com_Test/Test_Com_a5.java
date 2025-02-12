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
		
		WebElement	rty=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement	qwe=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		act.dragAndDrop(rty, qwe).build().perform();
		
		WebElement	tty=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
	WebElement	asd=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.dragAndDrop(tty, asd).build().perform();
		
		WebElement zzz=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement aqw=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.dragAndDrop(zzz, aqw).build().perform();
		
		
				
		
	}

}
