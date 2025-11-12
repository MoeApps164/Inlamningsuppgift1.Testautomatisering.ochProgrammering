import java.util.HashMap;
import java.util.Map;

public class Morseöversättare {

    private Map<String, String> engTillMorse = new HashMap<>();
    private Map<String, String> morseTillEng = new HashMap<>();

    public Morseöversättare() {

        engTillMorse.put("A", ".-");
        morseTillEng.put(".-", "A");

        engTillMorse.put("B", "-...");
        morseTillEng.put("-...", "B");

        engTillMorse.put("C", "-.-.");
        morseTillEng.put("-.-.", "C");

        engTillMorse.put("D", "-..");
        morseTillEng.put("-..", "D");

        engTillMorse.put("E", ".");
        morseTillEng.put(".", "E");

    }

    public String engelskatillMorse(String text) {

        return null;
    }

    public String morstillEngelska(String morseKod) {

        return null;
    }
}
