package Validations;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.bases;
import PageObjects.LandingPage;

public class HomePage extends bases{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		 driver =initializeDriver();
	}
	@Test
	public void PageNavigation()
	{
		//one is inheritance
		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getDetails();	
		l.getPayment();
	}
}