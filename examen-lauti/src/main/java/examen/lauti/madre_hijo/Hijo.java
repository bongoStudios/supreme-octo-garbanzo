package examen.lauti.madre_hijo;

public class Hijo extends Persona {

    private String escuela;
    private String juegoFavorito;

    public Hijo() {

        super();
        this.escuela = "Instistusto Polistecsniscos Modelos";
        this.juegoFavorito = "El Fortnite";
    }

    public Hijo(String newNombre, String newApellido, int newEdad, int newDNI, String newOcupacion, String newEmpresa, String newEscuela, String newJuegoFavorito) {
        
        super(newNombre, newApellido, newEdad, newDNI, newOcupacion);
        this.escuela = newEscuela;
        this.juegoFavorito = newJuegoFavorito;
    }
   
    public String getEscuela() {

        return this.escuela;
    }

    public void setEscuela(String newEscuela) {

        this.escuela = newEscuela;
    }

    public String getJuegoFavorito() {

        return this.juegoFavorito;
    }

    public void setJuegoFavorito(String newJuegoFavorito) {

        this.juegoFavorito = newJuegoFavorito;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(this.escuela);
        System.out.println(this.juegoFavorito);
    }

}