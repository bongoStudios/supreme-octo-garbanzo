package tk.bongostudios.pruagos.cinco;


public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int dni;
    protected boolean sex;
    protected String ocupacion;

    public Persona() {
        this("Natalia", "Natalia", 100, 100001, true, "Esclavo de si mismo");
    }

    public Persona(String nombre, String apellido, int edad, int dni, boolean sex, String ocupacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.sex = sex;
        this.ocupacion = ocupacion;
    }

    public boolean isAnAdult() {
        return this.edad > 17;
    }

    public boolean hasNameStartingWithA() {
        return this.nombre.toLowerCase().startsWith("a");
    }

    public boolean isBeneath38Mil() {
        return this.dni < 38e+6;
    }

    public void printInfo() {
        System.out.println(String.format("Nombre: %s\nApellido: %s", this.nombre, this.apellido));
        System.out.println("Edad: " + this.edad);
        System.out.println("Sexo: " + (this.sex ? "Hombre" : "Mujer"));
        System.out.println("Ocupacion: " + this.ocupacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}