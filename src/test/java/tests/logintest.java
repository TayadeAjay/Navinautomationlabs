package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import commons.RandomGenerator;
import commons.common;
import commons.constant;
import resource.baseClass;

public class logintest extends baseClass {
	@Test(priority = 0)
	public void LoginTCvalid() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.myaccount().click();
		lpo.Logindirect().click();
		lpo.useremail().sendKeys(RegisterTest.email);
		lpo.enterPassword().sendKeys(RegisterTest.password);
		lpo.clickLogin().click();
		common.assertion(lpo.loginverify().getText(), constant.expectedtextlogin);

	}

	@Test(priority = 1)
	public void LoginTCinvalid() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.myaccount().click();
		lpo.Logindirect().click();

		// Enter invalid email and password
		lpo.useremail().sendKeys(RandomGenerator.generateRandomEmail());
		lpo.enterPassword().sendKeys("invalidpassword");

		lpo.clickLogin().click();

		// Assert that the error message is displayed
		common.assertion(lpo.errorText().getText(), constant.loginerror);

	}
}
