package src;

import java.util.ArrayList;

public class Menu {
    private String menu;
    private String chef;
    private String tipoMenu;

    private ArrayList<src.Antipasti> antipastiList;

    //TODO ognuno di voi dovrà aggiungere una lista con metodi add e remove e un metodo printMenu per stampare
    // tutte le portate quindi un for su ogni lista

    public Menu(String menu, String chef, String tipoMenu) {
        this.menu = menu;
        this.chef = chef;
        this.tipoMenu = tipoMenu;
        this.antipastiList = new ArrayList<>();
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


}
