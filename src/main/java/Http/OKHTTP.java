package Http;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class OKHTTP {

    private static final String BASEURL = "https://jsonplaceholder.typicode.com/posts";
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(BASEURL)
                .build();


    }
}
