package proyecto.ej1;

public abstract class MascotaMasComunicativa extends Mascota {

    private String saludo;
    private int alegria; 

    public MascotaMasComunicativa(String newNombre, String newDueno, String newSaludo) {

        super(newNombre, newDueno);
        this.saludo = newSaludo;
        this.setAlegria(3);
    }

    public MascotaMasComunicativa(String newSaludo) {

        super("", "");
        this.saludo = newSaludo;
        this.setAlegria(3);
        
    }

    public void alimentar() {

        this.alegria++;
    }

    public String getSaludo() {

        return saludo;
    }

    public void setSaludo(String saludo) {
        
        this.saludo = saludo;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public void saludar(String saludante) {

        if(alegria < 1) {
            System.out.println("");
            return;
        }
        String salu = this.getSaludo();
        for(int i = 1; i < this.alegria; i++) salu += " " + this.getSaludo();
 
        if(saludante.equals(this.getDueno()))
        System.out.println(salu);
        else System.out.println(salu.toUpperCase());
        if(alegria > 1)
            alegria--;
    }

    public abstract String es();

}