package qa.Selenium_Intro;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\EdgeDriver\\edgedriver_win32\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		
		d.get("https://www.google.co.in/");
		d.navigate().to("https://www.amazon.in/");  //--- used to launch external url
		d.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fb%2F%3F_encoding%3DUTF8%26ie%3DUTF8%26node%3D65539627031%26pd_rd_w%3DgxB5f%26content-id%3Damzn1.sym.6b394ea1-b22e-4b04-8efd-73a045d545a5%26pf_rd_p%3D6b394ea1-b22e-4b04-8efd-73a045d545a5%26pf_rd_r%3D06CP9ZCW654TCXMTK88M%26pd_rd_wg%3DKJNNP%26pd_rd_r%3D8060b689-cd3b-4fd7-b5f2-dd73703f2537%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		d.navigate().back();
		d.navigate().forward();
		Thread.sleep(20000);

		d.navigate().refresh();
	}

}
