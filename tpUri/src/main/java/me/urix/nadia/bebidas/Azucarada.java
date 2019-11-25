package me.urix.nadia.bebidas;

public class Azucarada extends Bebida {
    private int azucar;

    public Azucarada(String name, int azucar) {
        super(name, 1, azucar*10);
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }
}