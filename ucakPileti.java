import java.util.Scanner;

public class ucakPileti {
    public static void main(String[] args) {
        int km, yaş,gidişDönüş;
        double ödenecekTutar, kmÜcreti;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen kaç km yolgideceksiniz, giriniz:");
        km =input.nextInt();
        kmÜcreti=km*0.10;

        System.out.print("Kaç yaşındasınız:");
        yaş= input.nextInt();

        System.out.print("Sadece gidiş için 1'i, gidiş-dönüş için 2'yi seçin:");
        gidişDönüş= input.nextInt();

        if (gidişDönüş==1){
            if ((yaş>0)&&(yaş<12)){
                ödenecekTutar=kmÜcreti*0.5;
                System.out.print("Ödenecek tutar:"+ödenecekTutar+"Tl");
            } else if ((yaş>=12)&&(yaş<24)) {
                ödenecekTutar=kmÜcreti*0.9;
                System.out.print("Ödenecek tutar:"+ödenecekTutar+"Tl");
                
            }else if ((yaş<65)&&(yaş>24)){
                ödenecekTutar=kmÜcreti*0.10;
                System.out.print("Ödenecek tutar:"+ödenecekTutar+"Tl");

            }else if (yaş>65) {
                ödenecekTutar=kmÜcreti*0.9;
                System.out.print("Ödenecek tutar:"+ödenecekTutar+"Tl");
            }else {
                System.out.print("Hatalı İşlem Yapıldı! Lütfen Tekrar Deneyiniz.");
            }
        }if (gidişDönüş==2){
            if ((yaş>0)&&(yaş<12)){
                ödenecekTutar=(2*kmÜcreti)*0.5*0.8;
                System.out.print("Ödenecek tutar:"+ödenecekTutar+"Tl");
        }else if ((yaş>=12)&&(yaş<24)) {
                ödenecekTutar=(2*kmÜcreti)*0.9*0.8;
                System.out.print("Ödenecek tutar:"+ödenecekTutar+"Tl");


        }else if ((yaş<65)&&(yaş>24)){
                ödenecekTutar=(2*kmÜcreti)*0.10*0.8;
                System.out.print("Ödenecek tutar:"+ödenecekTutar+"Tl");

            } else if (yaş>65) {
            ödenecekTutar=(2*kmÜcreti)*0.9*0.8;
                System.out.print("Ödenecek tutar:"+ödenecekTutar+"Tl");
        }else {
            System.out.print("Hatalı İşlem Yapıldı! Lütfen Tekrar Deneyiniz.");
        }
    }}
}
