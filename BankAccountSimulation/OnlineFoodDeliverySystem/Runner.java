package OnlineFoodDeliverySystem;

public class Runner {
    public static void main(String[] args) {
        Order o1 = new Order(101, "Dominos", 3);
        Order o2 = new Order(102, "Subway", 2);
        Order o3 = new Order(103, "KFC", 4);
        Order o4 = new Order(104, "MacDonalds", 5);
        Order o5 = new Order(105, "PizzaHut", 6);

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        Thread t3 = new Thread(o3);
        Thread t4 = new Thread(o4);
        Thread t5 = new Thread(o5);

        t1.setPriority(10);
        t2.setPriority(10);
        t3.setPriority(3);
        t4.setPriority(5);
        t5.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
