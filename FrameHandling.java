package qa.Selenium_Intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\EdgeDriver\\edgedriver_win32\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		d.get("https://www.globalsqa.com/demo-site/draganddrop/");
		

		int frames= d.findElements(By.xpath("//iframe")).size();
		System.out.println("no. of frame"+frames);
	
		for(int i=0; i<frames;i++)
		{
			d.switchTo().frame(i);
			
			int match= d.findElements(By.cssSelector("img[alt='Cushion covers, bedsheets & more']")).size();
			System.out.println("Element found in frame" + match);
			//move back to main frame.
			d.switchTo().defaultContent();
		}
		
		
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@data-src ='../../demoSite/practice/droppable/photo-manager.html']")));
		
		WebElement pic1= d.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
		WebElement trash= d.findElement(By.id("trash"));
		Actions a= new Actions(d);
		a.clickAndHold(pic1).
		moveToElement(trash).
		release().build().perform();
	}
}
