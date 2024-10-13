package numpyninja.dsalgo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueuePage {

    WebDriver driver;

    public QueuePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
    @FindBy (xpath="//a[@href='queue']")
	  public WebElement getStarted;
	
	@FindBy (xpath="//*[contains(@href,'implementation-lists')]")
	public WebElement implementationOfQueueInPython;
	
	@FindBy (xpath="//*[contains(@href,'implementation-collections')]")
	public WebElement implementationUsingCollectionsDeque;
	
	@FindBy (xpath="//*[contains(@href,'Implementation-array')]")
	public WebElement implementationUsingArray;;
	
	@FindBy (xpath="//*[contains(@href,'QueueOp')]")
	public WebElement queueOperations;
	
	@FindBy (xpath="//*[contains(@href,'practice')]")
	public WebElement practice;	
	
	@FindBy (xpath="//*[contains(@href,'tryEditor')]")
	public WebElement editor;
		
}