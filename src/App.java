import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TvShow tv = new TvShow();

        System.out.print("Channel number: ");
        tv.setChannelNumber(sc.nextInt());

        System.out.print("Year: ");
        int year = sc.nextInt();
        System.out.print("Month: ");
        int month = sc.nextInt();
        System.out.print("Day: ");
        int day = sc.nextInt();
        System.out.print("Hour: ");
        int hour = sc.nextInt();
        System.out.print("Minute: ");
        int minute = sc.nextInt();
        tv.setStartTime(year, month, day, hour, minute);

        System.out.print("Duration (minutes): ");
        tv.setDuration(sc.nextInt());

        System.out.println("Recording scheduled:");
        System.out.println("Channel: " + tv.getChannelNumber());
        System.out.println("Start: " + tv.getStartTime());
        System.out.println("Duration: " + tv.getDuration() + " minutes");
    }
}
