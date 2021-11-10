package Com.Oct_30_MiniProject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class base {

	public static WebDriver driver;
	public static WebDriver getBrowser(String type) 
	{
      if(type.equalsIgnoreCase("chrome"))
      {
    	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
    	  driver=new ChromeDriver();
      }
      else if(type.equalsIgnoreCase("firefox"))
      {
    	  System.setProperty("webdriver.gekco.driver", System.getProperty("user.dir") + "//Driver//Firefoxdriver.exe");
    	  driver=new FirefoxDriver();
      }  
      driver.manage().window().maximize();
      
      return driver;
      
      }
	public static void jsExecutor()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,200)", "");
	}
	public static void moveToElement(WebElement element) 
	{
		Actions a=new Actions(driver);
	    a.doubleClick(element).build().perform();

	}
	public static void jsExecutor1()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)", "");
	}
	 public static void Sleep(int time) throws InterruptedException
	  {
		  Thread.sleep(time);
	  }
	 public static void moveToElement1(WebElement element) 
		{
			Actions a=new Actions(driver);
			a.moveToElement(element).build().perform();

		}
	 public static void Sleep1(int time) throws InterruptedException
	  {
		  Thread.sleep(time);
	  }
	 public static void moveToElement2(WebElement element) 
		{
			Actions a=new Actions(driver);
			a.click(element).build().perform();

		}
	 public static void Sleep2(int time) throws InterruptedException
	  {
		  Thread.sleep(time);
	  }
	 public static void moveToElement3(WebElement element) 
		{
			Actions a=new Actions(driver);
			a.click(element).build().perform();
		    //element.click();

		}
	 public static void Sleep3(int time) throws InterruptedException
	  {
		  Thread.sleep(time);
	  }
	 public static void inputValueElement(WebElement element,String value)
	  {
		  element.sendKeys(value);
	  }
	  public static void inputValueElement1(WebElement element,String value)
	  {
		  element.sendKeys(value);
	  }
	  public static void Sleep4(int time) throws InterruptedException
	  {
		  Thread.sleep(time);
	  }
	  public static void clickonElement1(WebElement element)
		{
			element.click();
		}
	  public static void moveToElement4(WebElement element) 
		{
			Actions a=new Actions(driver);
			a.click(element).build().perform();

		}
	  public static void moveToElement5(WebElement element) 
		{
			Actions a=new Actions(driver);
			a.click(element).build().perform();

		}
	  public static void click(WebElement element) 
		{
			element.click();

		}
	  public static void Sleep5(int time) throws InterruptedException
	  {
		  Thread.sleep(time);
	  }

	  public static void Click(WebElement element) 
		{
			element.click();

		}
	  public static void Click1(WebElement element) 
		{
			element.click();

		}
	  public static void Click2(WebElement element) 
		{
			element.click();

		}
	  public static void jsExecutor2()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,200)", "");
		}
	  public static void Sleep6(int time) throws InterruptedException
	  {
		  Thread.sleep(time);
	  }
	  public static void Click3(WebElement element) 
		{
			element.click();

		}
	public static void getURL(String url)
	{
		driver.get(url);
	}
	  
  }