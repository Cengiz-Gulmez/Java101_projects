package Ilkpaket;
import java.util.Scanner;

public class DordunKati {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,total=0;
        do {
            System.out.println("bir sayı giriniz");
            n=input.nextInt();
            if (n%4==0){
                total+=n;
                System.out.println("toplam:" + total);

            }


        }while (n%2==0);






    }
}
