import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RejectCatch {
	public static void rejectCatchByModerator(AndroidDriver driver, WebDriverWait wait)
			throws InterruptedException {
		WebElement feedButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
		feedButton.click();
		WebElement DisputedTabButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Disputed\r\n"
						+ "Tab 1 of 2\"]")));
		DisputedTabButton.click();
		WebElement arrowButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.view.View[3]")));
		arrowButton.click();
		SwipeUtils.swipeDown(driver);
		WebElement RejectButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("")));
		RejectButton.click();
		WebElement selectCategoryButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"-Select-\"]")));
		selectCategoryButton.click();
		WebElement optionButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Test\"]")));
		optionButton.click();

		WebElement saveButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")));
		saveButton.click();
		SwipeUtils.swipeDown(driver);
		WebElement qualityScoreButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"5\"]")));
		qualityScoreButton.click();
		
		WebElement addCommentButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"custom_message_textfield\"]/android.widget.EditText")));
		addCommentButton.click();
		addCommentButton.sendKeys("Test");
		WebElement submitButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")));
		submitButton.click();
	}
}
