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

        engTillMorse.put("P", ".--.");
        morseTillEng.put(".--.", "P");

        engTillMorse.put("Q", "--.-");
        morseTillEng.put("--.-", "Q");

        engTillMorse.put("R", ".-.");
        morseTillEng.put(".-.", "R");

        engTillMorse.put("S", "...");
        morseTillEng.put("...", "S");

        engTillMorse.put("T", "-");
        morseTillEng.put("-", "T");

        engTillMorse.put("U", "..-");
        morseTillEng.put("..-", "U");

        engTillMorse.put("V", "...-");
        morseTillEng.put("...-", "V");

        engTillMorse.put("W", ".--");
        morseTillEng.put(".--", "W");

        engTillMorse.put("X", "-..-");
        morseTillEng.put("-..-", "X");

        engTillMorse.put("Y", "-.--");
        morseTillEng.put("-.--", "Y");

        engTillMorse.put("Z", "--..");
        morseTillEng.put("--..", "Z");

    }

    public String engelskatillMorse(String text) {
        StringBuilder resultatText = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {
            char bokstav = text.charAt(i);


            String bokstavSomText = String.valueOf(bokstav).toUpperCase();


            String morsekod = engTillMorse.get(bokstavSomText);


            if (morsekod == null) {
                return "Fel: tecknet '" + bokstav + "' finns inte i morsekoden.";
            }


            resultatText.append(morsekod).append(" ");
        }

        return resultatText.toString().trim();

    }

    public String morstillEngelska(String morseKod) {

        StringBuilder resultatText = new StringBuilder();


        String[] morseBitar = morseKod.split(" ");


        for (String bit : morseBitar) {


            String bokstav = morseTillEng.get(bit);


            if (bokstav == null) {
                return "Fel: morsekoden '" + bit + "' finns inte i tabellen.";
            }


            resultatText.append(bokstav);
        }

        return resultatText.toString();
    }
}
