package enter.J011;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JIO {
    public static void main(String[] args) throws IOException {
        URL url = new URL("naver.com");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        InputStream inputStream = new BufferedInputStream(urlConnection.getInputStream());
//        BufferedInputStream reader = new BufferedInputStream(new InputStreamReader(inputStream , "UTF-8"), 8);

        StringBuilder sb = new StringBuilder();
        String line = "";
//        while ((line = reader.readerLine()) != null) {
//            sb.append(line + "\n");
//        }
        String jsonString = sb.toString();
    }
}