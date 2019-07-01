package habitacion;

public class Pantalla extends Television {

    public Pantalla(double kg, String mat, String color) {
        
        super();
        this.kg = kg;
        this.material = mat;
        this.color = color;
        this.nombre = "pantalla";
    }

    public Pantalla() {

        super();
        this.nombre = "pantalla";
    }
}