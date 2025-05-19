import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bump {
	public static void bump(AndroidDriver driver, WebDriverWait wait)
			throws InterruptedException {
		for (int i = 0; i < 10; i++) {
		    try {
		    	//android.widget.TextView[@index='4']
		    	
		        // Try to find the "unlike" icon (i.e., already liked)
		        WebElement likedIcon = wait.until(ExpectedConditions.presenceOfElementLocated(
		           // By.xpath("//android.widget.ImageView[@resource-id=\"like_67f896d429b350b3c3bc0425\"]")
			            By.xpath("//android.widget.TextView[@index='4']")

		        ));
		        likedIcon.click(); // Unlike
		        System.out.println("Toggle " + (i + 1) + ": Unliked");

		    } catch (Exception e) {
		        try {
		            // If not liked, find the like icon with content-desc="0"
		            WebElement unlikedIcon = wait.until(ExpectedConditions.presenceOfElementLocated(
		                By.xpath("//android.widget.ImageView[@content-desc='0']")
		            ));
		            unlikedIcon.click(); // Like
		            System.out.println("Toggle " + (i + 1) + ": Liked");

		        } catch (Exception ex) {
		            System.out.println("Toggle " + (i + 1) + ": Like/Unlike icon not found.");
		        }
		    }

		    // Wait a bit between toggles
		    Thread.sleep(1500);
		}


		
		
				
	    
		//android.widget.ImageView[@resource-id="like_67f896d429b350b3c3bc0425"]
		//android.widget.ImageView[@resource-id="like_67f896d429b350b3c3bc0425"]
	}
}
