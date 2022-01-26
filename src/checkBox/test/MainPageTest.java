package checkBox.test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import checkBox.pages.ElementsPageUsingPageFactory;
import checkBox.pages.MainPageUsingPageFactory;
import checkBox.utils.BaseClass;


public class MainPageTest extends BaseClass {
	
public static void main(String[] args) throws InterruptedException {
	
	//  1.	Navigate to https://.demoqa.com/
	//	2.	Select “Elements” tile
	//	3.	Select the “Check Box” option from the side menu
	//	4.	Expand the folder tree using the “+” button on the top right corner
	//	5.	Select the checkbox under the file path “Home” > “Workspace”> “Angular” 
	//	6.	Verify the selection
	//	7.	Uncheck the Angular checkbox
    //	8.	Verify it is no longer selected.

	
	
	
	
	
	
	
	// 1. open the browser and Navigate to https://.demoqa.com/
	setUp();

	
	//Using Page Object Model with Page Factory
	MainPageUsingPageFactory  main = new MainPageUsingPageFactory ();
	ElementsPageUsingPageFactory elements = new ElementsPageUsingPageFactory(); 
	
	//2.Select “Elements” tile
	main.element.click();
	
	
    //3.Select the “Check Box” option from the side menu
	elements.checkBox.click();
	Thread.sleep(3);
	
	
	//4.Expand the folder tree using the “+” button on the top right corner
	elements.plus.click();
	Thread.sleep(3);
	
	
	
     //5.Select the checkbox under the file path “Home” > “Workspace”> “Angular” 
	
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("arguments[0].click()", elements.angular);

	
	
    //6.Verify the selection
    j.executeScript("arguments[0].scrollIntoView(true)", elements.successText);
	 
    if(elements.successText.getText().equalsIgnoreCase("angular")) {System.out.println("Angular is selected --->>> Test passed");}
    else {System.out.println("Angular is NOT selected --->>>  Test failed");}
      


     //7.Uncheck the Angular checkbox
	j.executeScript("arguments[0].click()", elements.angular);
	
			
			
    //8.Verify it is no longer selected.
	     if (elements.angular.isSelected()) {
			System.out.println("Element is still selected!");
		} else {
			System.out.println("Element is NO LONGER selected!");
		}	
	
	 
	 
	
	tearDown();
	
	
	
	
}

}
