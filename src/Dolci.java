

public class Dolci {

    private String name;
    private double price;

    public Dolci(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getNomeDolce() {
        return name;
    }

    public void setNomeDolce(String name) {
        this.name = name;
    }

    public double getPrezzoDolce() {
        return price;
    }

    public void setPrezzoDolce(double price) {
        this.price = price;
    }

    public void print(String name, double price) {
        System.out.println(name + " € " + price);
    }

    @Override
    public String toString() {
        return "Dolci{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}