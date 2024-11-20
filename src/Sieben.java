public class Sieben {
    public static void main(String[] args) {

        int zahl = 26;

        if (zahl%7 == 0 || zahl%13 == 0){
            System.out.println(zahl + " ist Teilbar durch 7 oder du hattest Glück");
        }
        else{
            System.out.println(zahl + " ist nicht Teilbar durch 7");
        }

    }
}
