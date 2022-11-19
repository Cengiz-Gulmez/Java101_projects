package Ilkpaket;

import java.util.Scanner;


public class TaksimetreProgramı {
    public static void main (String[] args ) {

        Scanner input=new Scanner(System.in);
        int yolkm;
        double tutar;
        System.out.print("Kaç km yol gidileceğğini giriniz:");
        yolkm= input.nextInt();
        tutar=(2.2*yolkm)+10;
        tutar=(tutar>20) ? tutar:20;
        System.out.println(tutar);





    }


}
