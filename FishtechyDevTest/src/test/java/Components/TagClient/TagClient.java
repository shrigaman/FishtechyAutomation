package Components.TagClient;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Components.Login.LoginPage;


public class TagClient {
	public static void tagClient(AndroidDriver driver, WebDriverWait wait) throws InterruptedException,Exception {


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
		
		WebElement TagClientButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Tag Clients\"]")));
		TagClientButton.click();
		System.out.println("Tag clientButton");
		WebElement inputfield = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText")));
		inputfield.click();
		Thread.sleep(2000);
		inputfield.sendKeys("aman");
		System.out.println("inputfield");
		WebElement select1 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//android.widget.Button[@content-desc=\"Select\"])[1]")));
		select1.click();
		Thread.sleep(2000);
		WebElement select2 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//android.widget.Button[@content-desc=\"Select\"])[1]")));
		select2.click();
		Thread.sleep(2000);
		WebElement select3 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Select\"]")));
		select3.click();
		Thread.sleep(2000);
		WebElement save = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")));
		save.click();
		
		Thread.sleep(2000);
		WebElement postMeasurement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Post Measurement\"]")));
		postMeasurement.click();
		//Tag Guide
//		WebElement guidedSection = wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Guided Tab 2 of 2\"]")));
//		guidedSection.click();
		System.out.println("guidedSection");
		Thread.sleep(5000);

		WebElement settingButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@resource-id=\"settings_button_button\"]")));
		settingButton.click();
		System.out.println("settingButton");
		WebElement accountSettingButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Account Settings\"]")));
		accountSettingButton.click();
		System.out.println("settingButton");
		//SwipeUtils.swipeDown(driver);
		WebElement logoutInterfaceButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Logout\"]")));
		logoutInterfaceButton.click();
		System.out.println("logoutInterfaceButton");
		WebElement logoutButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")));
		logoutButton.click();
		System.out.println("logoutButton");
		LoginPage.login(driver, wait, "amanforedu635@gmail.com", "Hello6635");
		WebElement notificationButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"notification_button\"]")));
		notificationButton.click();
		System.out.println("notificationButton");
		WebElement outeracceptButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Accept \"]")));
		outeracceptButton.click();
		System.out.println("outeracceptButton");
		Thread.sleep(3000);
		WebElement guidedSection2 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Guided Tab 2 of 2\"]")));
		guidedSection2.click();
		System.out.println("guidedSection");
		Thread.sleep(5000);
	}
}


