import java.util.Scanner;
public class usarname {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);

      System.out.print("Kullanıcı adınız :");
      username = input.nextLine();
      System.out.print("Kullanıcı şifresi :");
      password =input.nextLine();
        if(username.equals("Patika") && password.equals("java1234"))
        {
            System.out.println("Giriş başarılı. :)");
        }

        

    }

}