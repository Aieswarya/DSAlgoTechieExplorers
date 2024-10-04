
package pageObjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class SignInPage {
		
		public WebDriver ldriver;
		
		public SignInPage(WebDriver rdriver) {
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		//@FindBy(xpath="//button[contains(text(),'Get Started')]")
		//WebElement btngetstarted;

		@FindBy(linkText="Sign in")
		WebElement btnSignin;
		
		@FindBy(id ="id_username")
		@CacheLookup
		WebElement txtusername;

		
		@FindBy(id ="id_password")
		@CacheLookup
		WebElement txtpassword;
		
		@FindBy(xpath ="//input[@value='Login']")
		WebElement btnlogin;
		
		public void clickSignIn() {
			btnSignin.click();
		}
		
		public void Username() {
			txtusername.clear();
			txtusername.sendKeys(null);
			
		}
		
		public void Password() {
			txtpassword.clear();
			txtpassword.sendKeys(null);
		}
	
	public void clickLogin() {
		btnlogin.click();
	}
	
}
	
	
	
	
	
	
	
	

