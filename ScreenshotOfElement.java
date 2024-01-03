package qa.Selenium_Intro;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class ScreenshotOfElement {


	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\EdgeDriver\\edgedriver_win32\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		d.get("https://www.selenium.dev/");
		
		
		WebElement Seldriver= d.findElement(By.id("selenium_webdriver"));
		Screenshot s= new AShot().takeScreenshot(d,Seldriver);
		ImageIO.write(s.getImage(), "png", new File("C:\\Users\\HP\\eclipse-workspace\\Maven_Project_demo\\src\\test\\java\\qa\\Selenium_Intro.Home.png"));
		Thread.sleep(2000);
		d.close();
		
	}
	
	
	}