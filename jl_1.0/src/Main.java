import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc =  new Scanner(System.in);
        String url = sc.nextLine();
        String[] ArrUrl = url.split(" ");
        UrlThread[] tread = new UrlThread[ArrUrl.length];
        for (int i = 0; i < ArrUrl.length; i++) {
            tread[i] = new UrlThread(ArrUrl[i]);
            tread[i].start();
        }
        for (int i = 0; i < ArrUrl.length ; i++) {
            tread[i].join();
        }
    }
}
