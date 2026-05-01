package OnlineFoodDeliverySystem;

public class Order implements Runnable{
    private int orderId;
    private String restaurantName;
    private int deliveryTime;

    public Order(int orderId,String restaurantName,int deliveryTime) {
        this.orderId = orderId;
        this.restaurantName=restaurantName;
        this.deliveryTime=deliveryTime;
    }

    @Override
    public void run(){
        try{
            System.out.println("Your order with order id "+orderId+" has been picked up");
            System.out.println("Your order with order id "+orderId+" is in transit");
            System.out.println("Your order with order id "+orderId+" has been delivered");
            Thread.sleep(deliveryTime*1000);
        }catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
