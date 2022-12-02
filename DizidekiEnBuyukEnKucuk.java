import java.util.Scanner;
import java.util.Arrays;
public class DizidekiEnBuyukEnKucuk {
    public static void main(String[] args) {
        int[] sıra={2,55,-43,89,0,44};


        int min = sıra[0];
        int max = sıra[0];

        for (int i : sıra) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
    }
}
