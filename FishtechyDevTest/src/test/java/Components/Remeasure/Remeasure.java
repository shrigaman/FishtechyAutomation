package Components.Remeasure;

import io.appium.java_client.android.AndroidDriver;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.json.JSONArray;
import APIUtility.TokenStorage;

public class Remeasure {

	private static final OkHttpClient client = new OkHttpClient();
	private static final String BASE_URL = "https://api-stage.flytechy.site";

	public static void remeasure(AndroidDriver driver, WebDriverWait wait) throws Exception {

		if (!TokenStorage.isAccessTokenValid()) {
			boolean refreshed = TokenStorage.refreshAccessToken();
			if (!refreshed) {
				throw new IllegalStateException(
						"Access and Refresh tokens are invalid or expired. Please log in again.");
			}
		}

		String accessToken = TokenStorage.getAccessToken();

		Request request = new Request.Builder().url(BASE_URL + "/catches")
				.addHeader("Authorization", "Bearer " + accessToken).build();

	String id= null;
		
		try (Response response = client.newCall(request).execute()) {
			// System.out.println("GET /Users\nStatus: " + response.code());
			String json = response.body().string();

			JSONObject root = new JSONObject(json);
			 System.out.println("Root: " + json);
			JSONArray results = root.getJSONArray("results");

			if (results.length() > 0) {
			    JSONObject firstResult = results.getJSONObject(0);
			     id = firstResult.getString("id");
			    System.out.println("Extracted ID: " + id);
			    
			}
			
		
			if (!response.isSuccessful()) {
				throw new RuntimeException("Failed to get catches: " + response.code() + "\n" + json);
			}
		}
		
	
		WebElement profileButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")));
		profileButton.click();
		System.out.println("profile button clicked");
		//android.widget.Button[@resource-id="catch_menu_681aed480ab963d6ea09c9a1_button"]
		
		WebElement threeDotButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"catch_menu_"+id+"_button\"]")));
		threeDotButton.click();
		System.out.println("threeDot button clicked");
		//android.widget.ImageView[@content-desc="Remeasure Fish 		1 time*"]
//		WebElement remeasureFishButton = wait.until(ExpectedConditions
//	.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Remeasure Fish\r\n"
//			+ "1 time*\"]")));
//		System.out.println("remeasureFishButton"+remeasureFishButton);
		//remeasureFishButton.click();
		System.out.println("remeasureFish button clicked");
		WebElement proceedButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Proceed\"]")));
		proceedButton.click();
		System.out.println("proceed button clicked");
		WebElement nextButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Next\"]")));
		nextButton.click();
		System.out.println("next button clicked");
		
		WebElement saveMeasurementButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Save Measurement\"]")));
		saveMeasurementButton.click();
		System.out.println("saveMeasurement Button  clicked");
		
	}
}