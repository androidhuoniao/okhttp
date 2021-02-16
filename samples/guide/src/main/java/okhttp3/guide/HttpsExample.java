package okhttp3.guide;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpsExample {
  OkHttpClient client = OkHttpClientFactory.getInstance().newClient();

  String run(String url) throws IOException {
    Request request = new Request.Builder()
        .url(url)
        .build();

    try (Response response = client.newCall(request).execute()) {
      return response.body().string();
    }
  }

  public static void main(String[] args) throws IOException {
    HttpsExample example = new HttpsExample();
    String url = "https://www.baidu.com";
    String response = example.run(url);
    System.out.println(response);
  }
}
