package assignments;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.Driver;

public class TC2_PrintTitleOfApplicationTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
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
	  //Navigating to the Application
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  System.out.println("Navigating into Application.");
	  String title=driver.getTitle();
	  System.out.println("Application title is "+title);
	  System.out.println("Application title is "+title);

}
}
