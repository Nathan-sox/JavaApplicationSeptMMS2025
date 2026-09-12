
package Time;

public class Time2 {
    // Only one instance variable instead of three
    private int totalSeconds; 

    // No-argument constructor
    public Time2() {
        this(0, 0, 0); 
    }

    // Constructor with hour supplied
    public Time2(int hour) {
        this(hour, 0, 0); 
    }

    // Constructor with hour and minute supplied
    public Time2(int hour, int minute) {
        this(hour, minute, 0); 
    }

    // Constructor with hour, minute, and second supplied
    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        // Convert the values to total seconds since midnight
        this.totalSeconds = (hour * 3600) + (minute * 60) + second;
    }

    // Constructor with another Time2 object supplied
    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond()); 
    }

    // Set Methods
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.totalSeconds = (hour * 3600) + (minute * 60) + second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        // Keep current minute and second, change only the hour
        this.totalSeconds = (hour * 3600) + (getMinute() * 60) + getSecond();
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        // Keep current hour and second, change only the minute
        this.totalSeconds = (getHour() * 3600) + (minute * 60) + getSecond();
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        // Keep current hour and minute, change only the second
        this.totalSeconds = (getHour() * 3600) + (getMinute() * 60) + second;
    }

    // Get Methods (Calculated on the fly from totalSeconds)
    public int getHour() {
        return totalSeconds / 3600;
    }

    public int getMinute() {
        return (totalSeconds % 3600) / 60;
    }

    public int getSecond() {
        return totalSeconds % 60;
    }

    // Convert to Universal Time String
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // Convert to Standard Time String
    public String toString() {
        return String.format("%d:%02d:%02d %s", 
            ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
            getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
