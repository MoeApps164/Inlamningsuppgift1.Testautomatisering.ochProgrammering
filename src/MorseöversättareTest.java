import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MorseöversättareTest {

    @Test
    void testEngelskaTillMorse_CAT() {
        Morseöversättare m = new Morseöversättare();
        String resultat = m.engelskatillMorse("CAT");
        assertEquals("-.-. .- -", resultat);
    }

    @Test
    void testEngelskaTillMorse_HELLO() {
        Morseöversättare m = new Morseöversättare();
        String resultat = m.engelskatillMorse("HELLO");
        assertEquals(".... . .-.. .-.. ---", resultat);
    }

    // Morse → engelska
    @Test
    void testMorseTillEngelska_DOG() {
        Morseöversättare m = new Morseöversättare();
        String resultat = m.morstillEngelska("-.. --- --.");
        assertEquals("DOG", resultat);
    }

    @Test
    void testMorseTillEngelska_HELLO() {
        Morseöversättare m = new Morseöversättare();
        String resultat = m.morstillEngelska(".... . .-.. .-.. ---");
        assertEquals("HELLO", resultat);
    }

    // Feltester
    @Test
    void testFelaktigtTeckenEngelskaTillMorse() {
        Morseöversättare m = new Morseöversättare();
        String resultat = m.engelskatillMorse("H3LLO"); // 3 är ogiltigt
        assertTrue(resultat.contains("Fel"));
    }

    @Test
    void testFelaktigMorsekod() {
        Morseöversättare m = new Morseöversättare();
        String resultat = m.morstillEngelska("..---.."); // finns ej i tabellen
        assertTrue(resultat.contains("Fel"));
    }
}
