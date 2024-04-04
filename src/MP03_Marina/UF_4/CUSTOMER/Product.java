package MP03_Marina.UF_4.CUSTOMER;

public class Product {

    //Atributos:
    private int productId;
    private String name;
    private double price;

    //Funcion Constructora:
    public Product(){}
    public Product(int productId, String Productname, double Productprice) {
        this.productId = productId;
        this.name = Productname;
        this.price = Productprice;
    }

    //Getters:
    public int getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }


    //Setters:
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
