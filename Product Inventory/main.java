import java.util.*;

class product{
    private String id;
    private double price;
    private int quantity;

    public int getQuantity(){
        return quantity;
    }

    public String getId(){
        return id;
    }

    public double getPrice(){
        return price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void display(){
        System.out.println(("Id: " + id));
        System.out.println("Quantity: "+ quantity);
        System.out.println("Price: " + price);
    }
}

class inventory{


}