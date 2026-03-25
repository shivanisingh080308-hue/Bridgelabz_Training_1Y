
package OnlineRetailOrderManagement;

import org.w3c.dom.ls.LSOutput;

public class DeliveredOrder extends ShippedOrder{
    int deliveryDate;

    public DeliveredOrder(int orderId,int orderDate,int trackingNumber,int deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.trackingNumber=trackingNumber;
    }

    public void getOrderStatus() {
        System.out.println("Order has been delivered");
        System.out.println("Order Id : "+orderId);
        System.out.println("Date of order placement : "+orderDate);
        System.out.println("Tracking Number : "+trackingNumber);
        System.out.println("Date of Delivery : "+deliveryDate);
    }
}
