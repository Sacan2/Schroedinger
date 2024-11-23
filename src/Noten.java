public class Noten {
    public static void main(String[] args) {
        int note = 4;
        String notealsString = "GuT";



        switch(notealsString.toLowerCase()){
            case "sehr gut":
                System.out.println(1);
                break;
            case "gut":
                System.out.println(2);
                break;
            case "befriedigend":
                System.out.println(3);
                break;
            case "ausreichend":
                System.out.println(4);
                break;
            case "mangelhaft":
                System.out.println(5);
                break;
            case "ungenügend":
                System.out.println(6);
                break;
            default:
                System.out.println("Mach eine Zahl von 1 bis 6 IDIOT!!!");
        }


    }
}
