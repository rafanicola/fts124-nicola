package google2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resultados extends PageObject{
	
	@FindBy(css = "div.iKJnec")
	private WebElement strMensagem;
	
	public Resultados(WebDriver driver) {
		super(driver);
		
	}

	public String CapturaMensagem() {
		return strMensagem.getText();
	}
}
