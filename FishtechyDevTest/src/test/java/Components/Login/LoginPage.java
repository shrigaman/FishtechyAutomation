package Components.Login;

import io.appium.java_client.android.AndroidDriver;
import okhttp3.*;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import APIUtility.APIClient;
import APIUtility.TokenStorage;

public class LoginPage {

    public static final OkHttpClient client = new OkHttpClient();

    public static void login(AndroidDriver driver, WebDriverWait wait, String email, String password)
            throws InterruptedException, Exception {

        // UI Interaction
        WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//android.widget.Button[@content-desc='Login']")));
        loginBtn.click();
        Thread.sleep(2000);

        WebElement continueWithEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//android.widget.ImageView[@content-desc='Continue with Email']")));
        continueWithEmail.click();

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("(//android.widget.EditText)[2]")));
        emailField.click();
        Thread.sleep(2000);
        emailField.sendKeys(email);

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("(//android.widget.EditText)[4]")));
        passwordField.click();
        Thread.sleep(2000);
        passwordField.sendKeys(password);

        // API Token Request
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        String json = String.format("{\"email\":\"%s\",\"password\":\"%s\"}", email, password);

        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
            .url(APIClient.BASE_URL + "/auth/login")
            .post(body)
            .build();

        try (Response response = client.newCall(request).execute()) {
            String responseBody = response.body().string();
            System.out.println("Login API Response: " + responseBody);

            if (!response.isSuccessful()) {
                throw new RuntimeException("Login failed: " + response.code());
            }

            JSONObject obj = new JSONObject(responseBody);
            TokenStorage.saveTokens(
                obj.getString("accessToken"),
                obj.getString("accessTokenExpiry"),
                obj.getString("refreshToken"),
                obj.getString("refreshTokenExpiry")
            );

          //  System.out.println("✅ Tokens saved to memory.");
        }

        // Final UI login button
        WebElement finalLoginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//android.widget.Button[@content-desc='Login']")));
        finalLoginBtn.click();
        Thread.sleep(2000);

        System.out.println("Login successful for user: " + email);
       // System.out.println("🔐 Access Token (after login): " + TokenStorage.getCurrentAccessToken());
        
        System.out.println("🔐 Login - Access Token: " + TokenStorage.getValidAccessToken());

    }
}
