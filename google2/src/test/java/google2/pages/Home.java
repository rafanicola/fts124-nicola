package google2.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageObject {
	
	@FindBy(name = "q")
	private WebElement strBusca;
	
	@FindBy(name = "btnK")
	private WebElement btnBuscar;
	
	public Home (WebDriver driver) {
		super(driver);
		
	}
	
	public void digitarBuscaEnter(String termo) {
		this.strBusca.clear();
		this.strBusca.sendKeys(termo + Keys.ENTER);
		
	}
	
	public void digitarBuscaClick(String termo) {
		this.strBusca.clear();
		this.strBusca.sendKeys(termo);
		this.btnBuscar.click();
		
	}
	
}
