import java.util.Scanner;

public class dersnot {
    public static void main(String[] args) {
    int matematik, fizik, turkce, kimya, muzik;
    int aldığınnot = 0;
    int toplamDers = 0;

    Scanner input=new Scanner(System.in);
        System.out.print("Matematik notunuz :");
        matematik =input.nextInt();
        if(!(matematik <= 0 || matematik > 100)) {
            aldığınnot += matematik;
            toplamDers++;
        }

        System.out.print("Fizik notunuz :");
        fizik =input.nextInt();
        if(!(fizik <= 0 || fizik > 100)) {
            aldığınnot += fizik;
            toplamDers++;
        }
        System.out.print("Turkce notunuz :");
        turkce=input.nextInt();
        if(!(turkce <= 0 || turkce > 100)) {
            aldığınnot += turkce;
            toplamDers++;
        }

        System.out.print("Kimya notunuz :");
        kimya =input.nextInt();
        if(!(kimya <= 0 || kimya > 100)) {
            aldığınnot+= kimya;
            toplamDers++;
        }


        System.out.print("Muzik notunuz :");
        muzik =input.nextInt();
        if(!(muzik <= 0 || muzik > 100)) {
            aldığınnot += muzik;
            toplamDers++;
        }

        double avarage = (matematik+fizik+turkce+kimya+muzik)/5 ;
        if (avarage <= 55){
            System.out.print("Sınıfta kaldınız, Seneye görüşmek üzere :");
            System.out.print("Ortalamanız :" + avarage);
        }else{
            System.out.print("Tebrikler sınıvı geçtiniz :");
            System.out.print("Ortalamanız :" + avarage);


        }
    }
}