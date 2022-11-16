import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        int n, r, totaln = 1, totalr = 1, nr, totalnr = 1, result;

        Scanner scan = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz :");
        n = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz :");
        r = scan.nextInt();

        for(int i=1; i<=n; i++){
            totaln = totaln* i ;
        }

        for(int i=1; i<=r; i++){
            totalr = totalr*i ;
        }

        nr= n - r;
        for(int i=1; i<=nr; i++){
            totalnr =totalnr* i ;
        }

        result = totaln/(totalr*totalnr);
        System.out.print("Kombinasyon Sonucu: " + result);
    }
}
