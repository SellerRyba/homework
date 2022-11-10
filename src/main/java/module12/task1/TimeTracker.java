package module12.task1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimeTracker {

    public static void main(String[] args) {
        Runnable producer = new Runnable() {
            long curr;
            @Override
            public void run() {
                System.out.println(curr + " second");
                curr++;
            }
        };
        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                System.out.println("Прошло 5 секунд");
            }
        };
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.scheduleAtFixedRate(producer, 0, 1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(consumer, 5, 5, TimeUnit.SECONDS);
    }
}
