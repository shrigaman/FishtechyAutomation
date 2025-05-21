package Components.CustomizeCard;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CustomizeCard {
	public static void customizeCard(AndroidDriver driver, WebDriverWait wait) throws InterruptedException,Exception {


		WebElement feedButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
		feedButton.click();
		System.out.println("feedButton");
		// Click Home Measure Button
		
		WebElement homeMeasureButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.ImageView[@resource-id=\"nav_bar_center_button\"]")));
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
		
		WebElement customizeCardButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Customize Display Card\"]")));
		customizeCardButton.click();
		System.out.println("customizeCard Button");
		WebElement select1 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.HorizontalScrollView/android.view.View[3]")));
		select1.click();
		Thread.sleep(2000);
		select1.click();
		WebElement select2 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Opacity\"]/android.view.View[9]")));
		select2.click();
		Thread.sleep(2000);
		WebElement select3 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"OK\"]")));
		select3.click();
		Thread.sleep(2000);
		WebElement save = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")));
		save.click();
		
		Thread.sleep(2000);
		WebElement postMeasurement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Post Measurement\"]")));
		postMeasurement.click();

		Thread.sleep(5000);

		WebElement catchDetail = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.view.View[7]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]")));
		catchDetail.click();
		System.out.println("catch section click");
		WebElement catchTab = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Catch Tab 1 of 4\"]")));
		catchTab.click();
		System.out.println("catchDetail Tab");
		System.out.println("catchTab");
		WebElement DetailTab = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Catch Tab 1 of 4\"]")));
		DetailTab.click();
		System.out.println("DetailTab");
		WebElement ReviewTab = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Catch Tab 1 of 4\"]")));
		ReviewTab.click();
		System.out.println("ReviewTab");
		WebElement RemarkTab = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Catch Tab 1 of 4\"]")));
		RemarkTab.click();
		System.out.println("RemarkTab");
	
		Thread.sleep(5000);
	}
}


