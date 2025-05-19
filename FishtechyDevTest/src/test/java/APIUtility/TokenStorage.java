package APIUtility;

import java.time.Instant;
import okhttp3.*;
import org.json.JSONObject;

public class TokenStorage {

    private static String accessToken;
    private static long accessTokenExpiry; // epoch millis

    private static String refreshToken;
    private static long refreshTokenExpiry;

    
    public static String getAccessToken() {
        return accessToken;
    }
    public static final OkHttpClient client = new OkHttpClient();

    public static void saveTokens(String access, String accessExpiry, String refresh, String refreshExpiry) {
        accessToken = access;
        accessTokenExpiry = Instant.parse(accessExpiry).toEpochMilli();
        refreshToken = refresh;
        refreshTokenExpiry = Instant.parse(refreshExpiry).toEpochMilli();
    }

    public static boolean isAccessTokenValid() {
        return accessToken != null && Instant.now().toEpochMilli() < accessTokenExpiry;
    }

    public static boolean isRefreshTokenValid() {
        return refreshToken != null && Instant.now().toEpochMilli() < refreshTokenExpiry;
    }

    public static boolean refreshAccessToken() throws Exception {
        if (!isRefreshTokenValid()) return false;

        String json = "{\"refreshToken\":\"" + refreshToken + "\"}";
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(json, JSON);

        Request request = new Request.Builder()
                .url(APIClient.BASE_URL + "/auth/refresh-token")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) return false;

            String responseBody = response.body().string();
            JSONObject obj = new JSONObject(responseBody);

            saveTokens(
                obj.getString("accessToken"),
                obj.getString("accessTokenExpiry"),
                obj.getString("refreshToken"),
                obj.getString("refreshTokenExpiry")
            );

            System.out.println("🔄 Access token refreshed.");
            return true;
        }
    }

    public static String getValidAccessToken() throws Exception {
        if (!isAccessTokenValid()) {
            boolean refreshed = refreshAccessToken();
            if (!refreshed) {
                throw new IllegalStateException("❌ Access and Refresh tokens are invalid. Please log in again.");
            }
        }
        return accessToken;
    }

    public static String getCurrentAccessToken() {
        return accessToken;
    }
}
