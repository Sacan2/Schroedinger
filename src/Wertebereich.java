public class Wertebereich {

    public static void main(String[] args)
    {
        int testWert = 6255;






        System.out.println("Der erste Wert passt in Long? : "+ (testWert >= Long.MIN_VALUE && testWert <= Long.MAX_VALUE));
        System.out.println("Der zweite Wert passt in int? : "+ (testWert >= Integer.MIN_VALUE && testWert <= Integer.MAX_VALUE));
        System.out.println("Der dritte Wert passt in short? : "+ (testWert >= Short.MIN_VALUE && testWert <= Short.MAX_VALUE));
        System.out.println("Der vierte Wert passt in byte? : "+ (testWert >= Byte.MIN_VALUE && testWert <= Byte.MAX_VALUE));


        Typetester typetester = new Typetester();

    }

}
class Typetester {
    void printType(byte x) {
        System.out.println(x + " is an byte");
    }
    void printType(int x) {
        System.out.println(x + " is an int");
    }
    void printType(float x) {
        System.out.println(x + " is an float");
    }
    void printType(double x) {
        System.out.println(x + " is an double");
    }
    void printType(char x) {
        System.out.println(x + " is an char");
    }
}