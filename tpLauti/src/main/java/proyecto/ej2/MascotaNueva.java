package proyecto.ej2;

import java.util.ArrayList;

public abstract class MascotaNueva {

    private Fecha nac;
    private String nombre;
    private String dueno;
    public ArrayList<Fecha> visitas = new ArrayList<Fecha>();


    public MascotaNueva() {

        nac = new Fecha();
        nombre = "";
        dueno = "";
    }

    public MascotaNueva(String newNombre, String newDueno, int newDia, int newMes, int newAno) {

        this.nombre = newNombre;
        this.dueno = newDueno;
        this.nac = new Fecha(newDia, newMes, newAno);

    }

    public Fecha getNac() {

        return nac;
    }

    public void setNac(Fecha newNac) {

        this.nac = newNac;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String newNombre) {

        this.nombre = newNombre;
    }

    public String getDueno() {

        return dueno;
    }

    public void setDueno(String newDueno) {

        this.dueno = newDueno;
    }

    public abstract int es();
    public String getRaza(){

        return "";
    }

    
}
