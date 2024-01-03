package qa.Selenium_Intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultiSelectDropdownBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\HP\\\\Downloads\\\\EdgeDriver\\\\edgedriver_win32\\\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.spicejet.com/");
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5) );
		
		WebElement passenger= d.findElement(By.xpath("//div[@data-testid='home-page-travellers']"));
		passenger.click();
		
		 System.out.println(d.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		
		WebElement Adult= d.findElement(By.xpath("//div[contains(@data-testid,'Adult-testID-plus-one-cta')]"));
		
		
		int i=1;
		while(i<5)
		{
			Adult.click();
			i++;
		}
		
		
		WebElement child= d.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']"));
		
	    i=1;
		while(i<3)
		{
			child.click();
			i++;
		}
		
		 System.out.println(d.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		
	}

}
