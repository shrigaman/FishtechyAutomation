package Profile.EditProfile;

import io.appium.java_client.android.AndroidDriver;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import APIUtility.TokenStorage;
//import Components.Users;

public class EditProfile {

	private static final OkHttpClient client = new OkHttpClient();
	private static final String BASE_URL = "https://api-stage.flytechy.site";

	public static void editProfile(AndroidDriver driver, WebDriverWait wait) throws Exception {

		if (!TokenStorage.isAccessTokenValid()) {
			boolean refreshed = TokenStorage.refreshAccessToken();
			if (!refreshed) {
				throw new IllegalStateException(
						"Access and Refresh tokens are invalid or expired. Please log in again.");
			}
		}

		String accessToken = TokenStorage.getAccessToken();

		Request request = new Request.Builder().url(BASE_URL + "/users/me")
				.addHeader("Authorization", "Bearer " + accessToken).build();

		String fullname = null;
		String username = null;
		String avatar200 = null;
		try (Response response = client.newCall(request).execute()) {
			// System.out.println("GET /Users\nStatus: " + response.code());
			String json = response.body().string();

			JSONObject root = new JSONObject(json);
			String id = root.getString("id");
			System.out.println(" ID: " + id);
			fullname = root.getString("fullName");
			System.out.println(" UserFullname: " + fullname);
			username = root.getString("username");
			System.out.println(" Username: " + username);
			avatar200 = root.getString("avatar200");
			System.out.println("User avatar: " + avatar200);
			if (!response.isSuccessful()) {
				throw new RuntimeException("Failed to get catches: " + response.code() + "\n" + json);
			}
		}
		if (avatar200 != null) {
			System.out.println("Avatar URL outside try: " + avatar200);
			// Perform other operations with the avatar URL
		} else {
			System.out.println("Avatar URL was not retrieved.");
		}
		WebElement profileButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")));
		profileButton.click();
		System.out.println("profile button clicked");

		// latest //android.widget.ImageView[@resource-id="settings_button_button"]
		WebElement settingButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.ImageView[@resource-id=\"settings_button_button\"]")));
		settingButton.click();
		System.out.println("setting button clicked");
		// latest //android.view.View[@content-desc="Account Settings"]
		WebElement accountButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Account Settings\"]")));
		accountButton.click();
		System.out.println("account button clicked");
		// Edit Profile button
		// android.view.View[@content-desc="Edit Profile"]
		WebElement profileSettingButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Profile Settings\"]")));
		profileSettingButton.click();
		System.out.println("profileSettingButton  clicked");
		WebElement editButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Edit Profile\"]")));
		editButton.click();
		System.out.println("edit button  clicked");

		String profileImageResourceId = avatar200; // Assuming your variable is named 'yourVariableName'
		System.out.println("avatar:" + avatar200);
		System.out.println("profileImageResourceId:" + profileImageResourceId);

//		WebElement profileImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//		        "//android.widget.ImageView[@resource-id='" + profileImageResourceId + "']")));
//		profileImage.click();
		// image click

		// android.widget.ImageView[@resource-id="user_profile_https://file-stage.flytechy.site/public/user/8adb28bb-7dc7-4196-ae00-90ea4f118fd0_cover_200_200.jpeg"]
//		// android.widget.ImageView[@resource-id="user_profile_https://file-stage.flytechy.site/public/user/c43fa389-3bb4-440c-8e4d-5471286c087f_cover_200_200.jpeg"]
		WebElement profileImage = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.ImageView[@resource-id=\"user_profile_" + profileImageResourceId + "\"]")));
		profileImage.click();
		System.out.println("profile image is  clicked");
		// android.view.View[@content-desc="Edit Profile"].click();

		// choose photo
		// android.widget.ImageView[@content-desc="Choose Photo"]

		WebElement choosePhoto = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Choose Photo\"]")));
		choosePhoto.click();
		System.out.println("choosePhoto is  clicked");
		// continue
		// android.widget.Button[@content-desc="Continue"]

		WebElement continueButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")));
		continueButton.click();
		System.out.println("continueButton is  clicked");
		// allow
		// android.widget.Button[@resource-id="com.android.permissioncontroller:id/permission_allow_button"]

		WebElement allowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")));
		allowButton.click();
		System.out.println("allowButton is  clicked");
		// click image
		// (//android.widget.ImageView[@resource-id="com.google.android.providers.media.module:id/icon_thumbnail"])[2]

		WebElement clickImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[5]")));
		clickImage.click();
		System.out.println("clickImage is  clicked");
		// tick
		// android.widget.TextView[@content-desc="Crop"]

		WebElement tickButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc=\"Crop\"]")));
		tickButton.click();
		System.out.println("tickButton is  clicked");
		Thread.sleep(5000);

		String userfullName = fullname;
//Full name
		// android.widget.EditText[@text="aman rajbanshi"]
		WebElement fullName = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text=\"" + userfullName + "\"]")));
		fullName.click();
		System.out.println("fullName is  clicked");
		fullName.sendKeys("Haha mongodb");
		// Username
		// android.widget.EditText[@text="aman mongodb"]
		String user_username = username;
		WebElement userName = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text=\"" + user_username + "\"]")));
		userName.click();
		System.out.println("userName is  clicked");
		fullName.sendKeys("mongodb aman");

	}
}
