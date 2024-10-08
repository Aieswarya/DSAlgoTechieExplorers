package numpyninja.dsalgo.pageObjects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


//tagname[@attributeName='value']
//tagname[text()='value']
public class HomePage {

	public WebDriver hdriver;

	public HomePage(WebDriver rdriver) {
		hdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/a")
	//@FindBy(
	@FindBy(className="nav-link dropdown-toggle")
	@CacheLookup
	WebElement dsDropDown;
	
	@FindBy(className="dropdown-menu show")
	WebElement dropdownlist;

	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]")
	WebElement ddarray;

	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[2]")
	WebElement ddlinkedList;

	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[3]")
	WebElement ddstack;

	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[4]")
	WebElement ddqueue;

	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[5]")
	WebElement ddtree;

	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[6]")
	WebElement ddgraph;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/div/a")
	WebElement dsIntrogs;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/a")
	WebElement arraygs;

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/a")
	WebElement linkedlistgs;

	@FindBy(xpath = "/html/body/div[3]/div[4]/div/div/a")
	WebElement stackgs;

	@FindBy(xpath = "/html/body/div[3]/div[5]/div/div/a")
	WebElement queuegs;

	@FindBy(xpath = "/html/body/div[3]/div[6]/div/div/a")
	WebElement treegs;

	@FindBy(xpath = "/html/body/div[3]/div[7]/div/div/a")
	WebElement graphgs;

	public void dropdown() {
		dsDropDown.click();
	}
	
	public boolean getdropdownoptions(int count,String options)
	{   
		boolean result =false;
		Select select = new Select(dropdownlist);
		List<WebElement> ddlist =select.getOptions();
		String[] givenlist = options.split("");
		int counter =0;
		
		for (WebElement i :ddlist) {
			
			if(Arrays.asList(givenlist).contains(i)) {
				counter +=1;
				result = true;
			}
			else {
				//log4j implement 
				System.out.println(" Element not present in given list");
				result =false;
				break;
			}
		}
		
		if(counter==count ) {
		 System.out.println("all count elements present!");	
		}
		return result;
	}

	public void ddarraybtn() {
		ddarray.click();
	}

	public void ddlinkedListbtn() {
		ddlinkedList.click();
	}

	public void ddstackbtn() {
		ddstack.click();
	}

	public void ddqueuebtn() {
		ddqueue.click();
	}

	public void ddtreebtn() {
		ddtree.click();
	}

	public void ddgraphbtn() {
		ddgraph.click();
	}

	public void dsIntrogsbtn() {
		dsIntrogs.click();
	}

	public void arraygsbtn() {
		arraygs.click();
	}

	public void linkedlistgs() {
		linkedlistgs.click();

	}

	public void stackgsbtn() {
		stackgs.click();

	}

	public void queuegs()

	{
		queuegs.click();
	}

	public void treegsbtn() {
		treegs.click();
	}

	public void graphgsbtn() {
		graphgs.click();
     }
	
	
}
