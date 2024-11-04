import java.io.IOException;
import java.util.Scanner;

public class WoWTextAdventure {
    public static void main(String[] args) throws IOException {
        System.out.println("Willkommen in World of Warcraft. Du befindest dich im Dorf Buxelknuxel.");
        System.out.println("Verwende 'N' , 'O', 's' oder 'W', um dich zu bewegen mit 'I' rufst du das Iventar auf.");
        System.out.println("Mit 'Q' beendest du das Spiel");
        Scanner scanner = new Scanner(System.in);

       String eingabe = scanner.nextLine();

        switch (eingabe.toLowerCase()){
            case "n" -> {
                System.out.println("hello");
            }
            case "d" -> {
                System.out.println("be");
            }


        }
    }
}
