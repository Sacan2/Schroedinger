public class Wertebereich {

    public static void main(String[] args)
    {
        int ersterTest = 1;
        Long zweiterTest = 502220L;
        float dritterTest = 3.002221F;
        int vierterTest = 5224;





        System.out.println("Der erste Wert passt in Long? : "+ (ersterTest >= Long.MIN_VALUE && ersterTest <= Long.MAX_VALUE));
        System.out.println("Der zweite Wert passt in short? : "+ (zweiterTest >= Short.MIN_VALUE && zweiterTest <= Short.MAX_VALUE));
        System.out.println("Der dritte Wert passt in double? : "+ (dritterTest >= Double.MIN_VALUE && dritterTest <= Double.MAX_VALUE));
        System.out.println("Der vierte Wert passt in byte? : "+ (vierterTest >= Byte.MIN_VALUE && vierterTest <= Byte.MAX_VALUE));


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