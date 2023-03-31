package Classi;

public class Dolci {
    private String nomeDolce;
    private double prezzoDolce;

    public Dolci(){
    }

    public String getNomeDolce() {
        return nomeDolce;
    }

    public void setNomeDolce(String nomeDolce) {
        this.nomeDolce = nomeDolce;
    }

    public double getPrezzoDolce() {
        return prezzoDolce;
    }

    public void setPrezzoDolce(double prezzoDolce) {
        this.prezzoDolce = prezzoDolce;
    }

    public void print(String nomeDolce, double prezzoDolce) {
        System.out.println(nomeDolce + " € " + prezzoDolce);
    }
}