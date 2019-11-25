package me.urix.nadia.abm;

public class Bird extends Pet {
    
    public Bird(String name, String owner) {
        super(name, owner, "pio");
    }

    public Bird(String name, String owner, String singing) {
        super(name, owner, singing);
    }

    @Override
    public String greet(String owner) {
        int happiness = this.getHappiness();
        if(happiness < 1 || this.getOwner() != owner) return "...";
        String greetings = this.getGreetings();
        for(int i = 1; i < happiness; i++) {
            greetings = greetings + " " + this.getGreetings();
        }
        this.setHappiness(happiness - 1);
        return greetings; 
    }

    @Override
    public String getType() {
        return "Bird";
    }
}