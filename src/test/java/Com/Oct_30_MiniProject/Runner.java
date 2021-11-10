package Com.Oct_30_MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium Tutorials\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//
		//shirt.click();
		Actions a=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,200)", "");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
	    a.click(element).build().perform();
		//Thread.sleep(3000);
		js.executeScript("window.scroll(0,1000)", "");
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
		a.moveToElement(element1);
		//a.click(element1).build().perform();
		// Add to card
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"));
		a.click(element3).build().perform();
		Thread.sleep(3000);
		//Proceed to cart
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		a.click(element4).build().perform();
		//
		WebElement element5 = driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]"));
		a.click(element5).build().perform();
		// Account Creation
		/*WebElement acc_creation = driver.findElement(By.xpath("//input[@id='email_create']"));
		acc_creation.sendKeys("selvacse37@gmail.com");
		WebElement create = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
		create.click();
		Thread.sleep(4000);
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio']"));
		gender.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstname.sendKeys("Selva");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lastname.sendKeys("Raj");
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("selvacse37");
		WebElement date = driver.findElement(By.xpath("//select[@id='days']"));
		Select s1=new Select(date);
		s1.selectByValue("24");
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select s2=new Select(month);
		s2.selectByValue("5");
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select s3=new Select(year);
		s3.selectByValue("1990");
		WebElement c = driver.findElement(By.xpath("//input[@id='newsletter']"));
		c.click();
		WebElement c1 = driver.findElement(By.xpath("//input[@id='optin']"));
		c1.click();
		WebElement f_name = driver.findElement(By.xpath("//input[@id='firstname']"));
		f_name.sendKeys("Selva");
		WebElement l_name = driver.findElement(By.xpath("//input[@id='lastname']"));
		l_name.sendKeys("Raj");
		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("Greens Tech-Chennai");
		WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
		address.sendKeys("Rudhraveni Layout");
		WebElement address1 = driver.findElement(By.xpath("//input[@id='address2']"));
		address1.sendKeys("Udumalpet");
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Tiruppur");
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select s4=new Select(state);
		s4.selectByIndex(3);
		WebElement postal = driver.findElement(By.xpath("//input[@id='postcode']"));
		postal.sendKeys("00000");
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
		Select s5=new Select(country);
		s5.selectByIndex(1);
		Thread.sleep(1000);
		WebElement additional = driver.findElement(By.xpath("//textarea[@id='other']"));
		additional.sendKeys("123456789");
		Thread.sleep(2000);
		WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
		phone.sendKeys("9787560202");
		WebElement phone1 = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		phone1.sendKeys("9787560202");
		WebElement addition = driver.findElement(By.xpath("//input[@id='alias']"));
		addition.sendKeys("Udumalpet");
		WebElement sub = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		sub.click();*/
		//SIgn In
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("selvacse37@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		pass.sendKeys("selvacse37");
		Thread.sleep(3000);
		WebElement press = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		press.click();
		//Proceed to check
		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		proceed.click();
		//
		WebElement tick = driver.findElement(By.xpath("//input[@id='cgv']"));
		tick.click();
		WebElement cli = driver.findElement(By.xpath("//button[@name='processCarrier']"));
        cli.click();
        
        WebElement pay = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
        pay.click();
        
        WebElement final_click = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
        final_click.click();
        JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scroll(0,200)", "");
	}

}
