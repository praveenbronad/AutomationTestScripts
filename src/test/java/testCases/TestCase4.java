package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilLib.StepGroup;

public class TestCase4  extends StepGroup{
	@Test
	public void testCase04()
	{
		// assert first button is enabled
		WebElement button1 = driver.findElement(By.xpath("(//button[@class=\"btn btn-lg btn-primary\"])[1]"));
		boolean expectedButtonEnable=true;
		boolean actualButtonEnable=button1.isEnabled();
		Assert.assertEquals(actualButtonEnable, expectedButtonEnable);
		
		// assert second button is disabled
		WebElement button2 = driver.findElement(By.xpath("//button[@class=\"btn btn-lg btn-secondary\"]"));
		boolean expectedButton2Enabled=false;
		boolean actaulButton2Enabled=button2.isEnabled();
		Assert.assertEquals(actaulButton2Enabled, expectedButton2Enabled);
	}
}
