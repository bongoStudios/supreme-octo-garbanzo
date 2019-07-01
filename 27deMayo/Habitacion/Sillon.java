package habitacion;

public class Sillon extends Silla {

    public Sillon(double kg, String mat, String color) {
        
        super();
        this.kg = kg;
        this.material = mat;
        this.color = color;
        this.nombre = "sillon";
    }

    public Sillon() {

        super();
        this.nombre = "sillon";
    }
}