package numpyninja.dsalgo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {
	  
	public final String HOME = "https://dsportalapp.herokuapp.com/home";
	public final String ARRAY_PAGE_URL = "https://dsportalapp.herokuapp.com/array/";
	public final String ARRAY_PYTHON_URL = "https://dsportalapp.herokuapp.com/array/arrays-in-python/";
	public final String ARRAY_LIST_URL = "https://dsportalapp.herokuapp.com/array/arrays-using-list/";
	public final String ARRAY_BASIC_URL = "https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/";
	public final String ARRAY_APPS_URL = "https://dsportalapp.herokuapp.com/array/applications-of-array/";
	public final String ARRAY_PRACTICE = "https://dsportalapp.herokuapp.com/array/practice";
	public final String EDITOR = "https://dsportalapp.herokuapp.com/tryEditor";
	
		
	  public ArrayPage(WebDriver webDriver)
	  {
	       PageFactory.initElements(webDriver, this);
	  }
	  
	  @FindBy (xpath="//a[@href='array']")
	  @CacheLookup
	  public WebElement getStarted;
	  
	  @FindBy (xpath="//*[contains(@href,'tryEditor')]")
	  @CacheLookup
	  public WebElement editor;
	  
	  @FindBy (xpath="//*[contains(@href,'arrays-in-python')]")
	  @CacheLookup
	  public WebElement arraysInPython; 
	  
	  @FindBy (xpath="//*[contains(@href,'arrays-using-list')]")
	  @CacheLookup
	  public WebElement arraysUsingList;
	  
	  @FindBy (xpath="//*[contains(@href,'basic-operations-in-lists')]")
	  @CacheLookup
	  public WebElement arraysBasicList;
	  
	  @FindBy (xpath="//*[contains(@href,'applications-of-array')]")
	  @CacheLookup
	  public WebElement arraysApps;
	  
	  @FindBy (xpath="//*[contains(@href,'practice')]")
	  @CacheLookup
	  public WebElement practice;
	  
	  @FindBy (xpath="//*[@id='answer_form']/div/div")
	  @CacheLookup
	  public WebElement pythonEditor;
	  
	  @FindBy (xpath="//*[@id='answer_form']/button")
	  @CacheLookup
	  public WebElement pythonRun;
	  
}
		  
		  
