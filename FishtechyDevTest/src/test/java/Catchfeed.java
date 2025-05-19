import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Catchfeed {
	public static void CatchFeed(AndroidDriver driver, WebDriverWait wait)
			throws InterruptedException {
		
		
		WebElement feedButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
		feedButton.click();
		for (int i = 0; i < 10; i++) {
			SwipeUtils.swipeDown(driver);
			System.out.println("swipped"+" " +i);
		    Thread.sleep(2000); // Wait for content to load
		}
	

	}
}
