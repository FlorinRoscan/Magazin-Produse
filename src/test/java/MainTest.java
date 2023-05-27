import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

    @Test
    public void testMain() {
        Main main = new Main();
        Main.main(new String[] {});
    }

    @Test
    public void testProdus() {
        Produs produs = new Produs("Lapte", 2.5, 10);
        produs.vinde(5);
        assertEquals(5, produs.cantitate);
    }

    @Test
    public void testProdusAlimentar() {
        ProdusAlimentar produsAlimentar = new ProdusAlimentar("Branza", 5.0, 8, "2023-03-31");
        produsAlimentar.vinde(10);
        assertEquals(8, produsAlimentar.cantitate);
    }

    @Test
    public void testProdusElectronic() {
        ProdusElectronic produsElectronic = new ProdusElectronic("Telefon", 1200.0, 5, "Samsung");
        produsElectronic.vinde(1);
        assertEquals(4, produsElectronic.cantitate);
    }
}

