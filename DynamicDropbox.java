package qa.Selenium_Intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicDropbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\EdgeDriver\\edgedriver_win32\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		d.get("https://www.spicejet.com/");
		
		WebElement source= d.findElement(By.xpath("//div[@data-testid='to-testID-origin']"));
		source.click();
		
		d.findElement(By.xpath("//div[text()='Ahmedabad']")).click();
		
		WebElement destiny= d.findElement(By.xpath("//div[@data-testid='to-testID-destination']"));
		
		d.findElement(By.xpath("//div[text()='Coimbatore']")).click();
		
		
		
		
	}

}
