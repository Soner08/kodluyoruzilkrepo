import  java.util.Scanner;

public class asal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int a = input.nextInt();
        asal2(a);
    }
    static void asal2(int a) {

        int sayac = 0;
        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                sayac++;
            }
        }

        if (sayac > 0) {
            System.out.println("Asal değildir!!");

        } else {
            System.out.println("Asal sayıdır.");
        }
    }
}








