public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;

        /*if(a == b) {
            //instrukcje
            System.out.println("Liczby sa rowne !!");
        } else if(a == 5 && b == 6) {
            System.out.println("Jest 5 i 6 !!");
        } else if(a == 10 || b == 9) {
            System.out.println("Jest 9 lub 10 !!");
        } else {
            System.out.println("Nie wiem co to za liczby !!");
        }*/

        /*if(a > 10) {
            System.out.println("wieksze od 10 !!");
        } else if (a > 8) {
            System.out.println("wieksze od 8 !!");
        } else {
            System.out.println("Cos !!");
        }*/


        String text = "6";
        switch (text) {
            case "4":
                System.out.println("To jest 4 !!");
                break;
            case "5":
                System.out.println("To jest 5 !!");
                break;
            case "6":
                System.out.println("To jest 6 !!");
                break;
            default:
                System.out.println("Nie wiem co to !!");
                break;
        }


    }
}
