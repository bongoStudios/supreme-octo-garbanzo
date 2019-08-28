package examen.lauti.libreria;

import java.util.HashMap;

public class Libreria {

    private HashMap<Editorial, Integer> vendidos = new HashMap<Editorial, Integer>();

    public Libreria() {
        for(Editorial value : Editorial.values()) {
            vendidos.put(value, 0);
        }
    }

    public Libreria(int... values) {
        if(values.length != Editorial.values().length) {
            throw new Error();
        }
        Editorial[] editoriales = Editorial.values();
        for(int i = 0; i < values.length; i++) {
            vendidos.put(editoriales[i], values[i]);
        }

    }

    public HashMap<Editorial, Integer> getVendidos() {
        return vendidos;
    }

    public void setVendidos(HashMap<Editorial, Integer> vendidos) {
        this.vendidos = vendidos;
    }

    public void addVendidos(Editorial newEditorial, int quantityAdded) {

        this.vendidos.put(newEditorial, vendidos.get(newEditorial) + quantityAdded);
    }

    public void addVendidos(Libro newLibro) {

        this.addVendidos(newLibro.getEditorial(), 1);
    }

    public Editorial masVendido() {

        Editorial[] editoriales = Editorial.values();
        Editorial masVendida = editoriales[0];
        for(int i = 1; i < editoriales.length; i++) {
            if(this.vendidos.get(masVendida) < this.vendidos.get(editoriales[i])) {

                masVendida = editoriales[i];
            }
        }
        System.out.println(masVendida.getNombre() + " con " + this.vendidos.get(masVendida) + " ventas");
        return masVendida;
    }

    public void vendidoToday() {

        System.out.println("Libros Vendidos:");
        this.vendidos.forEach((key, value) -> {
            System.out.println(key.getNombre() + " ha vendido " + value + " copias.");
        });
    }
}