
import java.util.ArrayList;
import src.SecondiPiatti;

public class Main {
    public static void main(String[] args) {
        PrimoPiatto carbonara= new PrimoPiatto("Carbonara", 11.1234557);

        //TODO pensate a cosa serve a nulla perchè noi dobbiamo ragionare sempre con le istanze degli oggetti
        // provate a creare due oggetti
        PrimoPiatto.print(carbonara);
        carbonara.printer();


        Antipasti antipasti = new Antipasti("Patatine fritte", 4.00);
        System.out.println(antipasti.getNomePiatto() + " " + antipasti.getPrezzoPiatto());
        antipasti.printerMethod("Misto caldo", 6.00);
        antipasti.printerMethod("Bruschette al pomodoro", 5.00);
        antipasti.printerMethod("Tagliere di salumi e formaggi", 12.00);
        antipasti.printerMethod("Caponata",5.50);



        // Sistema tramite print
        SecondiPiatti secondipiatti1 = new SecondiPiatti();
        System.out.println("\nSECONDI PIATTI");
        secondipiatti1.print("Arrosticini", 13.10);
        secondipiatti1.print("Bistecca", 18.50);
        secondipiatti1.print("Coda Alla vaccinara", 15.10);
        secondipiatti1.print("Cotoletta", 8.10);
        System.out.println("");


        Dolci listaDolci= new Dolci();
        listaDolci.print("Pannacotta",3);
        listaDolci.print("Babà",4);
        listaDolci.print("Zeppole",2.50);
        listaDolci.print("Pastiera",5);
        listaDolci.print("Sfogliatella",4.50);
    }
}