package Components.NewFish;
import io.appium.java_client.android.AndroidDriver;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import APIUtility.TokenStorage;


public class NewFish {
	
	private static final OkHttpClient client = new OkHttpClient();
	private static final String BASE_URL = "https://api-stage.flytechy.site";
	public static void newFish(AndroidDriver driver, WebDriverWait wait) throws InterruptedException,Exception {

//env:Beta
//email:demotestaman123@gmail.com
//pwd:DemoTest
		
		
		
		if (!TokenStorage.isAccessTokenValid()) {
			boolean refreshed = TokenStorage.refreshAccessToken();
			if (!refreshed) {
				throw new IllegalStateException(
						"Access and Refresh tokens are invalid or expired. Please log in again.");
			}
		}

		String accessToken = TokenStorage.getAccessToken();

		Request request = new Request.Builder().url(BASE_URL + "/fishes")
				.addHeader("Authorization", "Bearer " + accessToken).build();

		String id = null;
		String fishname = null;
		
		try (Response response = client.newCall(request).execute()) {
			// System.out.println("GET /Users\nStatus: " + response.code());
			String json = response.body().string();
			System.out.println(" JSON: " + json);

			JSONObject root = new JSONObject(json);
			JSONArray results = root.getJSONArray("results"); 
			 JSONObject firstResult = results.getJSONObject(0); // Get the first object in the array
		         id = firstResult.getString("id");
		         System.out.println(" fish id: " + id);
			fishname = firstResult.getString("name");
			System.out.println(" UserFullname: " + fishname);
		
			if (!response.isSuccessful()) {
				throw new RuntimeException("Failed to get catches: " + response.code() + "\n" + json);
			}
		}
		if (fishname != null) {
			System.out.println("Avatar URL outside try: " + fishname);
			// Perform other operations with the avatar URL
		} else {
			System.out.println("fishname  was not retrieved.");
		}

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
		
		WebElement addSpecies = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Add Species\"]")));
		addSpecies.click();
		System.out.println("addSpecies");
		
		WebElement searchFish = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.EditText")));
		searchFish.click();
		Thread.sleep(2000);
		searchFish.sendKeys("haha888");
		System.out.println("searchFish");
		WebElement addNewFish = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Add New Fish\"]")));
		addNewFish.click();
		System.out.println("addNewFish");
		
		WebElement fishName = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"fish_name_textfield\"]/android.widget.EditText")));
		fishName.click();
		Thread.sleep(2000);
		fishName.sendKeys("haha888");
		WebElement submit = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")));
		submit.click();
		System.out.println("submit");
		WebElement close = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Close\"]")));
		close.click();
		System.out.println("close");
		//android.view.View[@content-desc="Bug"]
		WebElement selectFish = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc="+fishname+"]")));
		selectFish.click();
		System.out.println("selectFish");
		// Click Measure Fish
		WebElement measureFishButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Measure Fish']")));
		measureFishButton.click();
		System.out.println("measureFishButton");
		WebElement nextButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Next']")));
		nextButton.click();
		System.out.println("nextButton");
		
		
		Thread.sleep(2000);
		WebElement postMeasurement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Post Measurement\"]")));
		postMeasurement.click();

		Thread.sleep(5000);

		
	}
}


