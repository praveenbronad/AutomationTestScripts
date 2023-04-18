package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilLib.StepGroup;

public class TestCase6  extends StepGroup{


public String getCellValue(int i,int j)
{
	//int noOfRow=driver.findElements(By.xpath("//table[@class=\"table table-bordered table-dark\"]//tr")).size();
//	int noOfColumns=driver.findElements(By.xpath("//table[@class=\"table table-bordered table-dark\"]//th")).size();
	
	WebElement actualValue = driver.findElement(By.xpath("//table[@class=\"table table-bordered table-dark\"]//tr["+(i+1)+"]//td["+(j+1)+"]"));
			 
	return actualValue.getText();
}

@Test
public void testCase05()
{
	String ExpectedCellValue ="Ventosanzap";
	String ActualCellValue=getCellValue(2,2);
	// verify the cell value
	Assert.assertEquals(ActualCellValue, ExpectedCellValue);
	System.out.println("Expected cell value is " + ExpectedCellValue);
	System.out.println("Actual cell value is " + ActualCellValue);


}
}
