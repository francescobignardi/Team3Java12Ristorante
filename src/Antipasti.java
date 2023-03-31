

public class Antipasti {
    private String nomePiatto;
    private double prezzoPiatto;

    public Antipasti(String nomePiatto, double prezzoPiatto){
        this.nomePiatto = nomePiatto;
        this.prezzoPiatto= prezzoPiatto;
    }

    public String getNomePiatto() {
        return nomePiatto;
    }

    public void setNomePiatto(String nomePiatto) {
        this.nomePiatto = nomePiatto;
    }

    public double getPrezzoPiatto() {
        return prezzoPiatto;
    }

    public void setPrezzoPiatto(double prezzoPiatto) {
        this.prezzoPiatto = prezzoPiatto;
    }

    //TODO il nome deve essere parlante, printDetail?
    public void printerMethod(String nomePiatto, double prezzoPiatto) {
        System.out.println(nomePiatto + " € " + prezzoPiatto);
    }
}