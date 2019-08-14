package tk.bongostudios.ejercicios.colectivos;

public class Jefe extends Empleado {

    Jefe(Personalidad personalidad) {
        super(personalidad);
        if(personalidad == Personalidad.OBSECUENTE) throw new Error("Jefe no puede tener obsecuente");
    }

}