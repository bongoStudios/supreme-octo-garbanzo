package habitacion;

public class Silla extends Mueble {

    protected String nombre = "silla";

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