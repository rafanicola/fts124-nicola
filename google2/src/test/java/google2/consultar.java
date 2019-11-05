package google2;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class consultar {

	String url;
	WebDriver driver;
	static String pastaPrint = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());

	// Fun��es de Apoio
	public void Print(String nomePrint) throws IOException {
		File foto = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(foto,
				new File("C:\\Users\\rafaelnicola\\fts-124workspace\\google2\\target\\prints\\" + pastaPrint + "\\" + nomePrint + ".png"));

	}

	@Before
	public void Iniciar() {
		url = "https://www.google.com.br";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rafaelnicola\\fts-124workspace\\google2\\drivers\\chrome\\78\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
	}

	@After
	public void Finalizar() {
		driver.quit();

	}

	@Given("que acesso o site do Google$")
	public void que_acesso_o_site_do_Google() throws Throwable {
		System.out.println("Passo 1 - Abre o Google");
		driver.get(url);
		Print("Consultar\\Passo 1 - Abre o Google");
	}

	@When("digito o termo \"([^\"]*)\" e pressiono Enter$")
	public void digito_o_termo_e_pressiono_Enter(String termo) throws Throwable {
		System.out.println("Passo 2 - Digita o termo e pressiona Enter");
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(termo);
		Print("Consultar\\Passo 2 - Digita o termo");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("Vejo os resultados e a guia \"([^\"]*)\"$")
	public void vejo_os_resultados_e_a_guia(String tituloEsperado) throws Throwable {
		System.out.println("Passo 3 - Exibe os resultados e o nome da guia");
		assertEquals(tituloEsperado, driver.getTitle());
		Print("Consultar\\Passo 3 - Exibe os resultados e o nome da guia");
	}

}
