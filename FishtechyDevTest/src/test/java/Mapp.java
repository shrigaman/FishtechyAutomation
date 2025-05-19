
import io.appium.java_client.android.AndroidDriver;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mapp {
	public static void mapped(AndroidDriver driver, WebDriverWait wait)
			throws InterruptedException {
		
		WebElement feedButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
		feedButton.click();
		System.out.println("feedButton");
		Thread.sleep(3000);
		WebElement mapbutton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Map\"]")));
		mapbutton.click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		System.out.println("mapbutton");
		WebElement allowButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")));
		allowButton.click();
		Thread.sleep(5000);
		WebElement firstCatchButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//android.view.View[@content-desc=\"Map Marker\"])[1]")));
		firstCatchButton.click();
		Thread.sleep(5000);
		firstCatchButton.click();
		Thread.sleep(5000);
		firstCatchButton.click();
		Thread.sleep(5000);
		ZoomIn.zoomIn(driver, 500, 1000, 300);
		System.out.println("zoom 1");
		Thread.sleep(5000);
		

        // Zoom In
        Map<String, Object> pinchOpenArgs = new HashMap<>();
        pinchOpenArgs.put("left", 200);
        pinchOpenArgs.put("top", 800);
        pinchOpenArgs.put("width", 1000);
        pinchOpenArgs.put("height", 1000);
        pinchOpenArgs.put("percent", 0.5);

        ((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", pinchOpenArgs);

        // Wait (adjust as needed)
        Thread.sleep(500);

        // Zoom Out
        Map<String, Object> pinchCloseArgs = new HashMap<>();
        pinchCloseArgs.put("left", 200);
        pinchCloseArgs.put("top", 800);
        pinchCloseArgs.put("width", 1000);
        pinchCloseArgs.put("height", 1000);
        pinchCloseArgs.put("percent", 1.0);

        ((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", pinchCloseArgs);

        Thread.sleep(5000); // add a final wait to see the result.

		SwipeUtils.swipeDown(driver);
		Thread.sleep(5000);
		System.out.println("swipped 1");
	}
}
