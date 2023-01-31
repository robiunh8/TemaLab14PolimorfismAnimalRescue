package AnimalRescue;

public class AnimalRescuer {
    private String nameofAdopter;
    private int moneyforanimal;

    public String getNameofAdopter() {
        return nameofAdopter;
    }

    public void setNameofAdopter(String nameofAdopter) {
        this.nameofAdopter = nameofAdopter;
    }

    public int getMoneyforanimal() {
        return moneyforanimal;
    }

    public void setMoneyforanimal(int moneyforanimal) {
        this.moneyforanimal = moneyforanimal;
    }

    public void likes(){
        System.out.println("I like animals");
    }
}

