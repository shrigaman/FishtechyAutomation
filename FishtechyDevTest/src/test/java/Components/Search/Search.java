package Components.Search;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
	public static void searchMethod(AndroidDriver driver, WebDriverWait wait) throws InterruptedException {

		WebElement feedButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
		feedButton.click();
		System.out.println("feedButton");
		WebElement searchButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"search_button\"]")));
		searchButton.click();
		System.out.println("searchButton");
		Thread.sleep(5000); //

		WebElement inputfield = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText")));
		inputfield.click();
		inputfield.sendKeys("aman");
		System.out.println("inputfield");
		Thread.sleep(5000); //

		WebElement FollowButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//android.widget.Button[@content-desc=\"Follow\"])[1]")));
		FollowButton.click();
		System.out.println("FollowButton");
		Thread.sleep(5000); //

		WebElement FollowingButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Following\"]")));
		FollowingButton.click();
		System.out.println("FollowingButton");
		Thread.sleep(8000); //

		WebElement backButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Back\"]")));
		backButton.click();
		System.out.println("backButton");
		Thread.sleep(5000); //

//            //android.widget.Button[@resource-id="search_button"]
//          //android.widget.EditText
//          (//android.widget.Button[@content-desc="Follow"])[1]
//          //android.widget.Button[@content-desc="Following"]
//          //android.widget.Button[@content-desc="Back"]

	}
}
