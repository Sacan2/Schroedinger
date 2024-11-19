import java.io.IOException;
import java.util.Scanner;

public class WoWTextAdventure {
    public static void main(String[] args) throws IOException {
        System.out.println("Willkommen in World of Warcraft. Du befindest dich im Dorf Buxelknuxel.");
        System.out.println("Verwende 'N' , 'O', 'S' oder 'W', um dich zu bewegen mit 'I' rufst du das Iventar auf.");
        System.out.println("Mit 'Q' beendest du das Spiel");
        Scanner scanner = new Scanner(System.in);
        String[] iventar = null;
        boolean gameScheleife = true;
        while (gameScheleife) {
            String eingabe = scanner.nextLine();
            switch (eingabe.toLowerCase()) {
                case "n" -> {
                    System.out.println("Du geht nach Norden");
                }
                case "o" -> {
                    System.out.println("Du gehst nach Osten");
                }
                case "s" -> {
                    System.out.println("Du geht nach Süden");
                }
                case "w" -> {
                    System.out.println("Du geht nach Westen");
                }
                case "i" -> {
                    System.out.println("In deinem Iventar befinde sich:");
                    if (iventar == null) {
                        System.out.println("Du hast keine Items");
                    } else {
                        System.out.println("Du hast diese items:");
                    }
                }
                case "q" -> {
                    System.out.print
                            ("Auf Wiedersehen!");
                    gameScheleife = false;
                }
            }
        }
    }
}
