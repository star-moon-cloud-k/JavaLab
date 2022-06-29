package enter.J009;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JTryCatch {
    public static void JTryCatch() {
        InputStream inputStream = null;
        URL url = null;

        boolean isConnection;
        try {
            String newUrls = null;
            url = new URL(newUrls);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            inputStream = new BufferedInputStream(urlConnection.getInputStream());
            //생략
            inputStream.close();
            isConnection = true;
        } catch (Exception e) {
            isConnection = false;
        } finally {
            try {
                inputStream.close();
            } catch (Exception e) {
            }
        }
    }
    public interface Closeable extends AutoCloseable{
        public void close() throws IOException;
    }
    public abstract class Reader implements Readable, Closeable{}
    public abstract class Writer implements Appendable, Closeable , Flushable {}

    public void main(String[] args){
//        try(BufferedReader reader =
//                new BufferedReader(new FileReader(file))){
//
//        }catch (Exception ex){}
//
//        try(BufferedWriter writer =
//                new BufferedWriter(new FileWriter(file))){
//            writer.write(msg);
//        }catch (IOException ex){
//            System.out.println(ex);
//        }
    }

}
