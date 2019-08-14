package tk.bongostudios.ejercicios.hojasclientes;

public enum Cuaderno {

    chico(24, 50),
    mediano(48, 100),
    grande(98, 150);

    private int hojas;
    private int precio;

    private Cuaderno(int newHojas, int newPrecio) {

        this.precio = precio;
        this.hojas = hojas;
    }
    public int getNumHojas() {

        return hojas;
    }

    public int getPrecio() {

        return precio;
    }
}