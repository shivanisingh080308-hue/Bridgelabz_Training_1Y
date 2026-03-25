
package OnlineRetailOrderManagement;

public class ShippedOrder extends Order{
    int trackingNumber;

    public ShippedOrder(int orderId,int orderDate,int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }

    public void getOrderStatus(){
        System.out.println("Order has been shipped");
        System.out.println("Order Id : "+orderId);
        System.out.println("Date of order placement : "+orderDate);
        System.out.println("Tracking Number : "+trackingNumber);
    }
}
