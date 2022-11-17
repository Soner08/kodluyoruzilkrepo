import java.util.Scanner;

public class basamakTopla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0, sayı;
        System.out.print("Sayı Giriniz: ");
        sayı = scan.nextInt();

        while(sayı != 0) {
            toplam = (sayı % 10) + toplam;
            sayı /= 10;
        }
        System.out.println("Basamakların toplamı: " + toplam);

    }
}





