package LamdaExpression;

public class prac2 {
    static void main(String[] args) {
        Runnable r1=() ->
        {
            System.out.println("This is my runable interface");
        };
        Thread t1=new Thread(r1);
        t1.start();


        Runnable r2=() -> {
            for (int i = 1; i < 6; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t2=new Thread(r2);
        t2.start();

    }
}
