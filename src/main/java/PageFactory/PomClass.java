package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PomClass {


		@FindBy(how=How.XPATH,using="//input[@name='email']") private WebElement Text_Email;
	
       @FindBy(how=How.XPATH,using="//input[@name='pass']") private WebElement Text_Pass;
       
       @FindBy(how=How.XPATH,using="//button[@name='login']") private WebElement Text_Login;

	public WebElement getText_Email() {
		return Text_Email;
	}

	

	public WebElement getText_Pass() {
		return Text_Pass;
	}

	public WebElement getText_Login() {
		return Text_Login;
	}

	
       
       

}
