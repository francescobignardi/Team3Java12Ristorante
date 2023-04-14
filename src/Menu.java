

import java.util.ArrayList;

public class Menu {

    //TODO nome
    private String menu;
    private String chef;

    //TODO questo diventa un enum : tipoEnum
    private String tipoMenu;

    private ArrayList<Antipasti> antipastiList;
    private ArrayList<PrimoPiatto> primiPiattiList;
    private ArrayList<SecondiPiatti> secondiPiattiList;
    private ArrayList<Dolci> dolciList;
    private ArrayList<Bevande> bevandeList;

    //TODO ognuno di voi dovrà aggiungere una lista con metodi add e remove e un metodo printMenu per stampare
    // tutte le portate quindi un for su ogni lista

    public Menu(String menu, String chef, String tipoMenu) {
        this.menu = menu;
        this.chef = chef;
        this.tipoMenu = tipoMenu;
        this.antipastiList = new ArrayList<>();
        this.primiPiattiList = new ArrayList<>();
        this.secondiPiattiList = new ArrayList<>();
        this.bevandeList = new ArrayList<>();
        this.dolciList = new ArrayList<>();
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getChef() {
        return chef;
    }


    public void setChef(String chef) {
        this.chef = chef;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public void printMenu() {
        for (Antipasti antipasti : antipastiList) {
            antipasti.print();
        }
        for (PrimoPiatto primoPiatto : primiPiattiList) {
            System.out.println(primoPiatto);
        }
        for (SecondiPiatti secondiPiatti : secondiPiattiList) {
            System.out.println(secondiPiatti);
        }
        for (Dolci dolci : dolciList) {
            System.out.println(dolci);
        }
        for (Bevande bevande : bevandeList) {
            System.out.println(bevande);
        }
    }

    public void addAntipasto(Antipasti antipasto) {
        antipastiList.add(antipasto);
    }

    public void removeAntipasto(Antipasti antipasto) {
        antipastiList.remove(antipasto);
    }

    public void addPrimoPiatto(PrimoPiatto primoPiatto) {
        primiPiattiList.add(primoPiatto);
    }

    public void removePrimoPiatto(PrimoPiatto primoPiatto) {
        primiPiattiList.remove(primoPiatto);
    }

    public void addSecondoPiatto(SecondiPiatti secondoPiatto) {
        secondiPiattiList.add(secondoPiatto);
    }

    public void removeSecondoPiatto(SecondiPiatti secondoPiatto) {
        secondiPiattiList.remove(secondoPiatto);
    }

    public void addDolce(Dolci dolce) {
        dolciList.add(dolce);
    }

    public void removeDolce(Dolci dolce) {
        dolciList.remove(dolce);
    }

    public void addBevanda(Bevande bevanda) {
        bevandeList.add(bevanda);
    }

    public void removeBevanda(Bevande bevanda) {
        bevandeList.remove(bevanda);
    }

    //TODO stesse minacce  :)
    @Override
    public String toString() {
        return "Menu{" +
                "antipastiList=" + antipastiList +
                ", primiPiattiList=" + primiPiattiList +
                ", secondiPiattiList=" + secondiPiattiList +
                ", dolciList=" + dolciList +
                ", bevandeList=" + bevandeList +
                '}';
    }
}
