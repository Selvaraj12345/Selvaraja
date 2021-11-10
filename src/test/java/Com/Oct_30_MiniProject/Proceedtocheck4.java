package Com.Oct_30_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceedtocheck4 {
	
	public WebDriver driver;
	@FindBy(xpath="//input[@id='cgv']")
	private WebElement tick;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement Proceedtocheck_4;
	
	public Proceedtocheck4(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTick() {
		return tick;
	}

	public WebElement getProceedtocheck_4() {
		return Proceedtocheck_4;
	}

	

}
