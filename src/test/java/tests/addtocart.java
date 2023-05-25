package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.homepageobject;
import commons.common;
import commons.constant;
import resource.baseClass;

public class addtocart extends baseClass {

	@Test
	public void addtocart1() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepageobject hpo = new homepageobject(driver);

		hpo.search().sendKeys(constant.product1);
		hpo.searchclick().click();
		hpo.iphoneclickpr().click();
		Thread.sleep(4000);
		String iphoneprice = hpo.getpdprice().getText();
		double iphn = Double.parseDouble(iphoneprice.substring(1));

		hpo.addtocart().click();

		hpo.search().clear();
		hpo.search().sendKeys(constant.product2);
		hpo.searchclick().click();
		hpo.samsungclickproduct().click();
		Thread.sleep(4000);
		String samsungprice = hpo.getpdprice().getText();
		double sam = Double.parseDouble(samsungprice.substring(1));

		hpo.addtocart().click();
		hpo.carttotalclick().click();

		double expectedprice = iphn + sam;
		String carttotal = hpo.getcarttotal().getText();
		double totalprice = Double.parseDouble(carttotal.substring(1));

		common.assertiondb(totalprice, expectedprice);

	}
}
