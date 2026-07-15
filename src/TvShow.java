import java.time.DateTimeException;
import java.time.LocalDateTime;

public class TvShow {
    private int channelNumber;
    private LocalDateTime startTime;
    private int duration;

    public void setChannelNumber(int channelNumber) {
        if (channelNumber < 1 || channelNumber > 999) {
            throw new IllegalArgumentException("Invalid channel number");
        }
        this.channelNumber = channelNumber;
    }

    public void setStartTime(int year, int month, int day, int hour, int minute) {
        if (year < 1) {
            throw new IllegalArgumentException("Invalid year");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid day");
        }
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour");
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute");
        }

        try {
            this.startTime = LocalDateTime.of(year, month, day, hour, minute);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException("Impossible date");
        }
    }

    public void setDuration(int duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("Invalid duration");
        }
        this.duration = duration;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public int getDuration() {
        return duration;
    }
}
