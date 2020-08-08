
package InitiateTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;

import Pages.redbuspage;

public class inittt {
	private static final Logger LOGGER = LoggerFactory.getLogger(inittt.class);
	
	//Driver calls
	
	public WebDriver driver;
	public redbuspage homePage;
	
	
	@BeforeMethod
	public void launchDriver()
	{

		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver(opt);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        LOGGER.info("webdriver lauching");
		homePage = new redbuspage(driver);
		
	}
}




































