import java.util.Scanner;
public class vucutkitle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz :");

        double boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");

        double kg = input.nextDouble();

        double endeks = (boy*boy) / kg ;
        System.out.printf("Vucut kitle endeksi :" + endeks);
    }
}
