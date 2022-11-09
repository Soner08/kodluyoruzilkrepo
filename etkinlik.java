import java.util.Scanner;
public class etkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen sıcaklık giriniz :");
        heat = input.nextInt();
        if (heat < 5){
            System.out.print("Kayak yapabilirsiniz.");
        }else if (heat>=5 && heat<=25) {
            if (heat <15){
                System.out.print("Sinemaya gidebilirsin.");
            }
            if (heat >=10){
                System.out.print("Pikniğe gidebilirsin");
            }
            
        }else{
            System.out.print("Yüzmeye gidebilirsin :)");
        }

    }
}
