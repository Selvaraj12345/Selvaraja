package Com.Oct_30_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
		private WebElement moveto;

public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMoveto() {
		return moveto;
	}

public HomePage(WebDriver driver) 
    {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	
	}


