package Com_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement cusmerid=driver.findElement(By.xpath("//input[@name='cusid']"));
		
		cusmerid.sendKeys("1234");
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		
		submit.click();
		
		String text =Test_Com_a1.Handle_Alert(driver).getText();
		
		System.out.println(text);
		
		Test_Com_a1.Handle_Alert(driver).dismiss();
		
		
	}

}
