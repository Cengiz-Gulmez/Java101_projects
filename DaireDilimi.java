package Ilkpaket;
import java.util.Scanner;

public class DaireDilimi {
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        double r,angle, pi=3.14,area;
        System.out.print("Daire diliminin yarıçapını giriniz:");
        r= input.nextDouble();
        System.out.print("Daire diliminin açısını giriniz:");
        angle=input.nextDouble();
        area=pi*r*r*angle/360;
        System.out.println("Daire diliminin alanı:"+area);





    }
}
