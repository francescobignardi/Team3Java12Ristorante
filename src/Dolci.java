package src;
public class Dolci {
    //TODO rivedere la struttura base delle vostre class
    private String nome;
    private double prezzo;

    public Dolci(){
    }

    public String getNomeDolce() {
        return nome;
    }

    public void setNomeDolce(String nome) {
        this.nome = nome;
    }

    public double getPrezzoDolce() {
        return prezzo;
    }

    public void setPrezzoDolce(double prezzo) {
        this.prezzo = prezzo;
    }

    public void print(String nome, double prezzo) {
        System.out.println(nome + " € " + prezzo);
    }
}