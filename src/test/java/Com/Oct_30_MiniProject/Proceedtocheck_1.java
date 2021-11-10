package Com.Oct_30_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceedtocheck_1 {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement proceedtocheck1;
	
	public Proceedtocheck_1(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceedtocheck1() {
		return proceedtocheck1;
	}
		

}
