package proyecto.ej1;

public class Pajarito extends MascotaMasComunicativa {

    public Pajarito() {
        
        super("", "", "pio");
    }
    
    
    public Pajarito(String newNombre, String newDueno, String newCanto) {

        super(newNombre, newDueno, newCanto);
        
        
    }

    public Pajarito(String newNombre, String newDueno) {

        super(newNombre, newDueno, "pio");
    }

    public void saludar(String saludante) {

        if(saludante.equals(this.getDueno()))
        System.out.println(this.getSaludo());
        else System.out.println(".....");
    }

    public String es() {
        
        return "pajaro";
    }

}