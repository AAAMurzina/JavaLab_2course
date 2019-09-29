import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;

public class UrlThread extends Thread {
    String Url;

    @Override
    public void run() {
        String extension = Url.substring(Url.lastIndexOf('/')+1);
        URL url = null;
        try {
            url = new URL(Url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        InputStream inputStream = null;
        try {
            inputStream = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.copy(inputStream, new File("c:/" + extension).toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public UrlThread(String Url) {
        this.Url = Url;

    }
}
