package qa.Selenium_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleStaticDropbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\EdgeDriver\\edgedriver_win32\\msedgedriver.exe");
	
	WebDriver d=new EdgeDriver();
	d.manage().window().maximize();
	
	
	d.get("https://www.amazon.in/");
	
	WebElement Static_All= d.findElement(By.xpath("//select[@title='Search in']"));
	Static_All.click();
	
	Select s= new Select(Static_All);
   
	s.selectByIndex(5);
System.out.println(s.getFirstSelectedOption().getText());

	s.selectByVisibleText("Furniture");
	System.out.println(s.getFirstSelectedOption().getText());
	
	s.selectByValue("search-alias=amazon-pharmacy");
	System.out.println(s.getFirstSelectedOption().getText());
	
	}

}
