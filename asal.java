import java.util.Scanner;

public class asal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sonuc =  0, k;

        System.out.print("Bir sayı giriniz : ");
        k= scan.nextInt();

        for (int i = 2; i < k; i++) {

            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    sonuc++;
                }
            }
            if (sonuc == 0) {
                System.out.print(i +" , ");
            }
            sonuc = 0;
        }
    }
}
