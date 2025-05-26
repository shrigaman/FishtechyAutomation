package Components.LikeCommentSave;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import APIUtility.CatchfeedAPI;
import APIUtility.TokenStorage;
import Components.Users;

public class LikeCommentSave {
	
	 private static final OkHttpClient client = new OkHttpClient();
	    private static final String BASE_URL = "https://api-stage.flytechy.site";
	public static void like_comment_save(AndroidDriver driver, WebDriverWait wait)
			throws InterruptedException,Exception {
		
		
		
	       if (!TokenStorage.isAccessTokenValid()) {
	            boolean refreshed = TokenStorage.refreshAccessToken();
	            if (!refreshed) {
	                throw new IllegalStateException("Access and Refresh tokens are invalid or expired. Please log in again.");
	            }
	        }

	        String accessToken = TokenStorage.getAccessToken();

	        String extractedId = null; // Initialize to null or an empty string ""
	        Request request = new Request.Builder()
	            .url(BASE_URL + "/feeds/explore?page=1&limit=1000")
	            .addHeader("Authorization", "Bearer " + accessToken)
	            .build();

	        try (Response response = client.newCall(request).execute()) {
	          //  System.out.println("GET /Catches\nStatus: " + response.code());

	            String json = response.body().string();
	           // System.out.println("GET All Catches\n: " + json);

	            // --- Start of org.json parsing ---
	            JSONObject root = new JSONObject(json);
	            JSONArray results = root.optJSONArray("results");


	            try {           

	                if (results != null && results.length() > 0) {
	                    JSONObject firstResult = results.optJSONObject(0);

	                    if (firstResult != null) {
	                        // Assign the extracted value to the 'extractedId' variable
	                        extractedId = firstResult.optString("id", null); 
	                        if (extractedId != null && !extractedId.isEmpty()) {
	                            System.out.println("Inside block - Extracted ID: " + extractedId);
	                        } else {
	                            System.out.println("Inside block - ID field not found or is empty in the first result object.");
	                        }
	                    } else {
	                        System.out.println("Inside block - First object in 'results' array not found or is not an object.");
	                    }
	                } else {
	                    System.out.println("Inside block - 'results' array not found or is empty.");
	                }

	            } catch (Exception e) {
	                System.err.println("Error parsing JSON: " + e.getMessage());
	            }

	            // Now, 'extractedId' can be accessed outside of the if blocks
	            if (extractedId != null && !extractedId.isEmpty()) {
	                System.out.println("\nOutside block - Final Extracted ID: " + extractedId);
	                // You can use extractedId here for further processing
	            } else {
	                System.out.println("\nOutside block - No ID was extracted or it was empty.");
	                // Handle the case where the ID was not found or was empty
	            }
		}
	        System.out.println("\nOutside try catch block - Final Extracted ID: " + extractedId); 
  
	            Request like_request = new Request.Builder()
	                    .url(BASE_URL + "/feeds/interactions")
	                    .addHeader("Authorization", "Bearer " + accessToken)
	    	            .build();
	                   
	            String matchedLikeId = null;
	            try (Response response = client.newCall(like_request).execute()) {
	              //  System.out.println("GET /Likes\nStatus: " + response.code());

	                String json = response.body().string();
	               // System.out.println("GET All Likes Response Body:\n" + json);

	                // --- Corrected org.json parsing for 'likes' data ---
	                JSONObject root = new JSONObject(json);

	                // Directly access the "likes" array from the root object
	                JSONArray likesArray = root.getJSONArray("likes"); // Use getJSONArray as you expect it to exist

	                System.out.println("\n--- Extracted Likes Data ---");
	                if (likesArray != null && likesArray.length() > 0) {
	                    System.out.println("Total likes found: " + likesArray.length());
	                    for (int i = 0; i < likesArray.length(); i++) {
	                        String likeId = likesArray.getString(i);
	                        System.out.println("Like ID " + (i + 1) + ": " + likeId);
	                        // --- The if-else condition for equal and unequal cases ---
	                        if (likeId.equals(extractedId)) {
	                            System.out.println("  -> CASE: MATCH FOUND! Like ID: " + likeId + " matches extracted ID: " + extractedId);
	                            matchedLikeId = likeId; // Assign the matched ID
	                            // If you only care about the first match, you can break here:
	                            // break;
	                        } 
	                        else if(likeId != extractedId) {
	                        	WebElement likeCatch = wait.until(ExpectedConditions
	                    				.visibilityOfElementLocated(AppiumBy.androidUIAutomator(
	                    					    "new UiSelector().resourceId(\"like_"+matchedLikeId+"\")"
	                    						)));
	                    	    		likeCatch.click();
	                    	    		System.out.println("matchedLikeId->"+matchedLikeId);
	                    	    		System.out.println("liked the catch");
	                    		Thread.sleep(5000);
	                        }else {
	                            System.out.println("  -> CASE: NO MATCH. Like ID: " + likeId + " does NOT match extracted ID: " + extractedId);
	                            // Add any specific logic here for non-matching IDs
	                        }
	                        System.out.println("---------------------------------");
	   
	                    }
	                } else {
	                    System.out.println("No likes found or array is empty.");
	                }
	            }catch (Exception e) {
	                System.err.println("JSON parsing error: " + e.getMessage());
	                e.printStackTrace();
	            }
	        
	            System.out.println("matchedLikeId->"+matchedLikeId);  
	
	}
	}

