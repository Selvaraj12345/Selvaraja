package Com.Oct_30_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceedtocheck_2 {
	public WebDriver driver;  //--->Null
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement Proceedtocheck2;
	
    public Proceedtocheck_2(WebDriver driver2) {
		// TODO Auto-generated constructor stub
    	this.driver=driver2;
    	PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceedtocheck2() {
		return Proceedtocheck2;
	}
	
}
