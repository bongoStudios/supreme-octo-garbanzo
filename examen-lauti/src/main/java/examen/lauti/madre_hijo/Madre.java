package examen.lauti.madre_hijo;

import java.util.HashSet;

public class Madre extends Persona {

    private String empresa;
    private HashSet<Hijo> hijos = new HashSet<Hijo>();

    public Madre() {
        super();
        this.empresa = "Escuela Numero 22 de Cdad. de Bs. As.";

    }

    public Madre(String newNombre, String newApellido, int newEdad, int newDNI, String newOcupacion, String newEmpresa) {
        super(newNombre, newApellido, newEdad, newDNI, newOcupacion);
        this.empresa = newEmpresa;
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

    public void addHijo(Hijo newHijo) {

        this.hijos.add(newHijo);
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

    @Override
    public void mostrarDatos() {
        
        super.mostrarDatos();
        System.out.println("Hijos: " + this.hijos.size());
        
        for(Hijo currentHijo : hijos) {

            System.out.println(currentHijo.getNombre());
        }
    }
}