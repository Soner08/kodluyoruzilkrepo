import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right >= 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

          switch (userName.equals("patika") && password.equals("dev123")) {
              case 1:
                  System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
              case 2:
                  right--;
                  System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

              case 3:
                  right--;
                  System.out.println("Kalan Hakkınız : " + right);
              case 4:
                  right == 0;
                  System.out.println("Kartınız bloke oldu. Üzgünüz.");
                do {
                    System.out.println("1-Bakiye Sorgula\n" +
                            "2-Para Çekme\n" +
                            "3-Para yatırma\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    int price;
                    switch (select) {
                            case 1:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                            case 2:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                            case 3:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            break;

                            case 4:
                            break;
                            default:
                            System.out.println("Hatalı seçim.");
                    }

                } while (select != 4);
                System.out.println("İYİ GÜNLER!.");
                break;
            }

                }
            }
        }



