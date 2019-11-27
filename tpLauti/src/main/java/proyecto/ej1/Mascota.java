package proyecto.ej1;

public abstract class Mascota {

    private String nombre;
    private String dueno;
    

    public Mascota(String newNombre, String newDueno) {

        this.nombre = newNombre;
        this.dueno = newDueno;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
    
    public abstract String es();

    public abstract void saludar(String saludante) throws Murio;

    public abstract void alimentar();

    

    
}