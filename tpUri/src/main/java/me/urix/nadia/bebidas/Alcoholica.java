package me.urix.nadia.bebidas;

public class Alcoholica extends Bebida {
    private int alcohol;

    public Alcoholica(String name, int alcohol) {
        super(name, 0, alcohol*20);
    }

    public int getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
    }
}