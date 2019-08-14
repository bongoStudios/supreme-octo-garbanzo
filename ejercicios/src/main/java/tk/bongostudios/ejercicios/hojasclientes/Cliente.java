package tk.bongostudios.ejercicios.hojasclientes;

import java.util.HashMap;

public class Cliente {

    private Cuaderno cuaderno;

    public Cliente(Cuaderno oldCuaderno) {
    
        this.cuaderno = oldCuaderno;
    }

    public Cuaderno getCuaderno() {
    
        return cuaderno;
    }
}