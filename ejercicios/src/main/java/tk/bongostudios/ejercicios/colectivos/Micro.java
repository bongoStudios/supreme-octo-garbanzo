package tk.bongostudios.ejercicios.colectivos;

import java.util.ArrayList;
import java.util.List;

public class Micro {

    private int sillasLibres;
    private int paradosLibres;
    private int volumen;
    private List<Empleado> pasajeros = new ArrayList<Empleado>();

    Micro(int sillas, int parados, int volumen) {
        this.sillasLibres = sillas;
        this.paradosLibres = parados;
        this.volumen = volumen;
    }

    public int getSillasLibres() {
        return sillasLibres;
    }

    public void setSillasLibres(int sillasLibres) {
        this.sillasLibres = sillasLibres;
    }

    public int getParadosLibres() {
        return paradosLibres;
    }

    public void setParadosLibres(int paradosLibres) {
        this.paradosLibres = paradosLibres;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void addPasajero(Empleado pasajero) {
        this.pasajeros.add(pasajero);
    }

    public List<Empleado> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Empleado> pasajeros) {
        this.pasajeros = pasajeros;
    }
}