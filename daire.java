import java.util.Scanner;
public class daire {
    public static void main(String[] args) {

            double pi = 3.14;
            Scanner input = new Scanner(System.in);
            System.out.println("Dairenin yaricapini girin: ");
            int yaricapi = input.nextInt();
            double alan = pi * yaricapi * yaricapi;
            double cevre = 2 * pi * yaricapi;
            System.out.println("Cevresi: " + cevre + "\nAlanı : " + alan );

            System.out.println("Merkez acisini girin : ");
            double aci =input.nextDouble();

            double alan1 = (pi*(yaricapi * yaricapi) * aci) / 360;
            System.out.println("Merkez açıyla alan hesabı: " + alan1);
        }
}
