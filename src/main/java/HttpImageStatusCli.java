import org.jsoup.HttpStatusException;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HttpImageStatusCli {

    public void askStatus() {

        HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();

        String code;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter HTTP status code: ");
            code = scanner.nextLine();
            try {
                if (code.matches("\\d+")) {
                    httpStatusImageDownloader.downloadStatusImage(Integer.parseInt(code));
                    break;
                } else {

                    throw new InputMismatchException();

                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid number.");
            } catch (HttpStatusException e) {
                System.out.println("There is not image for HTTP status "+code);
            }catch (IOException e) {
                e.printStackTrace();
                break;
            }

        }
        scanner.close();
    }

}
