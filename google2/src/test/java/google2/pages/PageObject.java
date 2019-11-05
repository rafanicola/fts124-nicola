package google2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	protected WebDriver driver;
	
	public PageObject(WebDriver drive) {
		this.driver = driver;
		PageFactory.initElements(drive, this);
	}

}
