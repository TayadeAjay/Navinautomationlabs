package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.baseClass;

public class RegisterPageObjects extends baseClass {

	public WebDriver driver;
	private By myaccount = By.xpath("//span[@class='caret']");

	private By directtoRegister = By.xpath("//a[contains(text(),'Register')]");

	private By firstname = By.xpath("//input[@name='firstname']");

	private By lastname = By.xpath("//input[@name='lastname']");

	private By useremail = By.xpath("//input[@name='email']");

	private By telephone = By.xpath("//input[@name='telephone']");

	private By password = By.xpath("//input[@name='password']");

	private By passwordconfirm = By.xpath("//input[@name='confirm']");

	private By agreeterms = By.xpath("//input[@name='agree']");

	private By clickcontinue = By.xpath("//input[@type='submit']");

	private By errorwarning = By.xpath("//div[@class='text-danger']");

	private By myaccountcreatedverify = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");

	private By Logout = By.xpath("//a[contains(text(),'Logout')]");

	public RegisterPageObjects(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement myaccount() {
		return driver.findElement(myaccount);
	}

	public WebElement directtoRegister() {
		return driver.findElement(directtoRegister);
	}

	public WebElement firstname() {
		return driver.findElement(firstname);
	}

	public WebElement lastname() {
		return driver.findElement(lastname);
	}

	public WebElement useremail() {
		return driver.findElement(useremail);
	}

	public WebElement telephone() {
		return driver.findElement(telephone);
	}

	public WebElement password() {

		return driver.findElement(password);

	}

	public WebElement passwordconfirm() {

		return driver.findElement(passwordconfirm);

	}

	public WebElement agreeterms() {

		return driver.findElement(agreeterms);

	}

	public WebElement clickcontinue() {

		return driver.findElement(clickcontinue);

	}

	public WebElement errorwarning() {

		return driver.findElement(errorwarning);

	}

	public WebElement myaccountcreatedverify() {

		return driver.findElement(myaccountcreatedverify);

	}

	public WebElement Logout() {

		return driver.findElement(Logout);

	}
}
