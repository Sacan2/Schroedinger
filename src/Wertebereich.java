public class Wertebereich {

    public static void main(String[] args)
    {
        int ersterTest = 1;
        boolean zweiterTest = true;
        float dritterTest = 3.001F;





        System.out.println("Der erste Wert passt in Long? : "+ (ersterTest >= Long.MIN_VALUE && ersterTest <= Long.MAX_VALUE));
        System.out.println(ersterTest);

        Typetester typetester = new Typetester();
        typetester.printType(ersterTest);

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