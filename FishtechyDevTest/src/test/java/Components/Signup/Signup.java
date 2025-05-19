package Components.Signup;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup {
	public static void signup(AndroidDriver driver, WebDriverWait wait, String email,String fullname,String username,String phoneNumber, String password,String confirmPassword)
			throws InterruptedException {
		// Click Login button on the first screen
		WebElement createAccount = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Create Account\"]")));
		createAccount.click();
		Thread.sleep(2000);

		// Click Continue with Email
		WebElement continueWithEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.ImageView[@content-desc=\"Continue with Email\"]")));
		continueWithEmail.click();

		// Enter Email
		WebElement emailInputField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.EditText[@resource-id=\"email_textfield\"]/android.widget.EditText")));
		emailInputField.click();
		Thread.sleep(2000);
		emailInputField.sendKeys(email);
		WebElement fullnameInputField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"full_name_textfield\"]")));
		fullnameInputField.click();
		Thread.sleep(2000);
		fullnameInputField.sendKeys(fullname);
		WebElement usernameInputField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"username_textfield\"]")));
		usernameInputField.click();
		Thread.sleep(2000);
		usernameInputField.sendKeys(username);
		WebElement phoneNumberInputField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"phone_number_textfield\"]")));
		phoneNumberInputField.click();
		Thread.sleep(2000);
		phoneNumberInputField.sendKeys(phoneNumber);
		// Enter Password
		WebElement passwordInputField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"password_textfield\"]")));
		passwordInputField.click();
		Thread.sleep(2000);
		passwordInputField.sendKeys(password);
		WebElement confirmpasswordInputField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"confirm_password_textfield\"]")));
		confirmpasswordInputField.click();
		Thread.sleep(2000);
		confirmpasswordInputField.sendKeys(confirmPassword);
		// Click Login Button
		WebElement signupButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Sign Up\"]")));
		signupButton.click();
		Thread.sleep(2000);

		System.out.println("Register successful for: " + email);
	}
}
