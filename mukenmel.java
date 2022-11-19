import java.util.Scanner;

public class mukenmel {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int toplam = 0;

        System.out.print("Mükemmel mi : ");
        int n = input.nextInt();

        for (int i=1; i < n; i++){
            if (n % i == 0)
            {
                toplam += i;
            }
        }
        if (toplam == n)
        {
            System.out.println(n + " Mükemmel .");
        } else {
            System.out.println(n + "Mükemmel değil.");
        }
    }
}
