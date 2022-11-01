import java.util.Scanner;


public class Kdv {
    public static void main(String[] args) {

        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar ;

        Scanner inp= new Scanner(System.in);

        System.out.println("Ücret tutarını giriniz : ");
        tutar=inp.nextDouble();
        boolean kdv= (1000>tutar);
        kdvTutar= tutar * kdvOran;
        kdvliTutar=kdvTutar + tutar;

        System.out.println("KDV'siz tutar : " +tutar);
        System.out.println("KDV oranı : " +kdvOran);
        System.out.println("KDV tutarı : " +kdvTutar);
        System.out.println("KDV'li tutar : " +kdvliTutar);

    }
}
