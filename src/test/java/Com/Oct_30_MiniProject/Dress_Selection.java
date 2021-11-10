package Com.Oct_30_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Selection {
	
	public WebDriver driver; //---->Null
	@FindBy(xpath="//img[@height='250']")
	private WebElement moveto1;

	public Dress_Selection(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getMoveto1() {
		return moveto1;
	}
    


}
