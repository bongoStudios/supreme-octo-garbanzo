import org.junit.Test;
import static org.junit.Assert.*;

import proyecto.ej1.*;
import proyecto.ej1.Gato;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testAlegria() {

        proyecto.ej1.Gato coco = new Gato("coco", "yo");
        coco.saludar("yo");
        coco.saludar("yo");
        coco.alimentar();
        assertEquals(2, coco.getAlegria());
    }

    @Test
    public void testMoricion() {

        Pez chale = new Pez("Chale", "yo");
        try {
            chale.saludar("definitivamente no yo");


        } catch(Murio e){

            assertTrue(true);
        }
    }
}
