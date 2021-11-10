package Com.Oct_30_MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class runner_main extends base{
    public static WebDriver driver;
    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = getBrowser("chrome");
		getURL("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		jsExecutor();
		Sleep(5000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
        moveToElement(element);
        jsExecutor1();
        Sleep(5000);
		
		WebElement moveontoimage = driver.findElement(By.xpath("//img[@height='250']"));
		moveToElement1(moveontoimage);
		Sleep1(5000);
	
		WebElement addtocard = driver.findElement(By.xpath("//a[@data-id-product='3']"));
		moveToElement2(addtocard);
		Sleep2(5000);
		
		WebElement proceedtocheck1 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		moveToElement3(proceedtocheck1);
		Sleep3(5000);
		
		WebElement proceedtocheck2 = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		moveToElement4(proceedtocheck2);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		inputValueElement(username,"selvacse37@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		inputValueElement1(pass,"selvacse37");
		Sleep4(3000);
		
		WebElement press = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		clickonElement1(press);
		
		//Address--proceed to check
		WebElement proceedtocheck3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		moveToElement5(proceedtocheck3);
		
		// Check box tick
		WebElement tick = driver.findElement(By.xpath("//input[@id='cgv']"));
		click(tick);
		Sleep5(3000);
		
		//proceed check out
		WebElement proceedtocheck4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		Click(proceedtocheck4);
		
		WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
        Click1(pay);
        
        WebElement final_click = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
        Click2(final_click);
        
        jsExecutor2();
        Sleep6(5000);
        
        WebElement signout = driver.findElement(By.xpath("//a[@title='Log me out']"));
        Click3(signout);
        
		
		
	}

			
	}

	
