import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        String url = "https://dummyjson.com/products/1";
        try{
            // Create an HttpRequest using a Builder pattern
            HttpRequest request = HttpRequest.newBuilder(URI.create(url)).GET().build();

            HttpClient httpClient = HttpClient.newHttpClient();

            // Send the HttpRequest and receive an HttpResponse
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
        }
        catch (IOException | InterruptedException ex){
            ex.printStackTrace();
        }
    }
}