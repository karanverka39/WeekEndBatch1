package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import InitiateTests.inittt;


public class redbuspage extends inittt {


	private static final Logger LOGGER = LoggerFactory.getLogger(redbuspage.class);
	
	//functions
	//and locators
	
	WebDriver driver;

	@FindBy(xpath="//input[@id='src']")
	public WebElement searchFromDropDown;
	
	@FindBy(xpath="//ul[@class='autoFill']/li")
	public List<WebElement> from;
	
	@FindBy(xpath="//input[@id='dest']")
	public WebElement selectto;
	
	@FindBy(xpath="//ul[@class='autoFill']/li")
	public List<WebElement> to;
	
	@FindBy(xpath="//td[@class='current day']")
    public WebElement dateselect;
	
	@FindBy(xpath="//button[@id='search_btn']")
	public WebElement  click;

	@FindBy(xpath="//i[@class='icon icon-close']")
	public WebElement  close;
	
	public redbuspage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this); //jaise hi mere page ka object waise hi mere sare webelement search and load ho jaye
	}

	@FindBy(xpath="(//div[@class='button view-seats fr'])[1]")
	public WebElement  viewSeat;
	

	@FindBy(xpath="//canvas[@data-type='lower']")
	public WebElement  busCanvas;

	@FindBy(xpath="(//div[@class='radio-unchecked'])[1]")
	public WebElement Selecttime;
	
	@FindBy(xpath="//button[text()='continue']")
	public WebElement continueee;
	
	@FindBy(xpath="//button[@class='button continue inactive']")
	public WebElement proceed;
	
	@FindBy(xpath="(//input[@class=\"input_box\"])[1]")
	public WebElement name;

	public void selectFrom()
	{

		searchFromDropDown.sendKeys("Amritsar");
      	
			 
			for(WebElement e : from)
      			{
				if (e.getText().equalsIgnoreCase("Amritsar"))
				{
					//System.out.println(e.getText());
					e.click();
                    break;
	         	}
      			}

			LOGGER.info("Clicking to amritsar");
		
	}
	public void selectTo()
	{
		selectto.sendKeys("Del");
		
		for(WebElement e : to)
		{
			if(e.getText().equalsIgnoreCase("New Delhi"))
			{
				//System.out.println(e.getText());
				e.click();

            break;
		}}


		LOGGER.info("Clicking to Delhi");
	
	
	}
	public void dateSelect()
	{
		
		//driver.findElement(By.xpath("//input[@id='onward_cal']"));
		dateselect.click();

		LOGGER.info("Clicking to date");
	
			
	}
	public void searchButtonclick()
	{
	click.click();

	LOGGER.info("Clicking to search button");

	}
	
	public void close()
	{
		close.click();

		LOGGER.info("Clicking to close");
	
	}
	
	public void scrollDown()
	    {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,380)");

		LOGGER.info("doing scroll");
	
	    }  

		public void clickViewSeat() {
		viewSeat.click();

		LOGGER.info("Clicking to viewseat");
	
		}


		public void clickBusSeat() {
		Actions act = new Actions(driver);
		act.moveToElement(busCanvas, 360, 30).click().build().perform();
		}
		
		public String getTitle() {
			return driver.getTitle();
		}
		public void selecttime() {
			Selecttime.click();
		}
		public void continuee() {
			continueee.click();	
		}
		public void proceed() {
			proceed.click();
		}

		}
