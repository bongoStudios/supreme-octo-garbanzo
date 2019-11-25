package me.urix.nadia.bebidas;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private List<Bebida> queTomo = new ArrayList<Bebida>();

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public int getHidratacion() {
        int pos = 0;
        int neg = 0;
        for(Bebida bebida : queTomo) {
            pos += bebida.getPos();
            neg += bebida.getNeg();
        }
        return pos - neg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Bebida> getQueTomo() {
        return queTomo;
    }

    public void setQueTomo(List<Bebida> queTomo) {
        this.queTomo = queTomo;
    }
}