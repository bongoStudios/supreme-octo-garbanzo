package tk.bongostudios.pruagos.six;

import tk.bongostudios.pruagos.cinco.Persona;

public class Hijo extends Persona {
    private String escuela;
    private String juegoFavorito;

    public Hijo() {
        super();
        this.escuela = "Santa Natalia nº21";
        this.juegoFavorito = "RPSLS";
    }

    public Hijo(String nombre, String apellido, int edad, int dni, boolean sex, String ocupacion, String escuela, String juegoFavorito) {
        super(nombre, apellido, edad, dni, sex, ocupacion);
        this.escuela = escuela;
        this.juegoFavorito = juegoFavorito;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Escuela: " + this.escuela);
        System.out.println("Juego Favorito: " + this.juegoFavorito);
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getJuegoFavorito() {
        return juegoFavorito;
    }

    public void setJuegoFavorito(String juegoFavorito) {
        this.juegoFavorito = juegoFavorito;
    }
}