package tk.bongostudios.ejercicios.colectivos;

public class Empleado {

    private Personalidad personalidad;

    Empleado(Personalidad personalidad) {
        this.personalidad = personalidad;
    }

    public boolean gustaColectivo(Micro micro) {
        switch(personalidad) {
            case APURADO:
                return true;
            case CLAUSTROFOBICO:
                return micro.getVolumen() > 120;
            case FIACA:
                return micro.getSillasLibres() > 0;
            case MODERADO:
                return micro.getParadosLibres() + micro.getSillasLibres() > personalidad.getLugaresLibres();
            case OBSECUENTE:
                return personalidad.getJefe().gustaColectivo(micro);
            default:
                return false;
        }
    }
}