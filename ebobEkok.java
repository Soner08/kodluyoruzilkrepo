import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz: ");
        int num1 = scan.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        int num2 = scan.nextInt();

        int ebob = 1, i = 1;

        while (i <= num1) {
            i++;

            if(num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + (num1 * num2) / ebob);
    }
}
