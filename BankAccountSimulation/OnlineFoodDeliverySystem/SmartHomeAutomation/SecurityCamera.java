package SmartHomeAutomation;

public class SecurityCamera implements Runnable {
    public void run() {
        int time = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Status of Security Camera : Recording");
            System.out.println("Timestamp : " + time + ":00");
            System.out.println("Cycle - " + i);
            time++;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
