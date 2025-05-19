import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Onboarding {
	public static void onboarding(AndroidDriver driver, WebDriverWait wait)
			throws InterruptedException {
		WebElement firstButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button")));
		firstButton.click();
		WebElement secondButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button")));
		secondButton.click();
		WebElement thirdButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button")));
		thirdButton.click();
		WebElement continueButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")));
		continueButton.click();
		WebElement NoButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"No\"]")));
		NoButton.click();
		WebElement saveButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")));
		saveButton.click();
		WebElement FeedButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
		FeedButton.click();
		WebElement homeMeasureButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.ImageView[@resource-id='nav_bar_center_button']")));
		homeMeasureButton.click();
		
		

		WebElement measureButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Upload']")));
		measureButton.click();

		// Handle permissions only on the first run
		
			WebElement continueButton2 = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Continue']")));
			continueButton2.click();

			WebElement allowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")));
			allowButton.click();
			
			WebElement recentButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Recent']")));
			recentButton.click();
			System.out.println("recentButton");

			WebElement pictureButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Aa, count: 20']")));
			pictureButton.click();
			System.out.println("pictureButton");
			WebElement clickImage = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Image1, 2025-04-07 13:46:48, 0c91c268-71b5-4f48-8e73-b00e5044fb8e.jpeg\"]")));
			clickImage.click();
			System.out.println("clickImage" );
			
			WebElement nextButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Next']")));
			nextButton.click();
			System.out.println("nextButton");

			WebElement postMeasurementButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//android.widget.Button[@content-desc='Post Measurement']")));
			postMeasurementButton.click();
			System.out.println("postMeasurementButton");

			WebElement closeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//android.widget.Button[@resource-id=\"close_button\"]")));
			closeMessage.click();
			System.out.println("successMessage");
			System.out.println("Your catch is saved to profile");

			WebElement feedButton1 = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
			feedButton1.click();
			System.out.println("feedButton");
			WebElement profileButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Profile\"]")));
			                                              
			profileButton.click();
			
			
			
//			WebElement profileButton = wait.until(ExpectedConditions
//					.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")));
//			profileButton.click();
			
			
			WebElement settingButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.view.View[@resource-id=\"settings_button\"]")));		                                             
			settingButton.click();
			SwipeUtils.swipeDown(driver);
			WebElement logoutInterfaceButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Logout\"]")));		                                             
			logoutInterfaceButton.click();
			WebElement logoutButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")));		                                             
			logoutButton.click();
			
			
			
	}
}
