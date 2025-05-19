package Components.FishMeasurement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Arrays;
import java.util.List;

public class FishMeasurement {
	public static void processMeasurement(AndroidDriver driver, WebDriverWait wait) throws InterruptedException {
		

		// List of Image Paths
		String[] imageXPaths = {
				"//android.widget.ImageView[@content-desc=\"Image1, 2025-04-07 13:46:48, 0c91c268-71b5-4f48-8e73-b00e5044fb8e.jpeg\"]",
				"//android.widget.ImageView[@content-desc=\"Image4, 2025-03-29 14:27:09, neither ball nor fish detected_api_isSqaure_null.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image20, 2025-03-29 14:27:05, 29f5f83a-ffe9-432a-b67b-cd23e6c010b9.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image2, 2025-03-29 14:19:28, 6ac06f4c-6936-4e16-8abb-ca35f111b534.jpeg\"]",
				"//android.widget.ImageView[@content-desc=\"Image3, 2025-03-29 14:27:05, white p_ball.PNG\"]",	
				"//android.widget.ImageView[@content-desc=\"Image5, 2025-03-29 14:27:05, Dev_L_0_fish_cs_0.953_isSquare_null_pf_not_detected.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image5, 2025-03-29 14:27:08, img_20240315191228423377.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image6, 2025-03-29 14:27:08, img_20240317204948001706.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image7, 2025-03-29 14:27:06, Dev_L_14.88.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image8, 2025-03-29 14:27:05, Dev_L_0_ball_not_detected_Api_L_12.570_fish_cs_0.913__isSquare_false_pb_cs_0.775.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image9, 2025-03-29 14:27:09, img_20240323215511416025.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image10, 2025-03-29 14:27:05, Dev_L_14.08.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image11, 2025-03-29 14:27:06, Dev_L_18.95.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image12, 2025-03-29 14:27:08, IMG_6584.heic\"]",
				"//android.widget.ImageView[@content-desc=\"Image12, 2025-03-29 14:27:08, IMG_6584.heic\"]",
				"//android.widget.ImageView[@content-desc=\"Image14, 2025-03-29 14:27:05, Dev_L_10.53.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image15, 2025-03-29 14:27:06, IMG_1639.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image17, 2025-03-29 14:27:06, dev_vertical_image.jpg\"]",
				"//android.widget.ImageView[@content-desc=\"Image18, 2025-03-29 14:27:06, dev_L_18.25.jpg\"]"

		};
		for (int i = 0; i < imageXPaths.length; i++) {
			WebElement feedButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
			feedButton.click();
			System.out.println("feedButton" + "" + i);
			// Click Home Measure Button
			WebElement homeMeasureButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//android.widget.ImageView[@resource-id='nav_bar_center_button']")));
			homeMeasureButton.click();
			System.out.println("homeMeasureButton" + "" + i);

			// Click Upload Button
			WebElement measureButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Upload']")));
			measureButton.click();

			// Handle permissions only on the first run
			if (i == 0) {
				WebElement continueButton = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Continue']")));
				continueButton.click();

				WebElement allowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
						"//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")));
				allowButton.click();
			}
			WebElement recentButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Recent']")));
			recentButton.click();
			System.out.println("recentButton" + "" + i);

			WebElement pictureButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Aa, count: 20']")));
			pictureButton.click();
			System.out.println("pictureButton" + "" + i);
			WebElement clickImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(imageXPaths[i])));
			clickImage.click();
			System.out.println("clickImage" + "" + i);
			// Click Continue
			WebElement screenShotContinueButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Continue']")));
			screenShotContinueButton.click();
			System.out.println("screenShotContinueButton" + "" + i);
			// Click Crop
			WebElement tickButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Crop']")));
			tickButton.click();
			System.out.println("tickButton" + "" + i);
			// Click Measure Fish
			WebElement measureFishButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Measure Fish']")));
			measureFishButton.click();
			System.out.println("measureFishButton" + "" + i);

			try {
				// If neither button is found, check for "Try with Different Image"
				WebElement tryWithDifferentImageButton = wait.until(ExpectedConditions.presenceOfElementLocated(
						By.xpath("//android.widget.Button[@content-desc='Try with Different Image']")));

				if (tryWithDifferentImageButton.isDisplayed()) {
					tryWithDifferentImageButton.click();

					// android.view.View[@content-desc="Please make sure you upload an image with
					// fish and PROOF BALL clearly visible."]
					// android.widget.Button[@content-desc="Try with Different Image"]

					System.out.println("Invalid measurement detected, skipping to Feed...");
					WebElement feedButton1 = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
					feedButton1.click();
					System.out.println("Navigated to Feed" + "" + i);
					System.out.println("homeMeasureButton" + "" + i);
				}

			} catch (Exception e) {
				if (!imageXPaths[i].equals("//android.view.View[@content-desc='L 0\" | G 0\" | W 0 lbs']")
						&& !imageXPaths[i]
								.equals("//android.widget.Button[@content-desc='Try with Different Image']")) {
					WebElement nextButton = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Next']")));
					nextButton.click();
					System.out.println("nextButton" + "" + i);

					// Click Post Measurement
					WebElement postMeasurementButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
							By.xpath("//android.widget.Button[@content-desc='Post Measurement']")));
					postMeasurementButton.click();
					System.out.println("postMeasurementButton" + "" + i);
					// Close Success Message

//					WebElement closeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
//							By.xpath("//android.widget.Button[@resource-id=\"close_button\"]")));
//					closeMessage.click();

//					System.out.println("successMessage" + "" + i);
//					System.out.println("Your catch is saved to profile");
					WebElement feedButton1 = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
					feedButton1.click();
					System.out.println("feedButton" + "" + i);
				} else if (imageXPaths[i].equals("//android.view.View[@content-desc='L 0\" | G 0\" | W 0 lbs']")) {

					WebElement zeroValueButton = wait.until(ExpectedConditions.presenceOfElementLocated(
							By.xpath("//android.view.View[@content-desc='L 0\" | G 0\" | W 0 lbs']")));
					System.out.println("zeroValueButton" + "" + i);
					if (zeroValueButton.isDisplayed()) {
						zeroValueButton.click();
						System.out.println("Invalid measurement detected, skipping to Feed...");
						System.out.println("zeroValueButton" + "" + i);
						// Click Next
						WebElement nextButton = wait.until(ExpectedConditions
								.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Next']")));
						nextButton.click();
						System.out.println("nextButton" + "" + i);
						// Click Post Measurement
						WebElement postMeasurementButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
								By.xpath("//android.widget.Button[@content-desc='Post Measurement']")));
						postMeasurementButton.click();
						System.out.println("postMeasurementButton" + "" + i);
						// Close Success Message
//						WebElement closeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
//								By.xpath("//android.widget.Button[@resource-id=\"close_button\"]")));
//
//						closeMessage.click();
//						System.out.println("closeMessage" + "" + i);
						// Navigate to Feed

						WebElement feedButton1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
								By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
						feedButton1.click();

						System.out.println("Navigated to Feed" + "" + i);
						System.out.println("homeMeasureButton" + "" + i);

					}
				}
			}
		}
	}
}
