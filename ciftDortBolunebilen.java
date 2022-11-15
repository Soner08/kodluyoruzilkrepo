import java.util.Scanner;

public class ciftDortBolunebilen {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int k;
        int total = 0;

        do {
            System.out.print("Sayi Giriniz: ");
            k = scan.nextInt();
            if ((k % 4 == 0) && (k % 2 == 0) ){
                total = total+k;
            }
        }while (k%2 == 0);

        System.out.println("Toplami : " + total);

    }
}
