package tk.bongostudios.pruagos.nana;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> ventas = new ArrayList<Libro>();
    private Map<String,Integer> ventasDeEditorial = new HashMap<String,Integer>();

    public Libreria() {
        ventasDeEditorial.put("Atlantida", 0);
        ventasDeEditorial.put("ElAteneo", 0);
        ventasDeEditorial.put("Interzona", 0);
        ventasDeEditorial.put("Kapelusz", 0);
        ventasDeEditorial.put("Sudamericana", 0);
        ventasDeEditorial.put("SurYAlianza", 0);
    }

    public String calcularLibrosVendidos() {
        for(Libro libro : ventas) {
            int ventas = ventasDeEditorial.get(libro.getEditorial());
            ventasDeEditorial.put(libro.getEditorial(), ventas + 1);
        }
        Map.Entry<String, Integer> masVentas = null;
        for(Map.Entry<String, Integer> editorial : ventasDeEditorial.entrySet()) {
            if(masVentas == null) {
                masVentas = editorial;
                continue;    
            }
            if(editorial.getValue() > masVentas.getValue()) {
                masVentas = editorial;
            }
        }
        return masVentas.getKey();
    }

    public void addLibro(Libro libro) {
        this.ventas.add(libro);
    }

    public List<Libro> getLibros() {
        return ventas;
    }

    public void setLibros(List<Libro> ventas) {
        this.ventas = ventas;
    }

    public Map<String, Integer> getVentasDeEditorial() {
        return ventasDeEditorial;
    }

    public void setVentasDeEditorial(Map<String, Integer> ventasDeEditorial) {
        this.ventasDeEditorial = ventasDeEditorial;
    }

    
}