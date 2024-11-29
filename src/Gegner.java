import java.util.Scanner;

public class Gegner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean gameLoop = true;

        while (gameLoop) {
            int input = scanner.nextInt();
            switch (input) {
                case 0:
                    System.out.println("Du hast den Gegner verfehlt!");
                    gameLoop = false;
                    break;
                case 3:
                    System.out.println("Du hast den Gegner Schwach getroffen!");
                    gameLoop = false;
                    break;
                case 4, 5, 6:
                    System.out.println("Du hast den Gegner Normal getroffen!");
                    gameLoop = false;
                    break;
                case 7, 8, 9, 10:
                    System.out.println("Du hast einen KRITISCHEN Treffer gelandet!!!");
                    gameLoop = false;
                    break;
                default:
                    System.out.println("Du bist absolut schlecht");
            }
        }
    }
}
