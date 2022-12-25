package Ilkpaket;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil=0;
        System.out.println("Artık yıl olup olmadığını öğrenmek istediğiniz yılı giriniz:");
        Scanner input=new Scanner(System.in);
        yil=input.nextInt();

        if ((yil%100 != 0 && yil%4 == 0) || yil%400 == 0){
            System.out.println("sayı artık yıldır.");



        }else {
            System.out.println("sayı artık yıl değildir.");
        }

    }
}
