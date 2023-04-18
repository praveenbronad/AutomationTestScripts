package testCases;
import org.testng.annotations.Test;
import genericUtilLib.PropertyFile;
import genericUtilLib.StepGroup;
import pomPages.HomePage;
public class TestCase1 extends StepGroup{
	
	@Test
	public void testCase01() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		PropertyFile pdata=new PropertyFile();
		// check both emailID,password and login button is displayed or not
		System.out.println("email id text field is displayed ? " + hp.isEmailTextDisplayed());
		System.out.println("password  text field is displayed ? " +hp.isPasswordTextDisplayed());
		System.out.println("signINButton is displayed ? " +hp.isSignINDisplayed());
		//enter emailID
		hp.getEmailTF(pdata.getPropertyData("emailId"));
		// enter password
		hp.getPasswordTF(pdata.getPropertyData("password"));
		//click on submit button
		hp.getSignInBtn();
	}
}
