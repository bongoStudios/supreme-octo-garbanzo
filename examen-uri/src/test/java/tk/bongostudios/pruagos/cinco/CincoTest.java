package tk.bongostudios.pruagos.cinco;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CincoTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isAnAdultTest() {
        Persona persona = new Persona();
        assertTrue(persona.isAnAdult());
        persona.setEdad(17);
        assertFalse(persona.isAnAdult());
    }

    @Test
    public void empiezaConATest() {
        Persona persona = new Persona();
        assertFalse(persona.hasNameStartingWithA());
        persona.setNombre("Alejandra");
        assertTrue(persona.hasNameStartingWithA());
    }

    @Test
    public void abajoDe38Mil() {
        Persona persona = new Persona();
        assertTrue(persona.isBeneath38Mil());
        persona.setDni((int) 38e+6);
        assertFalse(persona.isBeneath38Mil());
    }
}
