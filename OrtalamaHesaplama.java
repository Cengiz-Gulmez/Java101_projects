package Ilkpaket;

import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        int mat,fzk,muzik,kimya,turkce,resim;

        System.out.print("Matematik notunuzu girin:  ");
        mat=input.nextInt();

        System.out.print("Fizik notunuzu girin:  ");
        fzk=input.nextInt();

        System.out.print("Müzik notunuzu girin:  ");
        muzik=input .nextInt();

        System.out.print("Kimya notunuzu girin:  ");
        kimya=input.nextInt();

        System.out.print("Türkçe notunuzu girin:  ");
        turkce=input.nextInt();

        System.out.print("Resim notunuzu girin:  ");
        resim=input.nextInt();

        int toplam = mat + fzk + muzik + kimya + turkce + resim;
        float ortalama = toplam/6f ;
        System.out.println(ortalama);

        boolean sonuc= ortalama >=60;
        String str =sonuc ? "Geçtiniz" : "Tekrar Deneyiz :)";
        System.out.println(str);





    }
}
