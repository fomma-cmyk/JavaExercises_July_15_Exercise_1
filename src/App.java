import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TvShow tv = new TvShow();

        while (true) {
            try {
                System.out.print("Channel number: ");
                tv.setChannelNumber(scanner.nextInt());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        int year, month, day, hour, minute;

        while (true) {
            try {
                System.out.print("Year: ");
                year = scanner.nextInt();
                System.out.print("Month: ");
                month = scanner.nextInt();
                System.out.print("Day: ");
                day = scanner.nextInt();
                System.out.print("Hour: ");
                hour = scanner.nextInt();
                System.out.print("Minute: ");
                minute = scanner.nextInt();

                tv.setStartTime(year, month, day, hour, minute);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Duration (minutes): ");
                tv.setDuration(scanner.nextInt());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Recording scheduled:");
        System.out.println("Channel: " + tv.getChannelNumber());
        System.out.println("Start: " + tv.getStartTime());
        System.out.println("Duration: " + tv.getDuration() + " minutes");
    }
}
