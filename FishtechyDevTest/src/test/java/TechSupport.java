import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TechSupport {
	public static void techSupport(AndroidDriver driver, WebDriverWait wait) throws InterruptedException {

		// Navigate to "TechSupport" section
		//latest
		                                               //android.widget.ImageView[@content-desc="Profile"]
		WebElement profileButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")));
//		WebElement profileButton = wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Profile\"]")));                                          
		profileButton.click();
		System.out.println("profile button clicked");

		
		//latest     //android.widget.ImageView[@resource-id="settings_button_button"]
		WebElement settingButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@resource-id=\"settings_button_button\"]")));
		settingButton.click();

		
		// latest    //android.view.View[@content-desc="Account Settings"]
		WebElement accountButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Account Settings\"]")));
		accountButton.click();

		String[] problemTypes = {
				//"//android.widget.Button[@content-desc=\"Proofball Registration\"]",
				"//android.widget.Button[@content-desc=\"Login\"]", "//android.widget.Button[@content-desc=\"Signup\"]",
				"//android.widget.Button[@content-desc=\"Change Password\"]",
				"//android.widget.Button[@content-desc=\"UI/UX\"]",
				"//android.widget.Button[@content-desc=\"Fish Detection Measurement\"]",
				"//android.widget.Button[@content-desc=\"Fish List Not Sufficient\"]",
				"//android.widget.Button[@content-desc=\"Unlabeled Bugs\"]",
				"//android.widget.Button[@content-desc=\"Feature Request\"]"
//            
		};

		// Loop through each problem type
		for (int i = 0; i < problemTypes.length; i++) {
			WebElement techSupportButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
					// latest //android.widget.ImageView[@content-desc="Tech Support"]
					By.xpath("//android.widget.ImageView[@content-desc=\"Tech Support\"]")));
			techSupportButton.click();
			
			 
			WebElement reportProblemButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//android.widget.Button[@content-desc=\"Report a Problem\"]")));
			reportProblemButton.click();
			System.out.println("Clicked 'Report a Problem'");

			
			
			WebElement problemTypeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//android.widget.Button[@content-desc=\"Select a problem type\"]")));
			problemTypeButton.click();
			System.out.println("Clicked 'Select a problem type'");

			// Scroll down if needed
			SwipeUtils.swipeDown(driver);

			WebElement problemTypeSelection = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(problemTypes[i])));
			problemTypeSelection.click();
			System.out.println("Selected problem type: " + problemTypes[i]);
			if (problemTypes[i] == "//android.widget.Button[@content-desc=\"Proofball Registration\"]") {
				WebElement uploadBallImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
						"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]")));
				uploadBallImage.click();

				WebElement continueButton = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")));
				continueButton.click();

				WebElement allowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
						"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")));
				allowButton.click();

				WebElement imageClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
						"(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[4]")));
				imageClick.click();

				WebElement submitButton = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")));
				submitButton.click();
				System.out.println("submitButton");
			}

			WebElement descriptionField = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//android.widget.EditText[@resource-id=\"desc_textfield\"]/android.widget.EditText")));
			descriptionField.click();
			descriptionField.sendKeys("test");
			System.out.println("Entered description");

			// Scroll down before submission
			SwipeUtils.swipeDown(driver);

			WebElement submitButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")));
			submitButton.click();
			System.out.println("Clicked 'Submit'");

			// Wait after submitting to avoid issues
			Thread.sleep(2000);

			// Navigate back to report another problem
			driver.navigate().back();
			System.out.println("Navigated back");

			Thread.sleep(1000); // Small delay before clicking the next problem type
		}
	}
}
