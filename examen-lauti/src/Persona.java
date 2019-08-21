public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String ocupacion;


    public Persona() {
        
        this.nombre = "Juansito";
        this.apellido = "Jormando";
        this.edad = 35;
        this.dni = 27772723;
        this.ocupacion = "Carpintero";
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

public class Madre extends Persona {

    private String empresa;
    private HashSet<Hijo> hijos = new HashSet<Hijo>();

    public Madre() {

        this.nombre = "Juanita";
        this.apellido = "Jarageza";
        this.edad = 18;
        this.dni = 34666666;
        this.ocupacion = "Estudiante";
        this.empresa = "Escuela Numero 22 de Cdad. de Bs. As.";

    }

    public Madre(String newNombre, String newApellido, int newEdad, int newDNI, String newOcupacion, String newEmpresa) {

        this.nombre = newNombre;
        this.apellido = newApellido;
        this.edad = newEdad;
        this.dni = newDNI;
        this.ocupacion = newOcupacion;
        this.empresa = newEmpresa;
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
    
    public String getEmpresa() {

        return this.empresa;
    }

    public void setEmpresa(String newEmpresa) {

        this.empresa = newEmpresa;
    }

    public HashSet<Hijo> getHijos() {

        return this.hijos;
    }

    public void setHijos(HashSet<Hijo> newHijos) {

        this.hijos = newHijos;
    }

    public HashSet<Hijo> hijosMenoresDeEdad() {
        HashSet<Hijo> menoresDeEdad = new HashSet<Hijo>();
        for(Hijo i : hijos) {
            if(!i.mayorEdad()) {
                menoresDeEdad.add(i);
            }
        }
        return menoresDeEdad;
    }

    public void mostrarDatos() {
        
        System.out.println(this.nombre);
        System.out.println(this.apellido);
        System.out.println(this.edad);
        System.out.println(this.dni);
        System.out.println(this.ocupacion);
        System.out.println(this.empresa);
        System.out.println(this.hijos.lenght());
    }
}

public class Hijo extends Persona {

    private String escuela;
    private String juegoFavorito;
}
 