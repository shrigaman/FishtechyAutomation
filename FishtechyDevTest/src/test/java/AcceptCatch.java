import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcceptCatch {
	public static void acceptCatchByModerator(AndroidDriver driver, WebDriverWait wait)
			throws InterruptedException {
		
		
		String[] categoryXPaths = {
				"//android.widget.Button[@content-desc=\"Measurement Confirmed\"]",
				"//android.widget.Button[@content-desc=\"Measurement Increased\"] ",
				"//android.widget.Button[@content-desc=\"Measurement Decreased\"]"

		};
		
		
		
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
		
		for (int i = 0; i < categoryXPaths.length; i++) {
			WebElement AcceptButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("")));
			AcceptButton.click();
			WebElement selectCategoryButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"-Select-\"]")));
			selectCategoryButton.click();
			WebElement measurementoptionButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(categoryXPaths[i])));
			measurementoptionButton.click();
//			WebElement measurementIncreasedButton = wait.until(ExpectedConditions
//					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Measurement Increased\"] ")));
//			measurementIncreasedButton.click();
//			WebElement measurementDecreasedButton = wait.until(ExpectedConditions
//					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Measurement Decreased\"]")));
//			measurementDecreasedButton.click();
			
			WebElement selectReasonButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"-Select-\"]")));
			selectReasonButton.click();
			WebElement niceCatchButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Nice\"]")));
			niceCatchButton.click();
			WebElement saveButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")));
			saveButton.click();
			SwipeUtils.swipeDown(driver);
			WebElement qualityScoreButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"8\"]")));
			qualityScoreButton.click();
			
			WebElement addCommentButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"custom_message_textfield\"]/android.widget.EditText")));
			addCommentButton.click();
			addCommentButton.sendKeys("Test");
			WebElement submitButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")));
			submitButton.click();
			WebElement outerRestoreButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Restore\"]")));
			outerRestoreButton.click();
			WebElement innerRestoreButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Restore\"]")));
			innerRestoreButton.click();
		}
		
	}
}
