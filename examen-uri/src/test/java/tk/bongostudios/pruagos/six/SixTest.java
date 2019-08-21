package tk.bongostudios.pruagos.six;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SixTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getHijosMenoresTest() {
        Madre madre = new Madre();
        Hijo hijo2 = new Hijo();
        madre.addHijo(hijo2);
        assertFalse(madre.getHijosMenoresDeEdad().contains(hijo2));
        Hijo hijo = new Hijo();
        hijo.setEdad(16);
        madre.addHijo(hijo);
        assertTrue(madre.getHijosMenoresDeEdad().contains(hijo));
    }
}
