//Test Driven Development
//Tester klassen "LoenKonto"

package dk.n4;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoenKontoTest {

    @Test
    public void setSaldo() throws Exception {
        LoenKonto konto = new LoenKonto();
        konto.setSaldo(100);
        Boolean erKontoiMinus;
        if (konto.getSaldo() >= 0) { erKontoiMinus = false;}
        else { erKontoiMinus = true; }
        assertFalse("Kontoen må ikke være i minus!", erKontoiMinus);
    }

}
