package Com.Oct_30_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement pass;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement ClickSubmitButton;
	
    public Login_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
    	this.driver=driver2;
    	PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getClickSubmitButton() {
		return ClickSubmitButton;
	}

	
	
}
