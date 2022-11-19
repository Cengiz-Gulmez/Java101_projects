package Ilkpaket;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2,select;
        System.out.print("ilk sayıyı giriniz:");
        n1=input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        n2=input.nextInt();
        System.out.println("Yapılacak işlemi seçiniz:");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select= input.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplam :"+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma :"+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma :"+(n1*n2));
                break;
            case 4:
                if(n2 != 0) {
                    System.out.println("Bölme :" + (n1 / n2));
                }else{
                    System.out.println("0 a bölünme hatası!!!");
                }break;
            default:
                System.out.println("yanlış bir seçim yaptınız");
        }


    }
}