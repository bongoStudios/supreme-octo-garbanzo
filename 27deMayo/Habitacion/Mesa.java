package habitacion;

public class Mesa extends Mueble {

    protected String nombre = "mesa";
    
    public Mesa(double kg, String color, String material) {

        this.kg = kg;
        this.color = color;
        this.material = material;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}