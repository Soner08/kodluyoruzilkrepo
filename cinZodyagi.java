import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        int yıl;

        System.out.print("Doğum tarihini girin :");
        yıl = inp.nextInt();
        yıl = yıl % 12;

        switch (yıl){
            case 0:
                System.out.print("Çin burcunuz : Maymun");
                break;

            case 1:
                System.out.print("Çin burcunuz : Horoz");
                break;

            case 2:
                System.out.print("Çin burcunuz : Köpek");
                break;

            case 3:
                System.out.print("Çin burcunuz : Domuz");
                break;

            case 4:
                System.out.print("Çin burcunuz : Fare");
                break;

            case 5:
                System.out.print("Çin burcunuz : Öküz");
                break;

            case 6:
                System.out.print("Çin burcunuz : Kaplan");
                break;

            case 7:
                System.out.print("Çin burcunuz : Tavşan");
                break;

            case 8:
                System.out.print("Çin burcunuz : Ejderha");
                break;

            case 9:
                System.out.print("Çin burcunuz : Yılan");
                break;

            case 10:
                System.out.print("Çin burcunuz : At");
                break;

            case 11:
                System.out.print("Çin burcunuz : Koyun");
                break;
        }
    }
}
