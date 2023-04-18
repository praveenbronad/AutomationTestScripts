/**
 * 
 */
package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

/**
 * @author Praveen B Ronad
 *
 */
public class HomePage {
	
	// Declare WebElements 
	@FindBy(id="inputEmail")
	private WebElement emailTF;
	
	@FindBy(id="inputPassword")
	private WebElement passwordTF;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signInBtn;
	
	
	
	
	
	// initalize the Driver
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilise the web elements

	public void getEmailTF(String email) {
		emailTF.sendKeys(email);;
	}
	public void getPasswordTF(String password) {
		 passwordTF.sendKeys(password);
	}

	public void getSignInBtn() {
		 signInBtn.click();;
	}
	
	public boolean isEmailTextDisplayed()
	{
		return emailTF.isDisplayed();
	}
	public boolean isPasswordTextDisplayed()
	{
		return passwordTF.isDisplayed();
	}
	
	public boolean isSignINDisplayed()
	{
		return signInBtn.isDisplayed();
	}
	
	
	
	
}
