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