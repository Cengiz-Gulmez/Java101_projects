package Ilkpaket;
import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        double boy,kilo;
        Scanner input=new Scanner(System.in);
        System.out.print("Boyunuzu giriniz(m):");
        boy=input.nextDouble();
        System.out.print("Kilonuzu giriniz(kg):");
        kilo=input.nextDouble();
        System.out.println("vücut kitle endeksiniz: "+ (kilo/(boy*boy)));






    }
}
