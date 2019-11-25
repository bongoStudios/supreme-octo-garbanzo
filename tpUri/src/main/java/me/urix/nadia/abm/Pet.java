package me.urix.nadia.abm;

abstract public class Pet {
    private String name;
    private String owner;
    private String greetings;
    private int happiness = 3;

    public Pet(String name, String owner, String greetings) {
        this.name = name;
        this.owner = owner;
        this.greetings = greetings;
    }

    public String greet(String owner) throws Death {
        int happiness = this.getHappiness();
        if(happiness < 1) {
            return ".";
        }
        String greetings = this.greetings;
        for(int i = 1; i < happiness; i++) {
            greetings = greetings + " " + this.greetings;
        }
        this.setHappiness(happiness - 1);
        if(this.getOwner().equals(owner)) {
            return greetings;
        } else {
            return greetings.toUpperCase() + "!"; 
        }
    }

    public void feed() {
        this.setHappiness(this.getHappiness() + 1);
    }

    public String getType() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}