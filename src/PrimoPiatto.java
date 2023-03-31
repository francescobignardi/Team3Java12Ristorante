

public class PrimoPiatto {

//Instance variable

    private String name;
    private double price;

//Constructor

    //TODO questo non serve e puliamo

    public PrimoPiatto() {
    }

    public PrimoPiatto(String name, double price) {
        this.name = name;
        this.price = price;
    }

//Getter

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

//Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//Other methods

    //Printer
    public static void print(PrimoPiatto primoPiatto) {
        System.out.println(primoPiatto.name + "  € " + primoPiatto.price);
    }

    public void printer() {
        System.out.println(name + "  € " + price);
    }

}