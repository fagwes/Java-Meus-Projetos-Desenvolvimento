package robo3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robo {

	WebDriver driver;

	By clicar = By.xpath("//*[@id=\"sidebar\"]/div/div/div/center/form/p/input");
	By clicar1 = By.xpath("//*[@id=\"sidebar\"]/div/div/div/center/form/p/input");
	By ganhar = By.xpath("//*[@id=\"sidebar\"]/div/div/div/div[1]/a[2]");
	By obterdinheiro = By.xpath("//*[@id=\"panelb\"]/p/a");
	By obterdinheiro2 = By.xpath("//*[@id=\"panelb\"]/p/a");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fagwe\\OneDrive\\Área de Trabalho\\Wesley\\Drivers Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://yagoberry.ru/bonus");
		driver.manage().window().maximize();

	}

	@Test
	public void test() throws InterruptedException {

		driver.findElement(clicar).click();
		driver.findElement(clicar1).click();
		driver.findElement(clicar1).sendKeys("P1080278541");
		driver.findElement(clicar1).submit();
		driver.findElement(ganhar).click();

		driver.findElement(obterdinheiro).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);
		
		
	}

}
