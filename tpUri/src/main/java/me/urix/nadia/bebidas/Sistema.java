package me.urix.nadia.bebidas;

import java.util.ArrayList;
import java.util.List;

public final class Sistema {
    public static List<Persona> personas = new ArrayList<Persona>();
    private Sistema() {}

    public static Persona getMejorPersona() {
        Persona mejor = personas.get(0);
        for(Persona per : personas) {
            if(per.getHidratacion() > mejor.getHidratacion()) {
                mejor = per;
            }
        }
        return mejor;
    }

    public static Persona getPeorPersona() {
        Persona peor = personas.get(0);
        for(Persona per : personas) {
            if(per.getHidratacion() < peor.getHidratacion()) {
                peor = per;
            }
        }
        return peor;
    }

    public static List<Persona> getPersonas() {
        return personas;
    }

    public static void setPersonas(List<Persona> personas) {
        Sistema.personas = personas;
    }
}