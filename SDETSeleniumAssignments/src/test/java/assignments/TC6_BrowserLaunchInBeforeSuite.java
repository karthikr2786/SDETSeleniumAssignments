package assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utils.Driver;

public class TC6_BrowserLaunchInBeforeSuite 
{
	WebDriver driver;
	
	@BeforeSuite
	public void startup() throws InterruptedException
	{
		//launching the browser
				driver=Driver.chrome();
			  System.out.println("Browser Launched.");
			  //implicit wait statement
			  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  System.out.println("implicit wait Condition provided.");
			  //window maximize
			  driver.manage().window().maximize();
			  System.out.println("Browser Maximized");
			  //Navigating to the Application
			  driver.get("https://opensource-demo.orangehrmlive.com/");
			  System.out.println("Navigating into Application.");
	}
	@AfterSuite
	public void tearDown() throws InterruptedException
	{
		driver.close();
	}
	
	@Test
    public void loginTest()
	{
	System.out.println("before Suite execution");
	}

}
