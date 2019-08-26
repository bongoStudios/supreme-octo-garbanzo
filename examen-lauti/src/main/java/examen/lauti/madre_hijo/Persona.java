package examen.lauti.madre_hijo;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String ocupacion;


    public Persona() {
        
        this("Juanita", "Jormando", 27, 27772723, "Carpintera");
    }

    public Persona(String newNombre, String newApellido, int newEdad, int newDNI, String newOcupacion) {

        this.nombre = newNombre;
        this.apellido = newApellido;
        this.edad = newEdad;
        this.dni = newDNI;
        this.ocupacion = newOcupacion;
    }
    public String getNombre() {
        
        return this.nombre;
    }

    public void setNombre(String newNombre) {

        this.nombre = newNombre;
    }

    public String getApellido() {
        
        return this.nombre;
    }

    public void setApellido(String newNombre) {

        this.nombre = newNombre;
    }

    public int getEdad() {
        
        return this.edad;
    }

    public void setEdad(int newEdad) {

        this.edad = newEdad;
    }

    public int getDNI() {
        
        return this.dni;
    }

    public void setDNI(int newDNI) {

        this.dni = newDNI;
    }

    public String getOcupacion() {
        
        return this.ocupacion;
    }

    public void setOcupacion(String newOcupacion) {

        this.ocupacion = newOcupacion;
    }

    public Boolean mayorEdad() {

        if(this.edad > 17)
        return true;
        else return false;
    }

    public Boolean tieneA() {

        for(int i = 0; i < this.nombre.length(); i++) {
            if(this.nombre.charAt(i) == 'a') 
            return true;
        }
        return false;
    }

    public Boolean menorA38Millones() {
        if(this.dni < 38000000)
        return true;
        else return false;
    }

    public void mostrarDatos() {

        System.out.println(this.nombre);
        System.out.println(this.apellido);
        System.out.println(this.edad);
        System.out.println(this.dni);
        System.out.println(this.ocupacion);
    }
}



 