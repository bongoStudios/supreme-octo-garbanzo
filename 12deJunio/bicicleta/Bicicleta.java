package bicicleta;

public class Bicicleta {

    private String color;
    private String material;

    public Bicicleta(String c, String m) {

        this.color = c;
        this.material = m;
    }

    public Bicicleta() {
   
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

    public void imprimirAtributos() {

        System.out.println("La bicicleta es de color " + this.color + ".");
        System.out.println("Esta hecha de " + this.material + ".");
    }
}