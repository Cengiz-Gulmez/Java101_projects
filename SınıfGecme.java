package Ilkpaket;
import java.util.Scanner;



public class SınıfGecme {
    public static void main(String[] args) {
        int turkce,mat,fizik,muzik,kimya;
        Scanner input=new Scanner(System.in);
        System.out.print("matematik notunuz:");
        mat=input.nextInt();
        System.out.print("Türkçe notunuz:");
        turkce=input.nextInt();
        System.out.print("fizik notunuz:");
        fizik=input.nextInt();
        System.out.print("müzik notunuz:");
        muzik=input.nextInt();
        System.out.print("kimya notunuz:");
        kimya=input.nextInt();

        if(mat<0 || mat>100){
            mat=0;
        }
        if(turkce<0 || turkce>100){
            turkce=0;
        }
        if(fizik<0 || fizik>100){
            fizik=0;
        }
        if(muzik<0 || muzik>100){
            muzik=0;
        }
        if(kimya<0 || kimya>100){
            kimya=0;
        }

        double average=(turkce+mat+fizik+muzik+kimya)/5;

        if (average<55){
            System.out.println("Tebrikler kaldınız.lol");

    }else {
            System.out.println("geçtiniz");
        }

        System.out.println(average);
    }

}
