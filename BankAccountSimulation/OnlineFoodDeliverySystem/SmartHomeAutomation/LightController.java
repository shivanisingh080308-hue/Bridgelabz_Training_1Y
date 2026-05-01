package SmartHomeAutomation;

public class LightController implements Runnable{
    public void run(){
        int time=6;
        for(int i=1;i<=5;i++){
            System.out.println("Status of Light Controller : Recording");
            System.out.println("Timestamp : "+time+":00");
            System.out.println("Cycle - "+i);
            time++;
            try{
                Thread.sleep(4000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
