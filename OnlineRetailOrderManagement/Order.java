
package OnlineRetailOrderManagement;

public class Order {
    int orderId;
    int orderDate;

    public Order(int orderId,int orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

    public void getOrderStatus(){
        System.out.println("Order Placed");
        System.out.println("Order Id : "+orderId);
        System.out.println("Date of order placement : "+orderDate);
    }
}
