package proyecto.ej1;

public class Gato extends MascotaMasComunicativa {  

    public Gato() {

        super("", "", "miau");
    }

    public Gato(String newNombre, String newDueno) {

        super(newNombre, newDueno, "miau");
    }
    
    @Override
    public String es() {
        
        return "gato";
    }

}