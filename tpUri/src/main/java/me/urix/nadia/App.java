package me.urix.nadia;

import me.urix.nadia.abm.ABM;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        ABM.run();
    }
}
