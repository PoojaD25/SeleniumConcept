package qa.Selenium_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\EdgeDriver\\edgedriver_win32\\msedgedriver.exe");
	WebDriver d= new EdgeDriver();
	
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	
	d.get("https://www.amazon.in");
	WebElement Acc= d.findElement(By.id("nav-link-accountList"));
	
	//to Hoverover on webelement Actions class is used
	
	Actions a= new Actions(d);
	a.moveToElement(Acc).build().perform();
			
			WebElement Exp_Showroom= d.findElement(By.xpath("//span[text()='Explore Showroom']"));
			Exp_Showroom.click();
	}

}
