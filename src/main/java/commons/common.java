package commons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class common {

	public static void commonselect(WebElement dropdownElement, String optionText) {

		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText(optionText);
	}

	public static void assertion(String actualtext, String expectedtext) {
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(actualtext, expectedtext);
		assertion.assertAll();
	}

	public static void assertiondb(double totalprice, double expectedprice) {
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(totalprice, expectedprice);
		assertion.assertAll();

	}

}
