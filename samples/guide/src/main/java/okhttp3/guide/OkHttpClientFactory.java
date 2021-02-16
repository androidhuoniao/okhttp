package okhttp3.guide;

import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.recipes.PrintEvents;

/**
 * Created by grassswwang
 * on 2021/2/14
 * Email: grassswwang@tencent.com
 */
class OkHttpClientFactory {
    private static final OkHttpClientFactory ourInstance = new OkHttpClientFactory();

    public static OkHttpClientFactory getInstance() {
        return ourInstance;
    }

    private OkHttpClientFactory() {
    }

    public OkHttpClient newClient(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.eventListenerFactory(GrassEventListener.FACTORY);
        return builder.build();
    }


}
