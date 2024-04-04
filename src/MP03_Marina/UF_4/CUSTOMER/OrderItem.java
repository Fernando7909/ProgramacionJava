package MP03_Marina.UF_4.CUSTOMER;

public class OrderItem {

    //Atributos:
    private int orderItemId;
    private  int productId;
    private int quantity;
    private double price;


    //Funcion Constructora:
    public OrderItem(){}
    public OrderItem(int orderItemId, int productId, int quantity, double price) {
        this.orderItemId = orderItemId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    //Getters:
    public int getOrderItemId() {
        return orderItemId;
    }
    public int getProductId() {
        return productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }


    //Setters:
    public void setOrderItemId(int orderItemId) {this.orderItemId = orderItemId;}
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
