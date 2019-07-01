package habitacion;

public class Laptop extends Computadora {

    public Laptop(double kg, String mat, String color) {
        
        super();
        this.kg = kg;
        this.material = mat;
        this.color = color;
        this.nombre = "laptop";
    }

    public Laptop() {

        super();
        this.nombre = "laptop";
    }
}