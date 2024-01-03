package qa.Selenium_Intro;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\EdgeDriver\\edgedriver_win32\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		d.get("https://www.spicejet.com/");
		
		/*Dynamic wait and Global wait: Global as because it is applied to up to down page. Dynamic in nature because
		  if page is loaded in 10seconds then it will ignore rest seconds and perform next action
		  
		  implicit wait is for each elements in page.
		*/
		
		String originalWindow = d.getWindowHandle();
		System.out.println(originalWindow);
		
		WebElement Adds= d.findElement(By.xpath("//div[text()='Add-ons']"));
	     
		Actions a= new Actions(d);
		a.moveToElement(Adds).build().perform();
	
		
		WebElement Travel_Assistance= d.findElement(By.xpath("//div[text()='Travel Assistance Services']"));
		Travel_Assistance.click();
		
		String s= d.getTitle();
		System.out.println(s);
		
		
		int frameSize= d.findElements(By.tagName("iframes")).size();
		System.out.println(frameSize);
		

		for(int i=0; i<frameSize; i++) 
		{
			d.switchTo().frame(i);
			int match= d.findElements(By.linkText("Policy Wordings")).size();
			System.out.println(i);
			//move back to main frame.
			d.switchTo().defaultContent();
		}
		
		
		
		Set handler=d.getWindowHandles();
		 
		Iterator<String> it=handler.iterator();
		String parentID= it.next();
		System.out.println(parentID);
		
		String chilID= it.next();
		System.out.println(chilID);
		
		d.switchTo().window(chilID);
		
	WebElement Policy_Wording= d.findElement(By.xpath("//ul[contains(@id,'toursimUL')]/li[2]/a"));
	
	Policy_Wording.click();
	
	String childTitle=d.getTitle();
	System.out.println("child window title: "+childTitle);
	
	//close current window
	d.close();
	
	//move back to parent window
	d.switchTo().window(parentID);
	System.out.println("Parent window title: "+d.getTitle());
			
	
	}

}
