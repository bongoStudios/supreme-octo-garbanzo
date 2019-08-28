package examen.lauti.libreria;

public class Libro {

    private String nombre;
    private double precio;
    private Editorial editorial;


    public Libro() {

        this.nombre = "Science for BRUHmmies";
        this.precio = 478;
        this.editorial = Editorial.KAPELUSZ;
    }

    public Libro(String newNombre, double newPrecio, Editorial newEditorial) {

        this.nombre = newNombre;
        this.precio = newPrecio;
        this.editorial = newEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    
    
}