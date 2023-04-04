package src;

public class Menu {
    private String menu;
    private String chef;
    private String tipoMenu;

    public Menu(String menu, String chef, String tipoMenu) {
        this.menu = menu;
        this.chef = chef;
        this.tipoMenu = tipoMenu;
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
