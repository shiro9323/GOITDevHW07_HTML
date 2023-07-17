import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        HttpStatusChecker httpStatusChecker = new HttpStatusChecker();
        System.out.println("httpStatusChecker.getStatusImage(200) = " + httpStatusChecker.getStatusImage(200));

        HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
        httpStatusImageDownloader.downloadStatusImage(400);

        HttpImageStatusCli httpImageStatusCli = new HttpImageStatusCli();
        httpImageStatusCli.askStatus();
        
    }
    
    
    
}
