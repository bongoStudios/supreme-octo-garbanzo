package proyecto.ej2;

public class Gato extends MascotaNueva {

    private String raza;

    public Gato() {

        super();
        this.raza = "";
    }

    public Gato(String newNombre, String newDueno, int newDia, int newMes, int newAno, String newRaza) {

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

        return 1;
    }
}