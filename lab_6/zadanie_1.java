//

package lab_6;

import java.sql.SQLData;

public class zadanie_1 {
    public static void main(String[] args) {

        final int NANOSECONDS_PER_SCOND=1000000000, MILLISECONDS_PER_SECOND = 1000, SECONDS_PER_MINUTE = 60,
                MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24;
        long totalNanoseconds, totalMilliseconds , totalSeconds, currentSecond,
                totalMinutes, currentMinute, totalHours, currentHour;
        totalNanoseconds = System.nanoTime();
        totalMilliseconds = System.currentTimeMillis();
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;

        currentSecond = totalSeconds % SECONDS_PER_MINUTE;
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        currentMinute = totalMinutes % MINUTES_PER_HOUR;
        totalHours = totalMinutes / MINUTES_PER_HOUR+7;
        currentHour = totalHours % HOURS_PER_DAY;
        System.out.println("Текущее время равно " + currentHour + ":" + currentMinute + ":" + currentMinute + "+" + currentSecond + "GMT.");
    }
}
