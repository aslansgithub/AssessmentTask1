package checkBox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import checkBox.utils.BaseClass;

public class ElementsPageUsingPageFactory {

	
	
	@FindBy(xpath = "//span[text()='Check Box']")
	public WebElement checkBox;

	@FindBy(xpath = "//button[@class='rct-option rct-option-expand-all']")
	public WebElement plus;
	
	@FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[1]")
	public WebElement angular;
	
	@FindBy(xpath = "//span[@class='text-success']")
	public WebElement successText;
	
	
	public ElementsPageUsingPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
}
}
