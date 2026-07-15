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
        this.startTime = LocalDateTime.of(year, month, day, hour, minute);
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
