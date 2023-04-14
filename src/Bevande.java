
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

    public void print() {

        System.out.println(name + " € " + price);
    }

    @Override
    public String toString() {
        return "Bevande{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}
