import java.util.Scanner;
public class hipetenüs {
    public static void main(String[] args) {
        //Değişkenleri oluşturdum
        int a,b ;
        double c;
        //Değişkenleri isteyelim.
        Scanner girdi = new Scanner (System.in) ;
    System.out.print("a kenarını giriniz: ");
    a = girdi.nextInt() ;
    System.out.print("b kenarını giriniz: ");
    b = girdi.nextInt();
    c = Math.sqrt((a*a)+(b*b));
    System.out.println("Hipetenüs :" + c);
    }
}
