import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        int number, max = 99999, min = -999999;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayi gireceksiniz : ");
        int n = input.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.print("Sayiyi giriniz : ");
            number = input.nextInt();

            if (i == 1) {
                min = number;
                max = number;
            }
            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("************");
        System.out.print("En kücük sayı: " + min);

    }
}
