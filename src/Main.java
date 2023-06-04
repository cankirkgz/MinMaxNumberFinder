import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int max;
        int min;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int number = input.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}