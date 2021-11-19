package assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Driver;
public class TC9_MinimizeWindowTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		
	 //launching the browser
		driver=Driver.chrome();
	  System.out.println("Browser Launched.");
	  //implicit wait statement
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  System.out.println("implicit wait Condition provided.");
	  //window maximize
	  driver.manage().window().maximize();
	  System.out.println("Browser Maximized");
		driver.manage().window().setPosition(new Point(0, -1000));
		System.out.println("Browser minimized");
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		driver.close();
	}


}
