import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Comment {
	public static void Commentsection(AndroidDriver driver, WebDriverWait wait)
			throws InterruptedException {
		WebElement feedButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Feed']")));
		feedButton.click();
		System.out.println("feed");
		WebElement commentButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@resource-id=\"comment_67f896d429b350b3c3bc0425\"]")));
		commentButton.click();
		System.out.println("comment button");
		WebElement writeComment = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.EditText")));
		writeComment.click();
		writeComment.sendKeys("Nice catch");
		System.out.println("comment has been typed");
		WebElement postComment = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Post\"]")));
		postComment.click();
		System.out.println("comment post button is clicked");
		Thread.sleep(5000);
		WebElement replyComment = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Reply\"]")));
		replyComment.click();
		System.out.println("reply to the comment post button");
		WebElement writereplyComment = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.EditText")));
		writereplyComment.click();
		writereplyComment.sendKeys("Nice catch reply");
		System.out.println("comment has been typed");
		Thread.sleep(5000);
		WebElement replyPostComment = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Post\"]")));
		replyPostComment.click();
		System.out.println(" reply comment post button is clicked");
		
		Thread.sleep(5000);
		WebElement closeCommentSection = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"clear_button\"]")));
		closeCommentSection.click();
		Thread.sleep(5000);
	}
}
