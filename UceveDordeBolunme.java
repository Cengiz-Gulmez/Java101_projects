package Ilkpaket;
import java.util.Scanner;

public class UceveDordeBolunme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k,sum=0,j=-1;
        System.out.print("bir sayı giriniz");
        k=input.nextInt();
        for (int i=0;i<=k;i++){
            if (i%3==0 && i%4==0){
                j += 1;
                sum += i;

            }


        }
        System.out.println("3 e ve 4 e bölünen sayıların ortalaması " + (sum/j));




    }
}
