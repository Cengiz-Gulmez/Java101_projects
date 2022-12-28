package Ilkpaket;
import java.util.Scanner;

public class DortVeBes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k;
        System.out.print("bir sayı giriniz:");
        k=input.nextInt();
        System.out.println("4 ün katları");
        for (int i=1;i<k;i*=4){
            System.out.println(i);

        }
        System.out.println("5 in katları");
        for (int i=1;i<k;i*=5){
            System.out.println(i);
        }
    }
}
