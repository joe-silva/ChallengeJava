import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RateRequest {

    public Rates baixaRate(String base_code, String target_code, double amount) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + APIkey.getMyApiKey()
                        + "/pair/" + base_code + "/" + target_code + "/" + amount))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Rates.class);


        } catch (Exception e) {
            throw new RuntimeException("Ta complicado, hein! Tente de novo.", e);
        }
    }
}