import java.util.Scanner;

public class Gegner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        switch (input) {
            case 0:
                System.out.println("Du hast den Gegner verfehlt!");
                break;
            case 1,2,3:
                System.out.println("Du hast den Gegner Schwach getroffen!");
                break;
            case 4,5,6:
                System.out.println("Du hast den Gegner Normal getroffen!");
                break;
            case 7,8,9,10:
                System.out.println("Du hast einen KRITISCHEN Treffer gelandet!!!");
                break;
            default:
                System.out.println("Du bist absolut schlecht");
        }
    }
}
