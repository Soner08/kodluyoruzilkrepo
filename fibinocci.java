import java.util.Scanner;

public class fibinocci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen eleman sayısını giriniz : ");
        int num= input.nextInt();

        int num1 =0, num2 =1;
        System.out.print(num1 + " + " + num2 +" ");
        int num3 =num1+num2;

        for(int i = 0; i < num; i++){
            System.out.print(", " +num3 );
            num1 = num2;
            num2 = num3;
            num3 = num1 +num2;



        }


    }
}
