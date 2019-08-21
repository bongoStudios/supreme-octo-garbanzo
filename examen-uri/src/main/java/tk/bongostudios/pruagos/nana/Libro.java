package tk.bongostudios.pruagos.nana;

public class Libro {
    private String editorial;
    private int precio;

    public Libro() {
        this.editorial = "Kapelusz";
        this.precio = 100;
    }

    public Libro(String editorial, int precio) {
        this.editorial = editorial;
        this.precio = precio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}