package bicicleta;

public class Playera extends Bicicleta {

    private String diseno;

    public Playera(String c, String m, String d) {

        super(c, m);
        this.diseno = d;
    }

    public Playera(String c, String m) {

        super(c, m);
        this.diseno = "flores";
    }

    public void imprimirAtributos() {

        super.imprimirAtributos();
        System.out.println("Y tiene disenio de " + diseno);
    }
}