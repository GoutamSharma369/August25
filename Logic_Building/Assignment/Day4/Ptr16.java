package Assignment4;

public class Ptr16 {
    public static void main(String[] args) {

        for (int i = 2; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);

                if (j < i)
                    System.out.print("*");
            }

            System.out.println();
        }
    }
}