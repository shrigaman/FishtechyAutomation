package Components.LikeCommentSave;
import io.appium.java_client.android.AndroidDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import APIUtility.CatchfeedAPI;
import Components.Users;

public class LikeCommentSave {
	public static void like_comment_save(AndroidDriver driver, WebDriverWait wait)
			throws InterruptedException,Exception {
		
		List<Users> users = CatchfeedAPI.getAllCatches();

		if (!users.isEmpty()) {
		    Users user = users.get(0);  // get the first user
		    System.out.println(user.getId() + " (" + user.getUsername() + ")");

		    String userId = user.getId();  // store the ID

		    
		            // Build dynamic XPath using userId
		            String likedIconXPath = "//android.widget.ImageView[@resource-id=\"like_" + userId + "\"]";

		            WebElement likedIcon = wait.until(ExpectedConditions.presenceOfElementLocated(
		                By.xpath(likedIconXPath)
		            ));
		            likedIcon.click(); // Unlike
		            System.out.println("clicked");
		            
		            Thread.sleep(1500);
		            likedIcon.click();
		            System.out.println("unclick");
		        

		        Thread.sleep(1500);
		    }
		}

         
//         
//		WebElement GetAllCatchList = wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='']")));
//		GetAllCatchList.click();
//		Thread.sleep(2000);

	

	}

