package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjectModel.RegisterPageObjects;
import commons.RandomGenerator;
import commons.common;
import commons.constant;
import resource.baseClass;

public class RegisterTest extends baseClass {
	public static String email;
	public static String mobileno;
	public static String password;

	@Test
	public void RegisterTCValid() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		RegisterPageObjects rpo = new RegisterPageObjects(driver);
		rpo.myaccount().click();
		rpo.directtoRegister().click();

		rpo.firstname().sendKeys(constant.username);
		rpo.lastname().sendKeys(constant.lastname);

		email = RandomGenerator.generateRandomEmail();
		mobileno = RandomGenerator.generateRandomMobile();
		password = constant.password;

		rpo.useremail().sendKeys(email);
		rpo.telephone().sendKeys(mobileno);
		rpo.password().sendKeys(password);
		rpo.passwordconfirm().sendKeys(password);

		rpo.agreeterms().click();
		rpo.clickcontinue().click();

		common.assertion(rpo.myaccountcreatedverify().getText(), constant.expectedtextacc);
	}

}
