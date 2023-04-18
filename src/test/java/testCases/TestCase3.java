package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilLib.StepGroup;

public class TestCase3 extends StepGroup {
	@Test
	public void testCase03() throws InterruptedException
	{
		WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
		dropDownMenu.click();
		// check default option is Option 1 or not
		boolean actualDefaultOption = dropDownMenu.getText().trim().contains("Option 1");
		boolean expectedDefaultOption = true;
		Assert.assertEquals(actualDefaultOption, expectedDefaultOption);
		// select Option 3 from list
		List<WebElement> options = driver.findElements(By.xpath("//a[@class=\"dropdown-item\"]"));
		for(WebElement o:options)
		{
			if(o.getText().trim().equals("Option 3"))
			{
				o.click();
				break;
			}
		}
		// verify whether option 3 is really selected or not
		boolean expectedOptionToBeSelected = true;
		boolean actualOptionSelected = dropDownMenu.getText().trim().equals("Option 3");
		Assert.assertEquals(actualOptionSelected, expectedOptionToBeSelected);
	}
}
