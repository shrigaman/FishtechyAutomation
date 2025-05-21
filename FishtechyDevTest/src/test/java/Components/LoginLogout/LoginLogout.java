package Components.LoginLogout;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Components.Login.LoginPage;
import Components.SwipeUtils.SwipeUtils;

public class LoginLogout {

	public static void loginLogout(AndroidDriver driver, WebDriverWait wait) throws InterruptedException, Exception {

		LoginPage.login(driver, wait, "amanmongodb@gmail.com", "Amanmongodb");
		// SwipeUtils.swipeDown(driver);
		Thread.sleep(5000);
		WebElement profileButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")));
		profileButton.click();
		System.out.println("profile button clicked");
		WebElement settingButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.ImageView[@resource-id=\"settings_button_button\"]")));
		settingButton.click();
		System.out.println("settingButton");
		WebElement accountSettingButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Account Settings\"]")));
		accountSettingButton.click();
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
		Thread.sleep(5000);

	}
}
