import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
     double Armut = 2.14,Elma = 3.67 , Domates=1.11,Muz=0.95, Patlican=5.00;
     double armutkg, elmakg,domateskg,muzkg,patlicankg,toplamücret;

    Scanner input = new Scanner (System.in) ;
    System.out.println("Kaç kg armut :");
    armutkg = input.nextDouble();
    System.out.println("Kaç kg elma :");
    elmakg = input.nextDouble();
    System.out.println("Kaç kg domates :");
    domateskg = input.nextDouble();
    System.out.println("Kaç kg muz :");
    muzkg = input.nextDouble();
    System.out.println("Kaç kg patlıcan :");
    patlicankg = input.nextDouble();
    toplamücret= (Armut*armutkg+Elma*elmakg+Domates*domateskg+Muz*muzkg+Patlican*patlicankg);
    System.out.println("Ödemeniz gereken tutar :" +toplamücret);


    }
}
