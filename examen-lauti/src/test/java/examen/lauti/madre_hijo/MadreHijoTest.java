package examen.lauti.madre_hijo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class MadreHijoTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void test38M() {
        
        Persona juanito = new Persona();
        assertTrue(juanito.menorA38Millones());
    }

    @Test
    public void testMayorEdad() {

        Persona juanito = new Persona();
        assertTrue(juanito.mayorEdad());
    }

    @Test
    public void testA() {

        Persona jaunit = new Persona();
        assertTrue(jaunit.tieneA());
    }

    @Test
    public void testHijos() {

        Hijo awa = new Hijo("Juan", "Pol", 34, 23334524, "Plomero", "Ninguna", "Lego Legions");
        Hijo owo = new Hijo("Juana", "Pofla", 14, 68334524, "Estudiante", "Lama", "Lego Legions");
    }
}
