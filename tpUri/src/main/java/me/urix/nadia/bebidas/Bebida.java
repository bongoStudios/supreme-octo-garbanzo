package me.urix.nadia.bebidas;

abstract public class Bebida {
    private String name;
    private int pos;
    private int neg;

    public Bebida(String name, int pos, int neg) {
        this.name = name;
        this.pos = pos;
        this.neg = neg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getNeg() {
        return neg;
    }

    public void setNeg(int neg) {
        this.neg = neg;
    }
}