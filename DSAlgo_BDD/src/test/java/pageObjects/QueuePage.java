package pageObjects;


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
		
		@FindBy (xpath = "//*[text()='Data Structures-Introduction']//following::a[5]")
		public
		WebElement getStarted;
		

		
		@FindBy (xpath = "//a[contains(text(),'Implementation of Queue in Python')]")
		public
		WebElement implementationOfQueueInPython;
		
		@FindBy (xpath = "//a[contains(text(),'Implementation using collections.deque')]")
		public
		WebElement implementationUsingCollectionsDeque;
		
		
		@FindBy (xpath = "//a[contains(text(),'Implementation using array')]")
		public
		WebElement implementationUsingArray;;
		
		
		@FindBy (xpath = "//a[contains(text(),'Queue Operations')]")
		public	
		WebElement queueOperations;
		
		
		@FindBy (xpath = "//a[contains(text(),'Practice Questions')]")
		public
		WebElement practice;	
		
	    @FindBy(xpath = "//a[contains(text(),'Try here')]")
	    public WebElement editor;
		
		

	    public void ImplementaionOfQueueInPython() {
	        implementationOfQueueInPython.click();
	    }

	    public void ImplementationUsingCollectionsDeque() {
	        implementationUsingCollectionsDeque.click();
	    }

	    public void ImplementationUsingArray() {
	        implementationUsingArray.click();
	    }

	    public void QueueOperations() {
	        queueOperations.click();
	    }

	    public void Practice() {
	        practice.click();
	    }
	}
