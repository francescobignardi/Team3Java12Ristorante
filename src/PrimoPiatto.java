package src;

public class PrimoPiatto {

//Instance variable

    private String name;
    private double price;

//Constructor

    public PrimoPiatto(String name, double price) {
        this.name = name;
        this.price = price;
    }
// Getter & Setter

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


//Other methods

    //Printer
    public void print() {
        System.out.println(name + "  € " + price);
    }

}