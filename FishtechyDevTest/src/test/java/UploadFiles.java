import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFiles {
	public static void uploadFiles(AndroidDriver driver, WebDriverWait wait) throws InterruptedException {

		// List of Image Paths
		String[] imageXPaths = {
				"//android.widget.ImageView[@content-desc=\"Image1, 2025-04-07 13:46:48, 0c91c268-71b5-4f48-8e73-b00e5044fb8e.jpeg\"]",
				"//android.widget.ImageView[@content-desc=\"Image2, 2025-03-29 14:19:28, 6ac06f4c-6936-4e16-8abb-ca35f111b534.jpeg\"]"
				// "//android.widget.ImageView[@content-desc=\"Image5, 2025-03-29 14:27:08,
				// img_20240315191228423377.jpg\"]",
		};

		for (int i = 0; i < 10; i++) {
			WebElement feedButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
			feedButton.click();
			System.out.println("feedButton" + i);

			WebElement homeMeasureButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//android.widget.ImageView[@resource-id='nav_bar_center_button']")));
			homeMeasureButton.click();
			System.out.println("homeMeasureButton" + i);

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
			System.out.println("recentButton" + i);

			WebElement pictureButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Aa, count: 20']")));
			pictureButton.click();
			System.out.println("pictureButton" + i);

			// 🔄 Use modulo to avoid out-of-bounds
			String selectedImageXPath = imageXPaths[i % imageXPaths.length];

			WebElement clickImage = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectedImageXPath)));
			clickImage.click();
			System.out.println("clickImage" + i);

			WebElement screenShotContinueButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Continue']")));
			screenShotContinueButton.click();
			System.out.println("screenShotContinueButton" + i);

			WebElement tickButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Crop']")));
			tickButton.click();
			System.out.println("tickButton" + i);

			WebElement measureFishButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Measure Fish']")));
			measureFishButton.click();
			System.out.println("measureFishButton" + i);

			if (!selectedImageXPath.equals("//android.view.View[@content-desc='L 0\" | G 0\" | W 0 lbs']")
					&& !selectedImageXPath
							.equals("//android.widget.Button[@content-desc='Try with Different Image']")) {

				WebElement nextButton = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Next']")));
				nextButton.click();
				System.out.println("nextButton" + i);

				WebElement postMeasurementButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//android.widget.Button[@content-desc='Post Measurement']")));
				postMeasurementButton.click();
				System.out.println("postMeasurementButton" + i);

				WebElement closeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//android.widget.Button[@resource-id=\"close_button\"]")));
				closeMessage.click();
				System.out.println("successMessage" + i);
				System.out.println("Your catch is saved to profile");

				WebElement feedButton1 = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
				feedButton1.click();
				System.out.println("feedButton" + i);
			}
		}
	}
}
