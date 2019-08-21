package tk.bongostudios.pruagos.nana;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class NanaTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void ventasTest() {
        Libreria lib = new Libreria();
        lib.addLibro(new Libro());
        assertTrue(lib.calcularLibrosVendidos() == "Kapelusz");
    }
}
