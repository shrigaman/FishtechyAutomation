package APIUtility;
import okhttp3.*;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import Components.Users;

public class CatchfeedAPI {

	
    private static final OkHttpClient client = new OkHttpClient();
    private static final String BASE_URL = "https://api-stage.flytechy.site";


 
    public static List<Users> getAllCatches() throws Exception {
        List<Users> users = new ArrayList<>();  // Initialize the list of users  // Initialize the list of users

        if (!TokenStorage.isAccessTokenValid()) {
            boolean refreshed = TokenStorage.refreshAccessToken();
            if (!refreshed) {
                throw new IllegalStateException("Access and Refresh tokens are invalid or expired. Please log in again.");
            }
        }

        String accessToken = TokenStorage.getAccessToken();

        Request request = new Request.Builder()
            .url(BASE_URL + "/feeds/explore?page=1&limit=1000")
            .addHeader("Authorization", "Bearer " + accessToken)
            .build();

        try (Response response = client.newCall(request).execute()) {
            System.out.println("GET /Catches\nStatus: " + response.code());
            String json = response.body().string();
            System.out.println("GET All Catches\n: "+ json);
         

            JSONObject root = new JSONObject(json);

            // Parse through the results from the API response
            JSONArray results = root.getJSONArray("results");
            
            
            for (int i = 0; i < results.length(); i++) {
                JSONObject result = results.getJSONObject(i);
                System.out.println("Result: "+ result);
                String id = result.getString("id");
                System.out.println("Name: " + id);

                
                JSONObject userJson = result.getJSONObject("user");

                // Create a User object for each response item
                Users user = new Users(
                        userJson.getString("id"),
                        userJson.getString("fullName"),
                        userJson.getString("username"),
                        userJson.getString("email"),
                        userJson.getBoolean("isPublic")
                );

                // Add the User object to the list
                users.add(user);  // Here we add the user to the 'users' list
            }

            
            

            if (!response.isSuccessful()) {
                throw new RuntimeException("Failed to get catches: " + response.code() + "\n" + json);
            }
        }
        
        return users;
    }
}






//








// 2. POST - Create a product
//public static void createProduct() throws Exception {
//    MediaType JSON = MediaType.parse("application/json; charset=utf-8");
//    String json = "{" 
//    	    + "\"title\":\"New Appium Product\","
//    	    + "\"price\":49.99,"
//    	    + "\"description\":\"Test product from Selenium Appium Java\","
//    	    + "\"image\":\"https://i.pravatar.cc\","
//    	    + "\"category\":\"electronics\""
//    	    + "}";
//
//    
//
//    RequestBody body = RequestBody.create(json, JSON);
//    Request request = new Request.Builder().url(BASE_URL + "/products").post(body).build();
//
//    try (Response response = client.newCall(request).execute()) {
//        System.out.println("POST /products\nStatus: " + response.code());
//        System.out.println("Response: " + response.body().string());
//    }
//}

// 3. PUT - Update a product
//public static void updateProduct(int id) throws Exception {
//    MediaType JSON = MediaType.parse("application/json; charset=utf-8");
//    String json = "
//        {
//            "title": "Updated Product",
//            "price": 59.99
//        }";
//
//    RequestBody body = RequestBody.create(json, JSON);
//    Request request = new Request.Builder().url(BASE_URL + "/products/" + id).put(body).build();
//
//    try (Response response = client.newCall(request).execute()) {
//        System.out.println("PUT /products/" + id + "\nStatus: " + response.code());
//        System.out.println("Response: " + response.body().string());
//    }
//}

// 4. DELETE - Delete a product
//public static void deleteProduct(int id) throws Exception {
//    Request request = new Request.Builder().url(BASE_URL + "/products/" + id).delete().build();
//    try (Response response = client.newCall(request).execute()) {
//        System.out.println("DELETE /products/" + id + "\nStatus: " + response.code());
//        System.out.println("Response: " + response.body().string());
//    }
//}
