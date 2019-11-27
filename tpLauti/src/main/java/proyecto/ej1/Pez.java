package proyecto.ej1;

public class Pez extends Mascota {

    private int vidas = 10;

    public Pez(String newNombre, String newDueno) {
        
        super(newNombre, newDueno);
    }



    public void saludar(String saludante) throws Murio {

        if(saludante.equals(this.getDueno())) 
        this.vidas = vidas - 1;
        else
        this.vidas = 0;
        
        if(this.vidas < 0) {
            System.out.println("murio!");
            throw new Murio();
        } else {
            System.out.println("...");
        }
    }
    
    public void alimentar() {

        this.vidas++;
    }

    

    public int getVidas() {

        return vidas;
    }

    public void setVidas(int vidas) {

        this.vidas = vidas;
    }

    public String es() {
        
        return "pez";
    }

}