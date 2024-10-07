package numpyninja.dsalgo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graph {
	
	WebDriver gdriver;
	
	public Graph(WebDriver rdriver) {
		gdriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
 
 @FindBy(xpath="/html/body/div[2]/ul[2]/a")
 @CacheLookup
 WebElement graph;
 
 @FindBy(xpath="/html/body/div[2]/div/div[2]/a")
 @CacheLookup
 WebElement gTryHere;
 
 @FindBy(xpath="//*[@id=\"answer_form\"]")
 @CacheLookup
 WebElement geditor;
 
 @FindBy(xpath="//*[@id=\"answer_form\"]/button")
 @CacheLookup
 WebElement gRun;
 
 @FindBy(xpath="/html/body/div[2]/ul[3]/a")
 @CacheLookup
 WebElement graphrep;
 
 @FindBy(xpath="/html/body/div[2]/div/div[2]/a")
 @CacheLookup
 WebElement grTryHere; 
 
 @FindBy(xpath="//*[@id=\"answer_form\"]/input")
 @CacheLookup
 WebElement grEditor;
 
 @FindBy(xpath="//*[@id=\"answer_form\"]/button")
 @CacheLookup
 WebElement grRun;
 
 public void graphlk() {
	 graph.click();
 }
 public void gTryHerebtn() {
	 gTryHere.click();
 }
 
 public void geditorform(String inputcode) {
	 geditor.sendKeys(inputcode);
 }
 
 public void gRunbtn()
 {
	 gRun.click();
 }
 
 public void graphrepbtn() {
	 graphrep.click();
 }
 
 public void grTryHerebtn() {
	 
	 grTryHere.click();
 }
 
 public void grEditorform(String inputcode) {
	 grEditor.sendKeys(inputcode);
 }
 
 public void grRun()
 {
	 grRun.click();
 }
 
}
