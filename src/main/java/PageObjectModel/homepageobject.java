package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepageobject {
	public WebDriver driver;

	private By search = By.xpath("//input[@placeholder='Search']");

	private By searchclick = By.xpath("//button[@class='btn btn-default btn-lg']");

	private By iphoneclickpr = By.xpath("//a[contains(text(),'iPhone')]");

	private By samsungclickproduct = By.xpath("(//div[@class='caption']//h4)[1]");

	private By getpdprice = By.xpath("//ul[@class='list-unstyled']//h2");

	private By addtocart = By.xpath("//button[@id='button-cart']");

	private By carttotalclick = By.xpath("//span[@id='cart-total']");

	private By getcarttotal = By.xpath("//td[contains(text(),'$365.20')]");

	private By linksverify = By.xpath("//div[@class='row']//div//ul//li//a");

	public homepageobject(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement search() {
		return driver.findElement(search);
	}

	public WebElement searchclick() {
		return driver.findElement(searchclick);
	}

	public WebElement iphoneclickpr() {
		return driver.findElement(iphoneclickpr);
	}

	public WebElement samsungclickproduct() {
		return driver.findElement(samsungclickproduct);
	}

	public WebElement getpdprice() {
		return driver.findElement(getpdprice);
	}

	public WebElement addtocart() {
		return driver.findElement(addtocart);
	}

	public WebElement carttotalclick() {

		return driver.findElement(carttotalclick);

	}

	public WebElement getcarttotal() {

		return driver.findElement(getcarttotal);

	}
	public List<WebElement> linksverify() {

		return driver.findElements(linksverify);

	}

}
