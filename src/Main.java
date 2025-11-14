import java.util.Scanner;

void main() {
    Scanner tangentbord = new Scanner(System.in);
    Morseöversättare översättare = new Morseöversättare();

    while (true) {
        System.out.println(" Morseprogram ");
        System.out.println("1. Engelska till morse");
        System.out.println("2. Morse till engelska");
        System.out.println("3. Avsluta");
        System.out.print("Välj ett alternativ: ");

        String val = tangentbord.nextLine();

        if (val.equals("1")) {
            System.out.print("Skriv in text att översätta: ");
            String text = tangentbord.nextLine();

            String resultat = översättare.engelskatillMorse(text);
            System.out.println("Morsekod: " + resultat);

        } else if (val.equals("2")) {
            System.out.print("Skriv in morsekod att översätta: ");
            String morsekod = tangentbord.nextLine();

            String resultat = översättare.morstillEngelska(morsekod);
            System.out.println("Engelsk text: " + resultat);

        } else if (val.equals("3")) {
            System.out.println("Avslutar programmet...");
            break;

        } else {
            System.out.println("Fel: Ogiltigt val, försök igen!");
        }
    }
}


