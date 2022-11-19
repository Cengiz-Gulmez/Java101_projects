package Ilkpaket;
import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Kdv si hesaplanacak turarı giriniz:");
        float tutar = input.nextFloat();
        boolean karsılastırma = tutar >= 1000;
        float kdvoranı= karsılastırma ? 0.08f:0.18f;
        float kdvTutarı=tutar*kdvoranı;
        float toplamTutar= tutar+kdvTutarı;

        System.out.println("tutar:"+tutar);
        System.out.println("kdv oranı:"+kdvoranı);
        System.out.println("kdv turarı:"+kdvTutarı);
        System.out.println("toplam tutar:"+toplamTutar);










    }
}
