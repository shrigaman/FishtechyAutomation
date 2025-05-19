package Profile.ChangePassword;

import io.appium.java_client.android.AndroidDriver;
import okhttp3.*;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import APIUtility.APIClient;
import APIUtility.TokenStorage;

public class ChangePassword {

    public static void changePassword(AndroidDriver driver, WebDriverWait wait, String currentPass, String newPass) throws Exception {
        WebElement profileButton = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")));
        profileButton.click();

        WebElement settingButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.Button[@resource-id=\"settings_button_button\"]")));
        settingButton.click();

        WebElement profileSettingButton = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Profile Settings\"]")));
        profileSettingButton.click();

        WebElement changePassword = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Change Password\"]")));
        changePassword.click();

        WebElement currentPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//android.widget.EditText[@resource-id=\"toggle_visibility\"])[1]")));
        currentPassword.click();
        Thread.sleep(2000);
        currentPassword.sendKeys(currentPass);

        WebElement newPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//android.widget.EditText[@resource-id=\"toggle_visibility\"])[2]")));
        newPassword.click();
        Thread.sleep(2000);
        newPassword.sendKeys(newPass);

        WebElement confirmPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//android.widget.EditText[@resource-id=\"toggle_visibility\"])[3]")));
        confirmPassword.click();
        Thread.sleep(2000);
        confirmPassword.sendKeys(newPass);

        WebElement changePasswordBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.Button[@content-desc=\"Change Password\"]")));
        changePasswordBtn.click();

        // 🔐 Validate Token
        String accessToken = TokenStorage.getValidAccessToken();
        System.out.println("🔍 Access Token (on Change Password page): " + accessToken);

        // 🔧 PATCH request payload
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        String payload = "{"
                + "\"currentPassword\":\"" + currentPass + "\","
                + "\"newPassword\":\"" + newPass + "\""
                + "}";

        RequestBody body = RequestBody.create(payload, JSON);
        Request patchRequest = new Request.Builder()
                .url(APIClient.BASE_URL + "/users/change-password")
                .patch(body)
                .addHeader("Authorization", "Bearer " + accessToken)
                .build();

        OkHttpClient client = new OkHttpClient();
        try (Response response = client.newCall(patchRequest).execute()) {
            String responseString = response.body().string();

            if (response.isSuccessful()) {
                JSONObject responseObject = new JSONObject(responseString);
                String message = responseObject.optString("message");

                if ("Success".equalsIgnoreCase(message)) {
                    System.out.println("✅ Password changed successfully.");
                } else {
                    System.out.println("⚠️ Unexpected response: " + responseString);
                }

            } else {
                System.out.println("❌ Failed to change password. Response code: " + response.code());
                System.out.println("Response body: " + responseString);
            }
        }

    }
}
