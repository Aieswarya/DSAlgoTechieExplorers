package numpyninja.dsalgo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedList {
	
	public WebDriver lldriver;
	
	public LinkedList(WebDriver rdriver) {
		lldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="/html/body/div[2]/ul[1]/a")
	WebElement llIntro;
	
	public void llIntrolnk()
	{
		llIntro.click();
	}
	

}
