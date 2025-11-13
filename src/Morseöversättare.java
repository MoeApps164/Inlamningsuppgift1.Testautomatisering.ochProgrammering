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

        engTillMorse.put("F", "..-.");
        morseTillEng.put("..-.", "F");

        engTillMorse.put("G", "--.");
        morseTillEng.put("--.", "G");

        engTillMorse.put("H", "....");
        morseTillEng.put("....", "H");

        engTillMorse.put("I", "..");
        morseTillEng.put("..", "I");

        engTillMorse.put("J", ".---");
        morseTillEng.put(".---", "J");

        engTillMorse.put("K", "-.-");
        morseTillEng.put("-.-", "K");

        engTillMorse.put("L", ".-..");
        morseTillEng.put(".-..", "L");

        engTillMorse.put("M", "--");
        morseTillEng.put("--", "M");

        engTillMorse.put("N", "-.");
        morseTillEng.put("-.", "N");

        engTillMorse.put("O", "---");
        morseTillEng.put("---", "O");

    }

    public String engelskatillMorse(String text) {

        return null;
    }

    public String morstillEngelska(String morseKod) {

        return null;
    }
}
