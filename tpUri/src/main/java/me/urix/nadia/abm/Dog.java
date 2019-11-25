package me.urix.nadia.abm;

public class Dog extends Pet {
    public Dog(String name, String owner) {
        super(name, owner, "guau");
    }

    @Override
    public String getType() {
        return "Dog";
    }
}