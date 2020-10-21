package module2_test2_2;

/**
 * Created by student1 on 21.10.20.
 */
public class Time {
    int hour, min, sec;

    public Time(int seconds){
        int min = seconds / 60;
        seconds -= min * 60;
        this.sec = seconds;
        this.hour = min / 60;
        this.min = min - (hour * 60);
    }
    // YOUR CODE will be placed HERE
    // ...
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}
