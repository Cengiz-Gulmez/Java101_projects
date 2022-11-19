package Ilkpaket;
import java.util.Scanner;

public class UcgenAlanı {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double a,b,c,u,alan;
        System.out.println("üçgenin kenar uzunluklarını giriniz:");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("üçgenin alanı:"+alan);






    }
}
