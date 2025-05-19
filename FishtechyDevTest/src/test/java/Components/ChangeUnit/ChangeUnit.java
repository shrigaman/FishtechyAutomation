package Components.ChangeUnit;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangeUnit {

	public static void changeUnit(AndroidDriver driver, WebDriverWait wait) throws Exception {
		 WebElement profileButton = wait.until(ExpectedConditions
	                .visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")));
	        profileButton.click();

	        WebElement settingButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//android.widget.Button[@resource-id=\"settings_button_button\"]")));
	        settingButton.click();
	        
	      //android.view.View[@content-desc="Change Units"]
	        WebElement ChangeUnitsButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath(" //android.view.View[@content-desc=\"Change Units\"]")));
	        ChangeUnitsButton.click();
//	        WebElement metricUnit = wait.until(ExpectedConditions.visibilityOfElementLocated(
//	                By.xpath("//android.view.View[@content-desc="Metric Unit System Centimeter, Kilogram, Celsius"]")));
//	        metricUnit.click();
//	        
	        WebElement imperialUnit = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//android.view.View[@content-desc=\"Imperial Unit System Inch, Pound, Fahrenheit\"]")));
	        imperialUnit.click();
	        
			WebElement saveButton = wait.until(ExpectedConditions
			.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")));
	saveButton.click();
	System.out.println("save button is clicked");
	}
}




////android.view.View[@content-desc="Change Units"]
////android.view.View[@content-desc="Imperial Unit System Inch, Pound, Fahrenheit"]
////android.view.View[@content-desc="Metric Unit System Centimeter, Kilogram, Celsius"]
////android.widget.Button[@content-desc="Save"]
//
//
//package Components.ChangeUnit;
//
//import io.appium.java_client.android.AndroidDriver;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;
//import org.json.JSONObject;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import APIUtility.TokenStorage;
////import Components.Users;
//
//public class ChangeUnit {
//
//	private static final OkHttpClient client = new OkHttpClient();
//	private static final String BASE_URL = "https://api-stage.flytechy.site";
//
//	public static void changeUnit(AndroidDriver driver, WebDriverWait wait) throws Exception {
//		
////		boolean isInInches = true; // or false based on your condition
////		String length = isInInches ? "INCH" : "CENTIMETER";
////		System.out.println(length); 
////		
//		if (!TokenStorage.isAccessTokenValid()) {
//			boolean refreshed = TokenStorage.refreshAccessToken();
//			if (!refreshed) {
//				throw new IllegalStateException(
//						"Access and Refresh tokens are invalid or expired. Please log in again.");
//			}
//		}
//
//		String accessToken = TokenStorage.getAccessToken();
//
//		Request request = new Request.Builder().url(BASE_URL + "/users/me")
//				.addHeader("Authorization", "Bearer " + accessToken).build();
//
//	
//		
//		try (Response response = client.newCall(request).execute()) {
//		    String json = response.body().string();
//
//		    if (!response.isSuccessful()) {
//		        throw new RuntimeException("Failed to get user detail: " + response.code() + "\n" + json);
//		    }
//
//		    JSONObject root = new JSONObject(json);
//		    JSONObject preferredUnitsObj = root.getJSONObject("preferredUnits");
//
//		    String weight = preferredUnitsObj.getString("weight");
//		    String length = preferredUnitsObj.getString("length");
//		    String temperature = preferredUnitsObj.getString("temperature");
//
//		    System.out.println("User's preferred weight: " + weight);
//		    System.out.println("User's preferred length: " + length);
//		    System.out.println("User's preferred temperature: " + temperature);
//		    WebElement profileButton = wait.until(ExpectedConditions
//	                .visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")));
//	        profileButton.click();
//
//	        WebElement settingButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
//	                By.xpath("//android.widget.Button[@resource-id=\"settings_button_button\"]")));
//	        settingButton.click();
//	        
//	      //android.view.View[@content-desc="Change Units"]
//	        WebElement ChangeUnitsButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
//	                By.xpath(" //android.view.View[@content-desc=\"Change Units\"]")));
//	        ChangeUnitsButton.click();
//	      
//		    // 👇 Based on length value, choose the appropriate unit system
//		    if ("INCH".equalsIgnoreCase(length)) {
//		    	System.out.println("length is in inch");
//		        // Click on Metric (if current is INCH, switch to CENTIMETER)
//		        WebElement metricUnit = wait.until(ExpectedConditions.visibilityOfElementLocated(
//		                By.xpath("//android.view.View[@content-desc=\"Metric Unit System\r\n"
//		                		+ "Centimeter, Kilogram, Celsius\"]")));
//		        metricUnit.click();
//		    } else {
//		    	System.out.println("length is in cm");
//		        // Click on Imperial
//		        WebElement imperialUnit = wait.until(ExpectedConditions.visibilityOfElementLocated(
//		                By.xpath("//android.view.View[@content-desc=\"Imperial Unit System\r\n"
//		                		+ "Inch, Pound, Fahrenheit\"]")));
//		        imperialUnit.click();
//		    }
//		}
//
//		WebElement saveButton = wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")));
//		saveButton.click();
//		System.out.println("save button is clicked");
//Thread.sleep(3000);
//	}
//}
