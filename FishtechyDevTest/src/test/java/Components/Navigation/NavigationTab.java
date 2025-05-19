package Components.Navigation;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationTab {
	public static void navigationTab(AndroidDriver driver, WebDriverWait wait) throws InterruptedException {

		WebElement feedButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
		feedButton.click();
		System.out.println("feedButton");
		Thread.sleep(3000);
		WebElement mapbutton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Map\"]")));
		mapbutton.click();
		System.out.println("mapbutton");
		Thread.sleep(3000);
		WebElement homeMeasureButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.ImageView[@resource-id='nav_bar_center_button']")));
		homeMeasureButton.click();
		System.out.println("homeMeasureButton");
		Thread.sleep(3000);
		WebElement chatButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Chat\"]")));
		chatButton.click();
		System.out.println("chatButton");
		Thread.sleep(3000);
		WebElement profileButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")));
		profileButton.click();
		System.out.println("profileButton");
		Thread.sleep(3000);
	}
}
