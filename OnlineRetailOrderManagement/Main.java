
package OnlineRetailOrderManagement;

public class Main {
    public static void  main(String[] args){
        Order o=new Order(001,05072026);
        ShippedOrder s=new ShippedOrder(002,10092026,567234);
        DeliveredOrder d=new DeliveredOrder(003,15122026,123987,20122026);
        System.out.println("-----Order 1 Details-----");
        o.getOrderStatus();
        System.out.println("-----Order 2 Details-----");
        s.getOrderStatus();
        System.out.println("-----Order 3 Details-----");
        d.getOrderStatus();
    }
}
