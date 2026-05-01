package SmartHomeAutomation;

public class Runner {
    public static void main(String[] args){
        SecurityCamera s=new SecurityCamera();
        TemperatureSensor t=new TemperatureSensor();
        LightController l=new LightController();
        DoorLockMonitor d=new DoorLockMonitor();

        Thread tempThread=new Thread(t);
        Thread securityThread=new Thread(s);
        Thread lightThread=new Thread(l);
        Thread doorThread=new Thread(d);

        tempThread.setPriority(7);
        securityThread.setPriority(10);
        lightThread.setPriority(5);
        doorThread.setPriority(5);

        tempThread.start();
        securityThread.start();
        lightThread.start();
        doorThread.start();
    }
}
