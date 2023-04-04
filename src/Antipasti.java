package src;
public class Antipasti {
    private String name;
    private double price;

    public Antipasti(String name, double price){
        this.name = name;
        this.price= price;
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

    //TODO il nome deve essere parlante, printDetail?
    public void print(String name, double price) {
        System.out.println(name + " € " + price);
    }
}