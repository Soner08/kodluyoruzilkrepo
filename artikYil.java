import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int yıl,artıkyılsonuç;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir yıl girin:");
        yıl=input.nextInt();
        artıkyılsonuç=yıl%4;
        switch (artıkyılsonuç){
            case 0:
                System.out.print("Seçtiğiniz yıl, artık yıl değildir"+ yıl);

            case 1:
                System.out.print("Seçtiğiniz yıl artık yıldır."+ yıl);

            case 2:
                System.out.print("Seçtiğiniz yıl artık yıldır."+ yıl);

            case 3:
                System.out.print("Seçtiğiniz yıl artık yıldır."+ yıl);
        }

    }
}
