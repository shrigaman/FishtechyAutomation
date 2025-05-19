package APIUtility;

import okhttp3.*;
import org.json.JSONArray;

public class APIClient {

    public static final String BASE_URL = "https://api-stage.flytechy.site";
    private static final OkHttpClient client = new OkHttpClient();

    public static void getAllCatches() throws Exception {
        String accessToken = TokenStorage.getValidAccessToken();

        Request request = new Request.Builder()
            .url(BASE_URL + "/feeds/explore?page=1&limit=20")
            .addHeader("Authorization", "Bearer " + accessToken)
            .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new RuntimeException("Failed to fetch catches: " + response.code());
            }

            String json = response.body().string();
            JSONArray arr = new JSONArray(json);
            System.out.println("Response: " + arr);
        }
    }
}
