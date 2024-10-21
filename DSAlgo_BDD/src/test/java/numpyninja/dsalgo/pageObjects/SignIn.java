package numpyninja.dsalgo.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import numpyninja.dsalgo.constants.*;
public class SignIn {
	Constants constants = new Constants();
	
	public WebDriver sdriver;

	public SignIn(WebDriver rdriver) {
		sdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='id_username']")
	private WebElement Username;
	@FindBy(xpath="//input[@id='id_password']")
	private WebElement Password;
	@FindBy(xpath="//input[@value='Login']")
	private WebElement LogIn;
	
	@FindBy(xpath="/html/body/div[2]")
	private WebElement SuccessMsg;
	

	
	public void gotologinPg()
	{
		sdriver.get("https://dsportalapp.herokuapp.com/login");
	}
	public void PassCredentials()
	{
		Username.sendKeys(constants.USERNAME);
		Password.sendKeys(constants.PASSWORD);
		LogIn.click();
	}
	
	public boolean LoggedInsuccess()
	{
		boolean result = SuccessMsg.isDisplayed();
		return result;
	}
	
}
