import org.jsoup.HttpStatusException;

public class Main {

    public static void main(String[] args) throws HttpStatusException {

        HttpStatusChecker httpStatusChecker = new HttpStatusChecker();
        System.out.println("httpStatusChecker.getStatusImage(200) = " + httpStatusChecker.getStatusImage(200));
        System.out.println("httpStatusChecker.getStatusImage(1000) = " + httpStatusChecker.getStatusImage(1000));
        
    }
    
    
    
}
