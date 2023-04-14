

public class Antipasti {


    //TODO su tutte le classi vanno messe dei field aggiuntivi, kmZero ad esempio
    private String name;
    private double price;

    public Antipasti(String name, double price) {
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

    //TODO rivedete insieme il concetto di variabili di stato
    public void print() {
        System.out.println(this.name + " € " + this.price);

    }

    //TODO ti buco le ruote delle macchina se usi il toString per stampare
    @Override
    public String toString() {
        return "Antipasti{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}