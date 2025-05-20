import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Components.Login.LoginPage;

import java.util.Arrays;
import java.util.List;

public class TagGuide {
	public static void tagGuide(AndroidDriver driver, WebDriverWait wait) throws InterruptedException,Exception {

		// List of Image Paths
//        String[] imageXPaths = {
//        		"//android.widget.ImageView[@content-desc=\"Image1, 2025-03-29 14:19:28, 6ac06f4c-6936-4e16-8abb-ca35f111b534.jpeg\"]",    
//        };

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
		//Transfer Owner
		WebElement TransferOwnerButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Transfer Owner\"]")));
		TransferOwnerButton.click();
		System.out.println("TagButton");
//		WebElement TagButton = wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Tag Guide\"]")));
//		TagButton.click();
//		System.out.println("TagButton");
		WebElement inputfield = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText")));
		inputfield.click();
		inputfield.sendKeys("aman");
		System.out.println("inputfield");
		WebElement tranfer = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//android.widget.Button[@content-desc=\"Transfer\"])[2]")));
		tranfer.click();
		//Tag Guide
//		WebElement selectButton = wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("(//android.widget.Button[@content-desc=\"Select\"])[2]")));
//		selectButton.click();
		System.out.println("tranfer");
		
		WebElement confirmButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]")));
		confirmButton.click();
		System.out.println("confirmButton");
//		WebElement closeButton = wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"close_button\"]")));
//		closeButton.click();
		System.out.println("closeButton");
		WebElement settingButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@resource-id=\"settings_button\"]")));
		settingButton.click();
		System.out.println("settingButton");
		SwipeUtils.swipeDown(driver);
		WebElement logoutInterfaceButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Logout\"]")));
		logoutInterfaceButton.click();
		System.out.println("logoutInterfaceButton");
		WebElement logoutButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")));
		logoutButton.click();
		System.out.println("logoutButton");
		LoginPage.login(driver, wait, "amanforedu635@gmail.com", "Aman6635");
		WebElement notificationButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"notification_button\"]")));
		notificationButton.click();
		System.out.println("notificationButton");
		WebElement outeracceptButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Accept \"]")));
		outeracceptButton.click();
		System.out.println("outeracceptButton");
//                  WebElement acceptButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
//                          By.xpath("//android.widget.Button[@content-desc=\"Accept \"]")));
//                  acceptButton.click();
//                  System.out.println("acceptButton");
		WebElement acceptButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Accept \"]")));
		acceptButton.click();
		System.out.println("AcceptButton");
		WebElement saveMeasurementButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Save Measurement\"]")));
		saveMeasurementButton.click();
		System.out.println("saveMeasurementButton");

	}
}
