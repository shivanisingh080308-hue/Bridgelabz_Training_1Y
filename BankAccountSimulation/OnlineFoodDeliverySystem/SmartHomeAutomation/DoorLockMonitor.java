package SmartHomeAutomation;

public class DoorLockMonitor implements Runnable{
    public void run(){
        int time=9;
        for(int i=1;i<=5;i++){
            System.out.println("Status of Door Lock Monitor : Recording");
            System.out.println("Timestamp : "+time+":00");
            System.out.println("Cycle - "+i);
            time++;
            try{
                Thread.sleep(6000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
