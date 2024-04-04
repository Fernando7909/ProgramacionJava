package MP03_Marina.UF_4.CUSTOMER;

public class Customer {

    //Atributos:
    private int customerId;
    private String name;
    private String email;


    //Funciones Constructoras:
    public Customer(){}
    public Customer(int customerId, String name, String email){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    //Getters:
    public int getCustomerId(){
        return customerId;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }


    //Setters:
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
