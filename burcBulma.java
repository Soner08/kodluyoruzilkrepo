import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        int ay, gün;

        Scanner input = new Scanner(System.in);

        System.out.println("1: Ocak      2: Şubat     3: Mart\n     4: Nisan    5: Mayıs     6: Haziran\n7: Temmuz     8: Agustos     9: Eylül\n    10: Ekim     11: Kasım     12: Aralık");
        System.out.print("Lütfen doğduğunuz ayı giriniz:");
        ay = input.nextInt();
        System.out.print("Lütfen doğduğunuz günü giriniz:");
        gün = input.nextInt();
        if ((ay == 1) && (gün <= 31)) {
            if (gün > 22) {
                System.out.println("Kova");
            } else {
                System.out.println("Oğlak");
            }
        }
        if ((ay == 2) && (gün <= 29)) {
            if (gün > 20) {
                System.out.println("Balık");
            } else {
                System.out.println("Kova");
            }
        }
        if ((ay == 3) && (gün <= 31)) {
            if (gün > 20) {
                System.out.println("Koç");
            } else {
                System.out.println("Balık");
            }
        }
        if ((ay == 4) && (gün <= 30)) {
            if (gün > 20) {
                System.out.println("Boğa");
            } else {
                System.out.println("Koç");
            }
        }
        if ((ay == 5) && (gün <= 31)) {
            if (gün > 21) {
                System.out.println("İkizler");
            } else {
                System.out.println("Boğa");
            }
        }
        if ((ay == 6) && (gün <= 30)) {
            if (gün > 22) {
                System.out.println("Yengeç");
            } else {
                System.out.println("İkizler");
            }
        }
        if ((ay == 7) && (gün <= 31)) {
            if (gün > 22) {
                System.out.println("Aslan");
            } else {
                System.out.println("Yengeç");
            }
        }
        if ((ay == 8) && (gün <= 31)) {
            if (gün > 22) {
                System.out.println("Başak");
            } else {
                System.out.println("Aslan");
            }
        }
        if ((ay == 9) && (gün <= 30)) {
            if (gün > 22) {
                System.out.println("Terazi");
            } else {
                System.out.println("Başak");
            }
        }
        if ((ay == 10) && (gün <= 31)) {
            if (gün > 22) {
                System.out.println("Akrep");
            } else {
                System.out.println("Terazi");
            }
        }
        if ((ay == 11) && (gün <= 30)) {
            if (gün > 21) {
                System.out.println("Yay");
            } else {
                System.out.println("Akrep");
            }
        }
        if ((ay == 12) && (gün <= 31)) {
            if (gün > 21) {
                System.out.println("Oğlak");
            } else {
                System.out.println("Yay");
            }
        }
    }
}