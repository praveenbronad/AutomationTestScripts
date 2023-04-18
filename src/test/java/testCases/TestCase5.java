package testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilLib.StepGroup;

public class TestCase5 extends StepGroup {
	@Test
	public void testCase05()
	{
		// wait till button displayed
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement button5 = driver.findElement(By.id("test5-button"));
		wait.until(ExpectedConditions.visibilityOf(button5));
		// click button 5
		button5.click();
		WebElement alertMessage = driver.findElement(By.id("test5-alert"));
		boolean expectedMessage = true;
		boolean ActaulMessage = alertMessage.getText().trim().equals("You clicked a button!");
		// check success message is displayed or not
		Assert.assertEquals(ActaulMessage, expectedMessage);
	}

}
