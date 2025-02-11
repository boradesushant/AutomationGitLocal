package Com_Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_COm_a3 {

	public static void main (String []  args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 driver.manage().window().maximize();
		 
		 
		 // 
		 
		WebElement  doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		 
		Double_Click(driver,doubleclick);
		
	Alert alt=	driver.switchTo().alert();
	
	String text=alt.getText();
	
	System.out.println(text);
	
		alt.accept();
		
		
		 
	}
	
	public static void right_Click(ChromeDriver driver ,WebElement Element) {
		
		 Actions act=new Actions(driver);

		act.contextClick(Element).click(Element).build().perform();
		
		
	}
	
	public static void Double_Click(ChromeDriver driver,WebElement Element ) {
		
		 Actions act=new Actions(driver);

		act.doubleClick(Element).click(Element).build().perform();
		
		
		
		
	}
	
	
}
