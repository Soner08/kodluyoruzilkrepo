import java.util.Scanner;

public class ucDortBolunebilen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Sayi giriniz : ");
        int toplam = 0,sayıortalamsı = 0,sayım;
        int sayim = input.nextInt();


        for (int i = 1; i < sayim ; i++) {
            if (i % 3 == 0){
                if (i % 4 == 0){
                    toplam += i;
                    sayıortalamsı++;
                }
            }
        }
        double sonuc = toplam / sayıortalamsı;
        System.out.print("Girdiğiniz sayının ortalaması : " + sonuc);
    }
}
