package Ilkpaket;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double  armut,elma,domates,muz,patlıcan,toplam ;
        /*
        armut=2,14
        elma=3,67
        domates=1,11
        muz=0,95
        patlıcan=5*/

        System.out.println("Armut kg fiyatını giriniz:");
        armut= input.nextDouble();
        System.out.println("Elma kg fiyatını giriniz:");
        elma= input.nextDouble();
        System.out.println("Domates kg fiyatını giriniz:");
        domates= input.nextDouble();
        System.out.println("Muz kg fiyatını giriniz:");
        muz= input.nextDouble();
        System.out.println("Patlıcan kg fiyatını giriniz:");
        patlıcan= input.nextDouble();

        armut= armut*2.14;
        elma= elma*3.67 ;
        domates= domates*1.11 ;
        muz= muz*0.95 ;
        patlıcan= patlıcan*5 ;
        toplam= armut + elma + domates + muz + patlıcan;
        System.out.println(toplam);


    }
}
