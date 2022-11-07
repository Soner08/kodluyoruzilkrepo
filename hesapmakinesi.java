import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        int n1,n2, select;
        Scanner input= new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçimiz :");
        select = input.nextInt();
        switch (select){
            case 1:System.out.println("Toplama = "+ (n1 + n2));break;
            case 2:System.out.println("Cikarma = "+ (n1 - n2));break;
            case 3:System.out.println("Carpma = "+ (n1 * n2));break;
            case 4:System.out.println("Bölme = "+ (n1 / n2));break;

        }


    }
}
