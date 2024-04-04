package MP03_Marina.UF_4.CUSTOMER;

public class Main {
    public static void main(String[] args){

        //Funciones Constructoras:
        Order O = new Order();
        Customer C = new Customer();
        Product P = new Product();
        OrderItem OI = new OrderItem();

        //Instancia Order:
        O.setOrderId(125);
        System.out.println(O.getOrderId());

        //Instancia Customer
        C.setName("Pepe");
        System.out.println(C.getName());

        //Instancia Product
        P.setPrice(100);
        System.out.println(P.getPrice());

        //Instancia OrderItem
        OI.setQuantity(50);
        System.out.println(OI.getQuantity());
    }
}
