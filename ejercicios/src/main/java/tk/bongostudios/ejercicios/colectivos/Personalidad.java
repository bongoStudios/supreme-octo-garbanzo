package tk.bongostudios.ejercicios.colectivos;

public enum Personalidad {
    APURADO, CLAUSTROFOBICO, FIACA, MODERADO(5), OBSECUENTE(new Jefe(Personalidad.APURADO));

    private int lugaresLibres;
    private Jefe jefe;

    Personalidad() {}
    Personalidad(int minLibres) {
        lugaresLibres = minLibres;
    }
    Personalidad(Jefe jefe) {
        this.jefe = jefe;
    }

    public int getLugaresLibres() {
        return lugaresLibres;
    }

    public void setLugaresLibres(int lugaresLibres) {
        this.lugaresLibres = lugaresLibres;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }
}