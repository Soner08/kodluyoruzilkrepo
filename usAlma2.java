import java.util.Scanner;

public class usAlma2 {
    static int us(int a,int b){
        if(a==1) {
            return 1;
        }
        else if (b==0) {
            return 1;
        }
        else;
        return a*us(a,b-1);
    }

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int a;
        int b;
        System.out.print("Tabanı giriniz : ");
        a= scanner.nextInt();

        System.out.print("Üssü giriniz : ");
        b=scanner.nextInt();

        System.out.print("Sonuç : " +us(a,b));
    }
}

