package commons;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class WaitUtils {

	private WebDriver driver;
	private final int TIMEOUT_SECONDS = 10;
	private final int POLLING_INTERVAL_MS = 500;

	public WaitUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void setImplicitWait(int timeoutSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutSeconds));
	}

	public void setExplicitWait(Duration timeoutSeconds, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void setFluentWait(int timeoutSeconds, int pollingIntervalMs, By locator) {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(timeoutSeconds))
				.pollingEvery(Duration.ofMillis(pollingIntervalMs)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
