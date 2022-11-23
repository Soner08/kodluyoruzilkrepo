import java.util.Scanner;

public class desen {
    static void desen(int istenenSAYI, boolean varılan, int düzelen){
    System.out.print(istenenSAYI + " ");
    int result = 0;
    if (varılan) {
        if (istenenSAYI <= 0) {
            varılan = false;
            desen(istenenSAYI + 5, varılan, düzelen);
        } else {
            desen(istenenSAYI - 5, varılan, düzelen);
        }
    } else {
        if (düzelen == istenenSAYI) {
            return;
        } else {
            desen(istenenSAYI + 5, varılan, düzelen);
        }

    }

}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int istenenS = scanner.nextInt();
        
        boolean varılan = true;
        int düzelen = istenenS;

        desen(istenenS, varılan,düzelen);

    }
}

