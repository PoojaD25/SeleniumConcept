package qa.Selenium_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Locators {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\EdgeDriver\\edgedriver_win32\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=12872387591005782739&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9151183&hvtargid=kwd-10573980&hydadcr=14453_2371562");
		System.out.println(driver.getTitle());
	/*	Arranged locators by priority wise
		
		1.id
		2.cssSelector/xpath
		3. name
		4. linkText
		5. classname
		
		
		
		*/
		
		//xpath
	WebElement All_button=driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
	All_button.click();
	
	WebElement Echo= driver.findElement(By.xpath("//div[text()='Echo & Alexa']"));
	Echo.click();
	
	/*Thread.sleep(15);
	WebElement close= driver.findElement(By.xpath("//div[contains(@class,'nav-sprite hmenu-close-icon')]"));
	close.click();
	
	*/
	
	WebElement Search= driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
	Search.sendKeys("Beauty product");
	
	//Ways to click
	
	//Search.sendKeys(Keys.RETURN);
	Search.sendKeys(Keys.ENTER);
	
	WebElement Prime= driver.findElement(By.xpath("//span[text()='Prime']"));
	Prime.click();
	String Prime_PageName= driver.getPageSource();
	System.out.println(Prime_PageName);
	
	
	
	//linkText--- used only for links eg. href="link...."
	
	
	WebElement bestSeller= driver.findElement(By.linkText("Best Sellers"));
	bestSeller.sendKeys(Keys.RETURN);
	
	//partialLinkText--- used only for links eg. href="link...."

	WebElement AmznLaunchPad= driver.findElement(By.partialLinkText("Launchpad"));
	AmznLaunchPad.click();
	
	/*cssSelector
	tag#id
	tag.class
	tag[attribute='value']
	*/
	

	 
			WebElement mini_Tv= driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_avod_desktop_topnav']"));
	mini_Tv.click();
	
// WebElement orders =  driver.findElement(By.cssSelector("#nav-orders"));
	 
	// orders.sendKeys(Keys.ENTER)	;
	
	
	//WebElement Lux_Buty= driver.findElement(By.linkText("Luxury Beauty"));
	//Lux_Buty.click();
	
	
	
	
	}

}
