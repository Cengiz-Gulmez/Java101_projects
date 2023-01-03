package Ilkpaket;

import java.util.Scanner;
public class uslusayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k,l,total=1;
        System.out.print("üssü alınacak sayıyı giriniz:");
        k=input.nextInt();
        System.out.println("üs olacak sayıyı giriniz");
        l=input.nextInt();

        for (int i=1;i<=l;i++){
            total *= k;

        }
        System.out.println("sonuç: "+ total);




    }
}
