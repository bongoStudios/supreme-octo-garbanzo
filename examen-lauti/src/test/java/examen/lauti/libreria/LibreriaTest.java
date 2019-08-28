package examen.lauti.libreria;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class LibreriaTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void masVendido() {

        Libro libro1 = new Libro("Coco y los caballeros de la luz zodiacal de Jesus", 125, Editorial.ATLANTIDA);
        Libro libro2 = new Libro("Ulises y Changa Changa la Canga de Wanga", 234, Editorial.ELATENEO);
        Libreria lib = new Libreria();
        lib.addVendidos(libro1);
        lib.addVendidos(libro2);
        lib.addVendidos(Editorial.ATLANTIDA, 1);
        assertEquals(lib.masVendido(), Editorial.ATLANTIDA);
    }
}
