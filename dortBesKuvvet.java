import  java.util.Scanner;

public class dortBesKuvvet {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int k;
        System.out.print("Bir sayı giriniz:");
        k= input.nextInt();

        System.out.print("4'ün Kuvvetleri: ");
        for(int i = 1;i<=k;i*=4){
        System.out.print(i + ",");
        }
        System.out.println();
        System.out.print("5'in Kuvvetleri: ");
        for(int i=1;i<=k;i*=5){
        System.out.print(i + ",");
        }
    }
}
