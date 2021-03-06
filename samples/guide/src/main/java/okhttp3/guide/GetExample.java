package okhttp3.guide;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetExample {
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
    GetExample example = new GetExample();
    String url ="https://raw.github.com/square/okhttp/master/README.md";
    url = "http://www.baidu.com";
    String response = example.run(url);
    System.out.println(response);
  }
}
