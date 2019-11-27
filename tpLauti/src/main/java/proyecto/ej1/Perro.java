package proyecto.ej1;

public class Perro extends MascotaMasComunicativa {

    

    public Perro() {
        
        super("guau");;
    }

    public Perro(String newNombre, String newDueno) {
        
        super(newNombre, newDueno, "guau");
    }

    public String es() {
        
        return "perro";
    }

}