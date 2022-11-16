import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Number;
        System.out.print("Basamak sayısını giriniz: ");
        Number = input.nextInt();

        for (int i = 1; i <= Number; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (21 - 2*i); k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}