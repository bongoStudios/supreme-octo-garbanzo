package proyecto.ej2;

public class Perro extends MascotaNueva {

    private String raza;

    public Perro() {

        super();
        this.raza = "";
    }

    public Perro(String newNombre, String newDueno, int newDia, int newMes, int newAno, String newRaza) {

        super(newNombre, newDueno, newDia, newMes, newAno);
        this.raza = newRaza;
    }

    public String getRaza() {

        return raza;
    }

    public void setRaza(String newRaza) {

        this.raza = newRaza;
    }

    public int es() {

        return 2;
    }
}
