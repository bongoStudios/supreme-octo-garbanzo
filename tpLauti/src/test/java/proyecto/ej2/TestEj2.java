package proyecto.ej2;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestEj2 {


    @Test
    public void testCheckAsistenciaPerfecta() {

        ArrayList<MascotaNueva> array = new ArrayList<MascotaNueva>();
        array.add(new Perro("jorge", "yo", 1, 2, 2018, "husky"));
        array.get(0).visitas.add(new Fecha(3, 4, 2018));
        array.get(0).visitas.add(new Fecha(1, 3, 2018));
        array.get(0).visitas.add(new Fecha(3, 1, 2018));
        array.get(0).visitas.add(new Fecha(4, 1, 2018));
        array.get(0).visitas.add(new Fecha(1, 1, 2019));
        array.get(0).visitas.add(new Fecha(1, 9, 2019));
        array.get(0).visitas.add(new Fecha(1, 4, 2019));
        array.get(0).visitas.add(new Fecha(1, 3, 2019));
        assertTrue(Main.checkAsistenciaPerfecta(array.get(0)));
    }

    @Test
    public void testRazasQueNoCumplieron() {

        ArrayList<MascotaNueva> array = new ArrayList<MascotaNueva>();
        array.add(new Perro("jorge", "yo", 1, 2, 2018, "husky"));
        array.get(0).visitas.add(new Fecha(3, 4, 2018));
        array.get(0).visitas.add(new Fecha(1, 3, 2018));
        array.get(0).visitas.add(new Fecha(3, 1, 2018));
        array.get(0).visitas.add(new Fecha(4, 1, 2018));
        array.get(0).visitas.add(new Fecha(1, 1, 2019));
        array.get(0).visitas.add(new Fecha(1, 9, 2019));
        array.get(0).visitas.add(new Fecha(1, 4, 2019));
        array.get(0).visitas.add(new Fecha(1, 3, 2019));
        array.add(new Perro("cacha", "yo", 7, 2, 2010, "terrier"));
        array.add(new Perro("cacha2", "yo", 9, 2, 2010, "terrier"));
        ArrayList<String> o = Main.razasQueNoCumplieron(array);
        if(o.contains("husky")) {
            if(o.contains("terrier")) {
                assertTrue((o.size() == 2));
            }
        }
    }

    @Test
    public void testCheckVisitasObligatorias() {

        ArrayList<MascotaNueva> array = new ArrayList<MascotaNueva>();
        array.add(new Perro("jorge", "yo", 1, 2, 2018, "husky"));
        array.get(0).visitas.add(new Fecha(3, 4, 2018));
        array.get(0).visitas.add(new Fecha(1, 3, 2018));
        array.get(0).visitas.add(new Fecha(3, 1, 2018));
        array.get(0).visitas.add(new Fecha(4, 1, 2018));
        array.get(0).visitas.add(new Fecha(1, 1, 2019));
        array.get(0).visitas.add(new Fecha(1, 9, 2019));
        array.get(0).visitas.add(new Fecha(1, 4, 2019));
        array.get(0).visitas.add(new Fecha(1, 3, 2019));
        assertTrue(Main.checkVisitasObligatorias(array.get(0)));
    }



}
