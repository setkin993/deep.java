# deep.java
import java.text.DecimalFormat;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        int duration = 300; // 5 минут
        startTimer(duration);
    }

    public static void startTimer(int duration) throws InterruptedException {
        while (duration >= 0) {
            int minutes = duration / 60;
            int seconds = duration % 60;
            DecimalFormat formatter = new DecimalFormat("00");
            String timer = formatter.format(minutes) + ":" + formatter.format(seconds);
            System.out.print("\r" + timer);
            Thread.sleep(1000);
            duration--;
        }
        System.out.println("\nТаймер завершен!");
    }
}
