package tk.bongostudios.pruagos.six;

import java.util.Set;
import java.util.HashSet;
import tk.bongostudios.pruagos.cinco.Persona;

public class Madre extends Persona {
    private String empresa;
    private Set<Hijo> hijos = new HashSet<Hijo>();

    public Madre() {
        super();
        this.empresa = "Natiala S.A";
        this.hijos.add(new Hijo());
    }

    public Madre(String nombre, String apellido, int edad, int dni, boolean sex, String ocupacion, String empresa, Hijo hijo) {
        super(nombre, apellido, edad, dni, sex, ocupacion);
        this.empresa = empresa;
        this.hijos.add(hijo);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Empresa: " + this.empresa);
        System.out.println("Hijos:");
        for(Hijo hijo : hijos) {
            hijo.printInfo();
        }
    }

    public Set<Hijo> getHijosMenoresDeEdad() {
        Set<Hijo> menores = new HashSet<Hijo>();
        for(Hijo hijo : hijos) {
            if(!hijo.isAnAdult()) menores.add(hijo);
        }
        return menores;
    }

    public void addHijo(Hijo hijo) {
        hijos.add(hijo);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Set<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(Set<Hijo> hijos) {
        this.hijos = hijos;
    }
}