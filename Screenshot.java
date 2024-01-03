package qa.Selenium_Intro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\EdgeDriver\\edgedriver_win32\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		
		d.get("https://www.google.co.in/");
		
		//Take screenshot and store in file format
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		//copy screenshot to desired location
		File DestFile=new File("C:\\Users\\HP\\eclipse-workspace\\Maven_Project_demo\\src\\test\\java\\qa\\Selenium_Intro\\google.png");
		
		FileUtils.copyFile(src, DestFile);
		
		System.out.print("xxxxxxxx");
		
		d.get("https://www.amazon.in/");
		File src1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
File DestFile1=new File("C:\\Users\\HP\\eclipse-workspace\\Maven_Project_demo\\src\\test\\java\\qa\\Selenium_Intro\\amazon.png");
		
		FileUtils.copyFile(src1, DestFile1);
		

		
	}

}
