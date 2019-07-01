package bicicleta;

public class MountainBike extends Bicicleta {

    private int cambios;

    public MountainBike(String c, String m) {

        super(c, m);
        this.cambios = 7;
    }

    public MountainBike(String c, String m, int cm) {

        super(c, m);
        this.cambios = cm;
    }

    public void imprimirAtributos() {
        
        super.imprimirAtributos();
        System.out.println("Tambien posee " + cambios + " diferentes cambios.");
    }
}