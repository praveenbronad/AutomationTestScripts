package testCases;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import genericUtilLib.StepGroup;
public class TestCase2  extends StepGroup{
	@Test
	public void testCase02()
	{
		//get the list of options
		List<WebElement> list = driver.findElements(By.xpath("//*[@class=\"list-group\"]/li"));
		
		//verify number of options in list is 3 or not
		int expectedSize=3;
		int  actualSize = list.size();
		Assert.assertEquals(actualSize, expectedSize);
		
		//verify 2nd option is item 2 or not
		boolean expectedoption=true;
		boolean actualoption = list.get(1).getText().trim().contains("List Item 2");
		Assert.assertEquals(actualoption, expectedoption);
		
		//verify 2nd option value is 6 or not
		boolean expectedValue=true;
		boolean actualValue = list.get(1).getText().trim().contains("6");
		Assert.assertEquals(actualValue, expectedValue);
	}
	
}
