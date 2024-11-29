public class Schleife {
    public static void main(String[] args) {

        for (int i = 100; i > 0; i--) {
            boolean istPrimzahl = true;

            // Überprüfe, ob i eine Primzahl ist
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    istPrimzahl = false;
                    break;
                }
            }

            // Ausgabe basierend auf der Primzahlprüfung
            if (istPrimzahl && i > 1) {
                System.out.println("Ist eine Primzahl: " + i);
            } else {
                System.out.println("Ist keine Primzahl: " + i);
            }
        }
    }
}
