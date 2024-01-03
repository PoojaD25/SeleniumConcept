package qa.Selenium_Intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\EdgeDriver\\edgedriver_win32\\msedgedriver.exe");
	WebDriver d= new EdgeDriver();
	
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	
	d.get("https://www.globalsqa.com/demo-site/draganddrop/");
	
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[@data-src ='../../demoSite/practice/droppable/photo-manager.html']")));
	
	
	WebElement pic1= d.findElement(By.xpath("//img[contains(@alt,'On top of Kozi kopka')]"));
	WebElement trash= d.findElement(By.id("trash"));
	
	Actions a= new Actions(d);
	a.clickAndHold(pic1).
	moveToElement(trash).
	release().build().perform();
	
	WebElement pic2= d.findElement(By.xpath("//img[@src ='images/high_tatras2_min.jpg']"));
	a.dragAndDrop(pic2, trash).build().perform();
    d.close();
	
	}

}
