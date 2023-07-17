import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class HttpStatusImageDownloader {

    public void downloadStatusImage(int code) throws IOException {

        HttpStatusChecker httpStatusChecker = new HttpStatusChecker();

        String urlImage = httpStatusChecker.getStatusImage(code);

        URL url = new URL(urlImage);

        try (InputStream in = url.openStream()) {

            String fileName = urlImage.substring(urlImage.lastIndexOf('/') + 1);

            Path destination = Path.of(fileName);
            Files.copy(in, destination, StandardCopyOption.REPLACE_EXISTING);

        }
    }

}
