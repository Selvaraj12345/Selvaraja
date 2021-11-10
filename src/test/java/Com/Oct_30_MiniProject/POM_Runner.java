package Com.Oct_30_MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_Runner extends base {
	public static WebDriver driver=base.getBrowser("chrome");
	public static HomePage h=new HomePage(driver);
	public static Dress_Selection d=new Dress_Selection(driver);
	public static Addtocard a=new Addtocard(driver);
    public static Proceedtocheck_1 p1=new Proceedtocheck_1(driver);
    public static Proceedtocheck_2 p2=new Proceedtocheck_2(driver);
    public static Login_Page l=new Login_Page(driver);
    public static Address_Proceedtocheck3 p3=new Address_Proceedtocheck3(driver);
    public static Proceedtocheck4 p4=new Proceedtocheck4(driver);
    public static Transactiontoproceed t=new Transactiontoproceed(driver);
    public static Final_Proceed f=new Final_Proceed(driver);
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		getURL("http://automationpractice.com/index.php");
		
		jsExecutor();
		Sleep(5000);
		//WebElement element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
        moveToElement(h.getMoveto());
        jsExecutor1();
        Sleep(5000);
        
        //WebElement moveontoimage = driver.findElement(By.xpath("//img[@height='250']"));
		moveToElement1(d.getMoveto1());
		Sleep1(5000);
		
		//WebElement addtocard = driver.findElement(By.xpath("//a[@data-id-product='3']"));
		moveToElement2(a.getAddtocard());
		Sleep2(3000);
		
		//WbElement proceedtocheck1 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		moveToElement3(p1.getProceedtocheck1());
		Sleep3(3000);
		
		//WebElement proceedtocheck2 = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		moveToElement4(p2.getProceedtocheck2());
		
		//WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		inputValueElement(l.getEmail(),"selvacse37@gmail.com");
		//WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		inputValueElement1(l.getPass(),"selvacse37");
		Sleep4(3000);
		
		//WebElement press = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		clickonElement1(l.getClickSubmitButton());
		
		//Address--proceed to check
		//WebElement proceedtocheck3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		moveToElement5(p3.getProceedtocheck_3());
		
		// Check box tick
		//WebElement tick = driver.findElement(By.xpath("//input[@id='cgv']"));
		click(p4.getTick());
		Sleep5(3000);
		
		//proceed check out
		//WebElement proceedtocheck4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		Click(p4.getProceedtocheck_4());
		
		//WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
        Click1(t.getPaybybankwire());
        
        //WebElement final_click = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
        Click2(f.getFinalpayment());
        
        jsExecutor2();
        Sleep6(5000);
        
        //WebElement signout = driver.findElement(By.xpath("//a[@title='Log me out']"));
        Click3(f.getSignout());
 
		

		
		
	}

	

}
