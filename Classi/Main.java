package Classi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PrimoPiatto carbonara= new PrimoPiatto("Carbonara", 11.1234557);
        PrimoPiatto.print(carbonara);
        carbonara.printer();

        Antipasti antipasti = new Antipasti();
        antipasti.printerMethod("Patatine fritte", 4.00);
        antipasti.printerMethod("Misto caldo", 6.00);
        antipasti.printerMethod("Bruschette al pomodoro", 5.00);
        antipasti.printerMethod("Tagliere di salumi e formaggi", 12.00);
        antipasti.printerMethod("Caponata",5.00);


        SecondiPiatti secondiPiatti = new SecondiPiatti("Bistecca", 18.50);
        System.out.println("\nSECONDI PIATTI");
        SecondiPiatti.printer(secondiPiatti);
        secondiPiatti.setDishName("Arrosticini");
        secondiPiatti.setPrice(12.50);
        SecondiPiatti.printer(secondiPiatti);
        secondiPiatti.setDishName("Coda alla vaccinara");
        secondiPiatti.setPrice(15.50);
        SecondiPiatti.printer(secondiPiatti);
        secondiPiatti.setDishName("Cotoletta");
        secondiPiatti.setPrice(8.50);
        SecondiPiatti.printer(secondiPiatti);

        Dolci listaDolci= new Dolci();
        listaDolci.print("Pannacotta"+3)
        listaDolci.print("Babà"+4)
        listaDolci.print("Zeppole"+2.50)
        listaDolci.print("Pastiera"+5)
        listaDolci.print("Sfogliatella"+4.50)
    }
}