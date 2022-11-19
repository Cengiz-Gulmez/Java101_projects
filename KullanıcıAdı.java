package Ilkpaket;
import java.util.Scanner;

public class KullanıcıAdı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, newpassword;
        int value=0;
        System.out.println("kullanıcı adınızı giriniz:");
        username = input.nextLine();
        System.out.println("şifrenizi giriniz:");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("giriş yaptınız...");
        } else {
            System.out.println("Hatalı giriş yaptınız.");
            System.out.println("yeni şifre için 1 e bas:");
            value= input.nextInt();

            }
        if (value==1){
            System.out.println("yeni şifrenizi giriniz");
            newpassword= input.nextLine();
            if (newpassword.equals(password) || newpassword.equals("java123")){
                System.out.println("hatalı seçim");
            }else {
                System.out.println("şifre başarı ile değiştirildi");
            }

        }

    }
}
