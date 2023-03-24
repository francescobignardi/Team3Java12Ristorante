package Classi;

public class Bevande {

    private String name;
    private double price;

    public Bevande(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void print(Bevande bevande){
        System.out.println(bevande.name + " € " + bevande.price);
    }

    public void printer(){
        System.out.println(name + " € " + price);
    }
}
