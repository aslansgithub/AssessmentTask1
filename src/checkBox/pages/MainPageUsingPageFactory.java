package checkBox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import checkBox.utils.BaseClass;

public class MainPageUsingPageFactory {
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div")
	public WebElement element;

	public MainPageUsingPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	
	
	
}
}
