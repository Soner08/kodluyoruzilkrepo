import java.util.Scanner;
import java.util.Arrays;


public class Sırala {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Kaç adet sayı gieceksiniz : ");
            int s = scanner.nextInt();

            int[] list = new int[s];

            for (int i = 0; i < s; i++) {
                System.out.print((i + 1) + ". Elemanı : ");
                list[i] = scanner.nextInt();
            }
            Arrays.sort(list);
            System.out.println("Sıralama : " + Arrays.toString(list));
    }
}
