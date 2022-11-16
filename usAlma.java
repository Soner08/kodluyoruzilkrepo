import java.util.Scanner;

public class usAlma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k,r,total=1;
        
        System.out.print("Bir sayı giriniz :");
        k=scan.nextInt();

        System.out.print("Üssü giriniz :");
        r=scan.nextInt();

        for (int i=1;i<=r;i++){
            total*=k;
        }

        System.out.print("Sonuç :"+total);

    }
}
