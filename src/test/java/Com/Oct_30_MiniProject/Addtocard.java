package Com.Oct_30_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocard {
	
	public WebDriver driver;
	@FindBy(xpath="//a[@data-id-product='3']")
	private WebElement addtocard;
	

	public Addtocard(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getAddtocard() {
		return addtocard;
	}

	
}
