import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SmartLog {
	public static void smartLog(AndroidDriver driver, WebDriverWait wait) throws InterruptedException {

		WebElement feedButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
		feedButton.click();
		System.out.println("feedButton");
		// Click Home Measure Button
		WebElement homeMeasureButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.ImageView[@resource-id='nav_bar_center_button']")));
		homeMeasureButton.click();
		System.out.println("homeMeasureButton");

		// Click Upload Button
		WebElement measureButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Upload']")));
		measureButton.click();

		WebElement continueButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Continue']")));
		continueButton.click();

		WebElement allowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")));
		allowButton.click();

		WebElement recentButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Recent']")));
		recentButton.click();
		System.out.println("recentButton");

		WebElement pictureButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Aa, count: 20']")));
		pictureButton.click();
		System.out.println("pictureButton");
		WebElement clickImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//android.widget.ImageView[@content-desc=\"Image1, 2025-04-07 13:46:48, 0c91c268-71b5-4f48-8e73-b00e5044fb8e.jpeg\"]")));
		clickImage.click();
		System.out.println("clickImage");
		// Click Continue
		WebElement screenShotContinueButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Continue']")));
		screenShotContinueButton.click();
		System.out.println("screenShotContinueButton");
		// Click Crop
		WebElement tickButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Crop']")));
		tickButton.click();
		System.out.println("tickButton");
		// Click Measure Fish
		WebElement measureFishButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Measure Fish']")));
		measureFishButton.click();
		System.out.println("measureFishButton");
		WebElement nextButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Next']")));
		nextButton.click();
		System.out.println("nextButton");
		WebElement PrivateDetailButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.view.View[@content-desc=\"Add Catch Details (Private)\"]")));
		PrivateDetailButton.click();
		System.out.println("PrivateDetailButton");
		WebElement addLocationButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Add Location\"]")));
		addLocationButton.click();
		System.out.println("addLocationButton");

		WebElement whileUsingtheappButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")));
		whileUsingtheappButton.click();
		System.out.println("whileUsingtheappButton");
		WebElement confirmButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]")));
		confirmButton.click();
		System.out.println("confirmButton");
		SwipeUtils.swipeDown(driver);
		SwipeUtils.swipeDown(driver);
		WebElement savePrivatelyButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Save Privately\"]")));
		savePrivatelyButton.click();
		System.out.println("savePrivatelyButton");
//                  WebElement searchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
//                          By.xpath("//android.widget.EditText[@text=\"Kathmandu, Bagmati Province, NP\"]")));
//                  searchButton.click();
//                  System.out.println("searchButton");

		WebElement postMeasurementButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Post Measurement']")));
		postMeasurementButton.click();
		System.out.println("postMeasurementButton");
		// Close Success Message
//		WebElement closeMessage = wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"close_button\"]")));
//
//		closeMessage.click();
		//System.out.println("closeMessage");
		WebElement mapbutton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Map\"]")));
		mapbutton.click();

		// inside your test or method
		int x = 500;
		int y = 800;

		GestureUtils.zoomIn(driver, x, y); // Zoom in
		GestureUtils.zoomOut(driver, x, y); // Zoom out

	}
}
