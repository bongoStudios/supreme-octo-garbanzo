package me.urix.nadia.abm;

public class Fish extends Pet {
    private int lifes = 10;
    
    public Fish(String name, String owner) {
        super(name, owner, null);
    }

    @Override
    public void feed() {
        this.setLifes(this.getLifes() + 1);
    }

    @Override
    public String greet(String owner) throws Death {
        int lifes = this.getLifes();
        this.setLifes(lifes - 1);
        if(this.getLifes() < 0 || !this.getOwner().equals(owner)) {
            throw new Death();
        }
        return ".";
    }

    @Override
    public String getType() {
        return "Fish";
    }

    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }
}