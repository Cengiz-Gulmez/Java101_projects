package Ilkpaket;
import java.util.Scanner;

public class HavaDurumunaGoreEtkinlik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int derece;
        System.out.print("Hava sıcaklığını giriniz:  ");
        derece = input.nextInt();
        if (derece < 5) {
            System.out.println("Kayabilirsiniz.");
        } else if (derece <= 10) {
            System.out.println("sinemaya gidebilirsin.");

        } else if (derece <= 15) {
            System.out.println("sinemaya veya pikniğe gidebilirsin.");
        } else if (derece <= 25) {
            System.out.println("pikniğe gidebilirsin");
        } else {

            System.out.println("yüzmeye gidebilirsiniz");
        }
    }
}






