import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
        int currentYear = LocalDateTime.now().getYear();

        while (true) {
            System.out.print("Year: ");
            year = scanner.nextInt();
            if (year >= currentYear) {
                break;
            }
            System.out.println("Invalid year. Must be " + currentYear + " or later.");
        }


        while (true) {
            System.out.print("Month: ");
            month = scanner.nextInt();
            if (month >= 1 && month <= 12) {
                break;
            }
            System.out.println("Invalid month. Must be between 1 and 12.");
        }

      
        while (true) {
            System.out.print("Day: ");
            day = scanner.nextInt();
            try {
                LocalDate.of(year, month, day);
                break; 
            } catch (DateTimeException e) {
                System.out.println("Invalid day for the selected month/year. Try again.");
            }
        }

     
        while (true) {
            System.out.print("Hour: ");
            hour = scanner.nextInt();
            if (hour >= 0 && hour <= 23) {
                break;
            }
            System.out.println("Invalid hour. Must be between 0 and 23.");
        }

        
        while (true) {
            System.out.print("Minute: ");
            minute = scanner.nextInt();
            if (minute >= 0 && minute <= 59) {
                break;
            }
            System.out.println("Invalid minute. Must be between 0 and 59.");
        }

     
        tv.setStartTime(year, month, day, hour, minute);

       
        while (true) {
            try {
                System.out.print("Duration (minutes): ");
                tv.setDuration(scanner.nextInt());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nRecording scheduled:");
        System.out.println("Channel: " + tv.getChannelNumber());
        System.out.println("Start: " + tv.getStartTime());
        System.out.println("Duration: " + tv.getDuration() + " minutes");
    }
}