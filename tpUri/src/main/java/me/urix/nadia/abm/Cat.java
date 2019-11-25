package me.urix.nadia.abm;

public class Cat extends Pet {
    public Cat(String name, String owner) {
        super(name, owner, "meow");
    }

    @Override
    public String getType() {
        return "Cat";
    }
}