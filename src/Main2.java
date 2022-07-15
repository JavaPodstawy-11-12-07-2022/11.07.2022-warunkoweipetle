public class Main2 {
    public static void main(String[] args) {

        for(int i = 0, j = 10; i < 10; i++, j--) {
            System.out.println("Moje i: " + i);
            System.out.println("Moje j: " + j);
        }

        int[] tab = {1,2,3,5,8,13};

        for(int element : tab) {
            System.out.println("Kolejny element: " + element);
        }

        int a = 2;
        while(a > 3) {
            System.out.println("Cos");
            a = a - 2;
        }

        do {
            //kod
        } while (true);


    }
}
