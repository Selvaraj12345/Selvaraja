package Com.Oct_30_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transactiontoproceed {
	
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement Paybybankwire;
		
	public Transactiontoproceed(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPaybybankwire() {
		return Paybybankwire;
	}
	
	


}
