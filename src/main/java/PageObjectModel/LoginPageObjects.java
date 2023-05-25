package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;
	private By myaccount = By.xpath("//span[@class='caret']");



	private By Logindirect = By.xpath("//a[contains(text(),'Login')]");

	private By useremail = By.xpath("//input[@name='email']");

	private By password = By.xpath("//input[@name='password']");

	private By login = By.xpath("//input[@type='submit']");

	private By loginverify = By.xpath("//h2[contains(text(),'My Account')]");

	private By errorText = By.xpath("//div[contains(text(),' Warning: No match for E-Mail Address and/or Password.')]");

	
	public LoginPageObjects(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement myaccount() {
		return driver.findElement(myaccount);
	}

	public WebElement Logindirect() {
		return driver.findElement(Logindirect);

	}

	public WebElement useremail() {
		return driver.findElement(useremail);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);

	}

	public WebElement clickLogin() {
		return driver.findElement(login);

	}

	public WebElement loginverify() {
		return driver.findElement(loginverify);

	}

	public WebElement errorText() {
		return driver.findElement(errorText);

	}

}
