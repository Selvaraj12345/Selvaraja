package Com.Oct_30_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Proceedtocheck3 {
	
	public WebDriver driver;
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement proceedtocheck_3;

	public Address_Proceedtocheck3(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceedtocheck_3() {
		return proceedtocheck_3;
	}
	}
