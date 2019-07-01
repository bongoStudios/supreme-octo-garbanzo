package habitacion;
import java.util.ArrayList;

public class Habitacion {

    ArrayList<Mueble> muebles = new ArrayList<Mueble>();

    public void addMueble(Mueble newMueble) {
        
        this.muebles.add(newMueble);
    }

    public void addMueble(String tipo, double peso, String color, String material) {

        switch(tipo) {
           
            case "silla":
                this.muebles.add(new Silla(color, peso, material));
                break;

            case "cuadro":
                this.muebles.add(new Silla(color, peso, material));
                break;

            case "mesa":
                this. muebles.add(new Mesa(color, peso, material));
                break;

            case "escritorio":
                this.muebles.add(new Escritorio(color, peso, material));
                break;
            
            case "decoracion":
                this.muebles.add(new Decoracion(color, peso, material));
                break;

            case "lampara":
                this.muebles.add(new Lampara(color, peso, material));
                break;

            case "computadora":
                this.muebles.add(new Computadora(color, peso, material));
                break;

            case "television":
                this.muebles.add(new Television(color, peso, material));
                break;

            case "cajon":
                this.muebles.add(new Cajon(color, peso, material));
                break;

            default:
                System.out.println("Tipo de mueble invalido.");

        }
       
        
    }

    public void main(String[] args) {

        Habitacion x = new Habitacion();
        x.addMueble(silla, 3.04, blanco, plastico);
    }
}