package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.tabspageobject;
import commons.WaitUtils;
import commons.common;
import commons.constant;
import resource.baseClass;

public class MouseHoverTest extends baseClass {

	@Test
	public void testMouseHoverTabsAndClickProduct() {
		
		Actions actions = new Actions(driver);
		
		WaitUtils waitUtils = new WaitUtils(driver);
		waitUtils.setImplicitWait(10);
		
		tabspageobject tpo = new tabspageobject(driver);

		actions.moveToElement(tpo.dekstops1()).perform();

		tpo.Mac1().click();
		String at = tpo.iMac().getText();

		actions.moveToElement(tpo.LaptopsandNotebooks()).perform();

		actions.moveToElement(tpo.Components()).perform();

		actions.moveToElement(tpo.MP3Players()).perform();

		common.assertion(at, constant.iMac);

	}

}
