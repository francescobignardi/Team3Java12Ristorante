package Classi;

public class SecondiPiatti {

    // instance variables
    private String dishName;
    private double price;


    // constructor

    public SecondiPiatti(){

    }
    public SecondiPiatti(String dishName, double price) {

        this.dishName = dishName;
        this.price = price;

    }


    // GETTER
    public String getDishName() {
        return dishName;
    }

    public double getPrice() {
        return price;
    }


    // SETTER

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setPrice(double price) {
        this.price = price;
    }



   public static void printer(SecondiPiatti secondiPiatti){
       System.out.println(secondiPiatti.dishName + "  -->  " + secondiPiatti.price + " €");

   }
}
