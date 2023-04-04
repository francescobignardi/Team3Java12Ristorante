package src;
public class Dolci {
    //TODO rivedere la struttura base delle vostre class
    private String name;
    private double price;

    public Dolci(){
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
}