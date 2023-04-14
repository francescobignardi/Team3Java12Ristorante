
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("Il menu di casa", "Bastianich", "Carnivoro");
        menu.addPrimoPiatto(new PrimoPiatto("Carbonara", 11.00));
        menu.addPrimoPiatto(new PrimoPiatto("Amatriciana", 10.00));
        menu.addPrimoPiatto(new PrimoPiatto("Lasagne al ragu", 6.00));
        menu.addPrimoPiatto(new PrimoPiatto("Boscaiola", 10.00));
        menu.addPrimoPiatto(new PrimoPiatto("Tagliatelle al ragu di maialino dei Nebrodi", 16.00));

        menu.addAntipasto(new Antipasti("Patatine fritte", 4.00));
        menu.addAntipasto(new Antipasti("Misto caldo", 6.00));
        menu.addAntipasto(new Antipasti("Bruschette al pomodoro", 5.00));
        menu.addAntipasto(new Antipasti("Tagliere di salumi e formaggi", 12.00));
        menu.addAntipasto(new Antipasti("Caponata", 5.50));

        menu.addSecondoPiatto(new SecondiPiatti("Tagliata", 22.00));
        menu.addSecondoPiatto(new SecondiPiatti("Bistecca", 25.00));
        menu.addSecondoPiatto(new SecondiPiatti("Coda alla vaccinara", 20.00));
        menu.addSecondoPiatto(new SecondiPiatti("Cotoletta alla milanese", 14.00));
        menu.addSecondoPiatto(new SecondiPiatti("Cotoletta alla bolognese", 16.00));

        menu.addBevanda(new Bevande("Acqua naturale", 2.00));
        menu.addBevanda(new Bevande("Acqua frizzante", 2.00));
        menu.addBevanda(new Bevande("Birra", 4.00));
        menu.addBevanda(new Bevande("Vino", 8.00));
        menu.addBevanda(new Bevande("CocaCola", 3.00));

        menu.addDolce(new Dolci("Pannacotta", 3.00));
        menu.addDolce(new Dolci("Baba", 4.00));
        menu.addDolce(new Dolci("Zeppole", 2.50));
        menu.addDolce(new Dolci("Pastiera", 5.00));
        menu.addDolce(new Dolci("Sfogliatella", 4.50));

        menu.printMenu();

    }
}