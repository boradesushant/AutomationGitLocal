package Com_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a6 {

	public static void main(String[] args) {

		//Execuatin the Browser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
	WebElement	Selenium=driver.findElement(By.xpath("//a[text()='Selenium']"));
		
		act.moveToElement(Selenium).click().build().perform();
		
		
		
	}

}
