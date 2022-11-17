import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("N sayını giriniz :");
        int n= scan.nextInt();
        double resault = 0;
        for (int i =1; i<= n;i++){
        resault +=(1.0/i);
        }
        System.out.print("Sonuç :"+resault);

    }
}
