package Com.Oct_30_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_Proceed {
	
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button")
	private WebElement finalpayment;
	
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement signout;
	
	public WebElement getSignout() {
		return signout;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFinalpayment() {
		return finalpayment;
	}

	public Final_Proceed(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);

	}
	
	

}
