public class Noten {
    public static void main(String[] args) {
        int note = 4;
        String notealsString = "Gut";



        switch(notealsString){
            case "Sehr gut":
                System.out.println(1);
                break;
            case "Gut":
                System.out.println(2);
                break;
            case "Befriedigend":
                System.out.println(3);
                break;
            case "Ausreichend":
                System.out.println(4);
                break;
            case "Mangelhaft":
                System.out.println(5);
                break;
            case "Ungenügend":
                System.out.println(6);
                break;
            default:
                System.out.println("Mach eine Zahl von 1 bis 6 IDIOT!!!");
        }


    }
}
