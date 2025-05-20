import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.WebDriverWait;

import APIUtility.CatchfeedAPI;
import Components.Users;
import Components.ChangeUnit.ChangeUnit;
import Components.LikeCommentSave.LikeCommentSave;
import Components.Login.LoginPage;
import Components.Remeasure.Remeasure;
import Profile.ChangePassword.ChangePassword;
import Profile.EditProfile.EditProfile;
import io.appium.java_client.android.AndroidDriver;

public class MainComponent {
	public static void main(String[] args) throws MalformedURLException, InterruptedException,Exception {
		AndroidDriver driver = DriverSetup.initializeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		//Signup.signup(driver,wait,"trrrrry2000@gmail.com","test test","test test","9812306630","Test Test","Test Test");
		// Perform login
		//Techsupport ko lagi
		//
		
		//LoginPage.login(driver, wait, "amanmongodb@gmail.com", "Amanmongodb");
		//EditProfile.editProfile(driver, wait);
		//LoginPage.login(driver, wait, "amanrajbanshi999@gmail.com", "Aman987@#$");
        //ChangeUnit.changeUnit(driver, wait);
		
		
		
		
		//ChangePassword.changePassword(driver,wait,"Aman6635", "Hello6635");
		//LoginPage.login(driver, wait, "tsvshrsth@gmail.com", "Utsav123");
		
		
		//Onboarding.onboarding(driver, wait);
		LoginPage.login(driver, wait, "amanrajbanshi999@gmail.com", "Aman987@#$");
		//Remeasure.remeasure(driver, wait);
		//LikeCommentSave.like_comment_save(driver, wait);
			       
			        //	CatchfeedAPI.getAllCatches();
//			        	 try {
//			                 // Get list of users from CatchfeedAPI
//			                 List<Users> users = CatchfeedAPI.getAllCatches();
//
//			                 
//			                 if (!users.isEmpty()) {
//			                	    Users user = users.get(0);  // get the first user
//			                	    System.out.println(user.getId() + " (" + user.getUsername() + ")");
//			                	}
//			                 
//			                 
//			                 // Now you can loop through the list and use the data
////			                 for (Users user : users) {
////			                     System.out.println(user.getId() + " (" + user.getUsername() + ")");
////			                 }
//			             } catch (Exception e) {
//			                 e.printStackTrace();
//			             }
		        
		    
		//Catchfeed.CatchFeed(driver,wait);
		Thread.sleep(5000);
		
		// Perform Fish Measurement
		 //FishMeasurement.processMeasurement(driver, wait);

		 //UploadFiles.uploadFiles(driver, wait);

		// Perform techSupport
		//TechSupport.techSupport(driver, wait);

		// Perform ProofballRegistration
		// ProofballRegistration.proofballRegistration(driver, wait);

		// NavigationTab
		//NavigationTab.navigationTab(driver,wait);

		// Search Method
		// Search.searchMethod(driver,wait);

		// Tag Guide
		 TagGuide.tagGuide(driver, wait);

		// smartlog
		// SmartLog.smartLog(driver, wait);

		//Bump.bump(driver, wait);
//		Comment.Commentsection(driver,wait);
		
		//Mapp.mapped(driver, wait);
		
		driver.quit(); // Close driver after execution
	}
}
