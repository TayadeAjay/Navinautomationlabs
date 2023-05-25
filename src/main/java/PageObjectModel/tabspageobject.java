package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tabspageobject {
	public WebDriver driver;

	private By dekstops1 = By.xpath("(//a[@class='dropdown-toggle'])[2]");

	private By LaptopsandNotebooks = By.xpath("(//a[@class='dropdown-toggle'])[3]");

	private By Components = By.xpath("(//a[@class='dropdown-toggle'])[4]");

	private By MP3Players = By.xpath("(//a[@class='dropdown-toggle'])[5]");

	private By Tablets = By.xpath("//a[contains(text(),'Tablets')]");

	private By Software = By.xpath("//a[contains(text(),'Software')]");

	private By PhonesPDAs = By.xpath("//a[contains(text(),'Phones & PDAs')]");

	private By Cameras = By.xpath("//a[contains(text(),'Cameras')]");

	private By Mac1 = By.xpath("//a[contains(text(),'Mac (1)')]");

	private By iMac = By.xpath("//a[contains(text(),'iMac')]");

	public tabspageobject(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement dekstops1() {
		return driver.findElement(dekstops1);
	}

	public WebElement LaptopsandNotebooks() {
		return driver.findElement(LaptopsandNotebooks);

	}

	public WebElement Components() {
		return driver.findElement(Components);
	}

	public WebElement MP3Players() {
		return driver.findElement(MP3Players);

	}

	public WebElement Tablets() {
		return driver.findElement(Tablets);

	}

	public WebElement Software() {
		return driver.findElement(Software);

	}

	public WebElement PhonesPDAs() {
		return driver.findElement(PhonesPDAs);

	}

	public WebElement Cameras() {
		return driver.findElement(Cameras);

	}

	public WebElement Mac1() {
		return driver.findElement(Mac1);
	}

	public WebElement iMac() {
		return driver.findElement(iMac);

	}

}
