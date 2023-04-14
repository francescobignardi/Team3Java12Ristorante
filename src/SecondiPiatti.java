

public class SecondiPiatti {


    private String name;
    private double price;


    public SecondiPiatti(String name, double price) {

        this.name = name;
        this.price = price;

    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void print(String name, double price) {
        System.out.println(name + " -->  " + price + " €");
    }

    @Override
    public String toString() {
        return "SecondiPiatti{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}
