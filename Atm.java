
import  java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String userName, passworld;
        int right=3;
        int select;
        int balance=1500;

        while (right>0){
            System.out.println("Kullanıcı adınızı giriniz");
            userName=input.nextLine();
            System.out.println("Şifrenizi giriniz");
            passworld=input.nextLine();

            if (userName.equals("patika") && passworld.equals("patika123")){
                System.out.println("kodluyoruz bankasına hoşgeldiniz");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n"+
                            "3-Bakiye Sorma\n"+
                            "4-Çıkış");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select=input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırılacak tutarı giriniz:");
                            int price=input.nextInt();
                            balance += price;
                            System.out.println("İşlem tamamlandı...");
                            break;

                        case 2:
                            System.out.print("Çekilecek tutarı giriniz:");
                            price=input.nextInt();
                            if (price>balance){
                                System.out.println("Yeterli bakiye yok");
                            }else {
                                balance -=price;
                                System.out.println("Paranız çekme işlemi tamamlandı. Yeni bakiye "+ balance + " Tl dir.");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz " + balance + " TL dir");
                            break;

                    }

                }while (select !=4); {
                    System.out.println("Tekrar Görüşmek üzere");
                    break;

                }
            }else {
                right--;
                System.out.println("Hatalı giriş yaptınız..");
                if (right==0){
                    System.out.println("çok fazla hatalı giriş yaptınız, banka ile iletişime geçin");
                }else {
                    System.out.println("Kalan hakkınız " + right);
                }

            }

        }
    }
}
