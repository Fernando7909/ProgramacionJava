package MP03_Marina.UF_4.CUSTOMER;

import java.util.List;

public class Order {

    //Atributos:
    private int orderId;
    private Customer customer;
    private List<OrderItem> orderItems;



    //Funciones Consructoras:
    public Order(){}
    public Order(int orderId, Customer customer, List<OrderItem> orderItems, List<Order> order) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderItems = orderItems;
    }

    //Getters:
    public int getOrderId(){
        return orderId;
    }
    public Customer getCustomer(){
        return customer;
    }
    public List<OrderItem> getOrderItems(){
        return orderItems;
    }

    //Setters:
    public void setOrderId(int orderId){
        this.orderId = orderId;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    public void setOrderItems(List<OrderItem> orderItems){
        this.orderItems = orderItems;
    }

    //Funciones UML:
    public void addOrderItem(OrderItem item){}
    public void removeOrderItem(OrderItem item){}
    public double calculateTotal(){
        double total = 0;
        for (int i = 0; i < orderItems.size(); i++){
            total++;
        }
        return total;
    }
}
