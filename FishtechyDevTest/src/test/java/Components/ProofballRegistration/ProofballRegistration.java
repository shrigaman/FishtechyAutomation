package Components.ProofballRegistration;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProofballRegistration {
	public static void proofballRegistration(AndroidDriver driver, WebDriverWait wait) throws InterruptedException {

		WebElement profileButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")));
		profileButton.click();
		System.out.println("profileButton");
		WebElement tab2Button = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Tab 2 of 3\"]")));
		tab2Button.click();
		System.out.println("tab2Button");
		Thread.sleep(3000);
		WebElement addProofball = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Add PROOF BALL\"]")));
		addProofball.click();
		System.out.println("addProofball");
		Thread.sleep(5000);
		WebElement clickOnImageArea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]")));
		clickOnImageArea.click();
		System.out.println("clickOnImageArea");
		Thread.sleep(5000);
		WebElement choosePhoto = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Choose Photo\"]")));
		choosePhoto.click();
		System.out.println("choosePhoto");
		WebElement continueButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")));
		continueButton.click();
		System.out.println("continueButton");
		WebElement allowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")));
		allowButton.click();
		System.out.println("allowButton");

		WebElement selectImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[3]")));
		selectImage.click();
		System.out.println("selectImage");
		Thread.sleep(5000);
		WebElement submitButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")));
		submitButton.click();
		System.out.println("submitButton");
		WebElement backToProfileButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Back to Profile\"]")));
		backToProfileButton.click();
		System.out.println("backToProfileButton");
		Thread.sleep(5000);

	}
}
