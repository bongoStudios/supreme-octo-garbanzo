package profesor;

import java.util.HashMap;

public class Profesor {

    HashMap<String, Materia> materias = new HashMap<String, Materia>();

    public HashMap<String, Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashMap<String, Materia> materias) {
        this.materias = materias;
    }
}