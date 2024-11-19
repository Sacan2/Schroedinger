public class Wertebereich {

    public static void main(String[] args)
    {
        int testWert = 6255;






        System.out.println("Der erste Wert passt in Long? : "+ (testWert >= Long.MIN_VALUE && testWert <= Long.MAX_VALUE));
        System.out.println("Der zweite Wert passt in int? : "+ (testWert >= Integer.MIN_VALUE && testWert <= Integer.MAX_VALUE));
        System.out.println("Der dritte Wert passt in short? : "+ (testWert >= Short.MIN_VALUE && testWert <= Short.MAX_VALUE));
        System.out.println("Der vierte Wert passt in byte? : "+ (testWert >= Byte.MIN_VALUE && testWert <= Byte.MAX_VALUE));




    }

}
